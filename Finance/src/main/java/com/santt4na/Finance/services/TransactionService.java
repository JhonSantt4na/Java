package com.santt4na.Finance.services;

import com.santt4na.Finance.Enums.Frequency;
import com.santt4na.Finance.Enums.Status;
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
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
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
		
		BigDecimal amount = newTransaction.getAmount();
		
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Transaction amount must be greater than zero");
		}
		
		if (newTransaction.getStatus() == Status.PAID) {
			BigDecimal signedAmount;
			
			switch (newTransaction.getType()) {
				case INCOME -> signedAmount = amount;
				case EXPENSE -> signedAmount = amount.negate();
				default -> throw new IllegalStateException("Invalid transaction type");
			}
			
			accountService.updateBalance(
				newTransaction.getAccount(),
				signedAmount
			);
			
			log.info("Account balance updated. Account : " + newTransaction.getAccount().getId()
				+", Amount : " + signedAmount);
		}
		
		Transaction savedTransaction = transactionRepository.save(newTransaction);
		log.info(
			"Transaction created successfully. TransactionId: " + savedTransaction.getId() +
				", UserId: "+ savedTransaction.getUser().getId() +
				", AccountId: " + savedTransaction.getAccount().getId());
		
		return savedTransaction;
	};
	
	
	List<Transaction> listTransactionsByMonth(
		UUID userId,
		YearMonth month
	);
	
	void markAsPaid(
		UUID transactionId,
		UUID userId
	);
	
	void generateNextMonthRecurringTransactions(
		UUID userId
	);
	
}