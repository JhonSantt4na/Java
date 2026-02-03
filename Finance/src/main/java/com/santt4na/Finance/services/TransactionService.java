package com.santt4na.Finance.services;

import com.santt4na.Finance.Enums.Frequency;
import com.santt4na.Finance.Enums.Status;
import com.santt4na.Finance.Enums.TypeTransaction;
import com.santt4na.Finance.entity.Account;
import com.santt4na.Finance.entity.Recurrence;
import com.santt4na.Finance.entity.Transaction;
import com.santt4na.Finance.entity.User;
import com.santt4na.Finance.repository.AccountRepository;
import com.santt4na.Finance.repository.TransactionRepository;
import com.santt4na.Finance.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.List;
import java.util.Objects;

@Log
@Service
@AllArgsConstructor
public class TransactionService {
	
	private final TransactionRepository transactionRepository;
	private final UserRepository userRepository;
	private final AccountRepository accountRepository;
	
	private final RecurrenceService recurrenceService;
	private final AccountService accountService;
	
	@Transactional
	public Transaction createTransaction(Long userId, Long accountId, Transaction transaction ) throws Exception {
		
		if (userId == null || accountId == null || transaction == null){
			throw new Exception("Data cannot be null");
		}
		
		User userFound = userRepository.findById(userId)
			.orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
		
		Account accountFound = accountRepository.findById(accountId)
			.orElseThrow(() -> new RuntimeException("Account not found with id: " + accountId));
		
		if (!Objects.equals(accountFound.getUser().getId(), userFound.getId())) {
			throw new RuntimeException("This account is not associated with the user");
		}
		
		Transaction newTransaction = new Transaction();
		newTransaction.setAccount(accountFound);
		newTransaction.setUser(userFound);
		
		newTransaction.setDate(
			transaction.getDate() != null ? transaction.getDate() : LocalDate.now()
		);
		newTransaction.setDescription(transaction.getDescription());
		newTransaction.setType(transaction.getType());
		newTransaction.setAmount(transaction.getAmount());
		newTransaction.setStatus(Status.PENDING);
		
		if (transaction.getRecurrence() != null) {
			Recurrence recurrenceInput = transaction.getRecurrence();
			
			if (recurrenceInput.getFrequency() == null) {
				throw new IllegalArgumentException("Recurrence frequency is required");
			}
			
			if (recurrenceInput.getFrequency() == Frequency.ONCE) {
				throw new IllegalArgumentException("ONCE is not a valid recurrence");
			}
			
			Recurrence newRecurrence = new Recurrence();
			newRecurrence.setFrequency(recurrenceInput.getFrequency());
			newRecurrence.setActive(true);
			
			newRecurrence.setTransaction(newTransaction);
			newTransaction.setRecurrence(newRecurrence);
		}
		
		BigDecimal amount = transaction.getAmount();
		
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Transaction amount must be greater than zero");
		}
		
		BigDecimal signedAmount;
		
		switch (transaction.getType()) {
			case INCOME -> signedAmount = amount;
			case EXPENSE -> signedAmount = amount.negate();
			default -> throw new IllegalStateException("Invalid transaction type");
		}
		
		accountService.updateBalance(
			transaction.getAccount(),
			signedAmount
		);
		
		Transaction savedTransaction = transactionRepository.save(newTransaction);
		log.info(
			"Transaction created successfully. TransactionId: " + savedTransaction.getId() +
				", UserId: "+ savedTransaction.getUser().getId() +
				", AccountId: " + savedTransaction.getAccount().getId());
		
		return savedTransaction;
	};
	
	// falta
	public List<Transaction> listTransactionsByMonth(Long userId, YearMonth month){
		return List.of();
	};
	
	@Transactional
	public void markAsPaid(Long transactionId, Long userId) throws Exception {
		
		if (transactionId == null || userId == null) {
			throw new IllegalArgumentException("TransactionId and UserId cannot be null");
		}
		
		Transaction transaction = transactionRepository.findById(transactionId)
			.orElseThrow(() ->
				new RuntimeException("Transaction not found with id: " + transactionId));
		
		User user = userRepository.findById(userId)
			.orElseThrow(() ->
				new RuntimeException("User not found with id: " + userId));
		
		if (!Objects.equals(transaction.getUser().getId(), user.getId())) {
			throw new RuntimeException("This account is not associated with the user");
		}
		
		if (transaction.getStatus() == Status.PAID) {
			throw new IllegalStateException("Transaction is already paid");
		}
		
		BigDecimal amount = transaction.getAmount();
		
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Transaction amount must be greater than zero");
		}
		
		BigDecimal signedAmount;
		
		switch (transaction.getType()) {
			case INCOME -> signedAmount = amount;
			case EXPENSE -> signedAmount = amount.negate();
			default -> throw new IllegalStateException("Invalid transaction type");
		}
		
		accountService.updateBalance(transaction.getAccount(), signedAmount);
		
		transaction.setStatus(Status.PAID);
		transaction.setDate(LocalDate.now());
		
		userRepository.save(user);
		transactionRepository.save(transaction);
		
		log.info( "Transaction paid successfully | transactionId= "+ transaction.getId() + " | userId= " + user.getId()  + " | value=" + signedAmount);
	}
	
	@Transactional
	public void generateNextMonthRecurringTransactions(Long userId) {
		
		if (userId == null) {
			throw new IllegalArgumentException("UserId cannot be null");
		}
		
		User user = userRepository.findById(userId)
			.orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
		
		List<Transaction> transactions =
			transactionRepository.findAllActiveRecurring();
		
		for (Transaction transaction : transactions) {
			
			if (!Objects.equals(transaction.getUser().getId(), user.getId())) {
				continue;
			}
			
			Recurrence recurrence = transaction.getRecurrence();
			
			if (recurrence.getFrequency() == Frequency.ONCE) {
				continue;
			}
			
			LocalDate nextDate = recurrenceService.calculateNextDate(transaction);
			
			boolean alreadyExists = transactionRepository.existsByUserIdAndAccountIdAndDateAndRecurrence(
					user.getId(), transaction.getAccount().getId(), nextDate, recurrence);
			
			if (alreadyExists) {
				continue;
			}
			
			Transaction nextTransaction = new Transaction();
			nextTransaction.setUser(user);
			nextTransaction.setAccount(transaction.getAccount());
			nextTransaction.setType(transaction.getType());
			nextTransaction.setAmount(transaction.getAmount());
			nextTransaction.setDescription(transaction.getDescription());
			nextTransaction.setDate(nextDate);
			nextTransaction.setStatus(Status.PENDING);
			nextTransaction.setRecurrence(recurrence);
			
			transactionRepository.save(nextTransaction);
			
			log.info("Recurring transaction generated. OriginalId: " +transaction.getId() +", NewDate: "+ nextDate);
		}
	}
}