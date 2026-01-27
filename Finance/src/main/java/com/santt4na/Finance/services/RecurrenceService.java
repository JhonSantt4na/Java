package com.santt4na.Finance.services;

import com.santt4na.Finance.entity.Recurrence;
import com.santt4na.Finance.entity.Transaction;
import com.santt4na.Finance.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class RecurrenceService {
	
	private final TransactionRepository transactionRepository;
	private final AccountService accountService;
	
	public void processRecurringTransactions(LocalDate today) throws Exception {
		
		if (today == null) {
			throw new IllegalArgumentException("Date cannot be null");
		}
		
		List<Transaction> recurringTransactions =
			transactionRepository.findAllActiveRecurring();
		
		for (Transaction transaction : recurringTransactions) {
			
			LocalDate nextDate = calculateNextDate(transaction);
			
			if (!nextDate.isEqual(today)) {
				continue;
			}
			
			Transaction newTransaction = new Transaction();
			newTransaction.setDescription(transaction.getDescription());
			newTransaction.setAmount(transaction.getAmount());
			newTransaction.setDate(today);
			newTransaction.setType(transaction.getType());
			newTransaction.setAccount(transaction.getAccount());
			
			transactionRepository.save(newTransaction);
			
			accountService.updateBalance(
				transaction.getAccount(),
				transaction.getAmount()
			);
			
			transaction.setDate(today);
			transactionRepository.save(transaction);
		}
	}
	
	public LocalDate calculateNextDate(Transaction transaction) {
		
		if (transaction == null) {
			throw new IllegalArgumentException("Transaction cannot be null");
		}
		
		Recurrence recurrence = transaction.getRecurrence();
		
		if (recurrence == null || !recurrence.isActive()) {
			throw new IllegalStateException("Transaction has no active recurrence");
		}
		
		LocalDate lastDate = transaction.getDate();
		
		if (lastDate == null) {
			throw new IllegalStateException("Transaction date cannot be null");
		}
		
		return switch (recurrence.getFrequency()) {
			case ONCE -> null;
			case DAILY -> lastDate.plusDays(1);
			case WEEKLY -> lastDate.plusWeeks(1);
			case MONTHLY -> adjustMonthlyDate(lastDate);
			case YEARLY -> lastDate.plusYears(1);
		};
	}
	
	private LocalDate adjustMonthlyDate(LocalDate baseDate) {
		LocalDate nextMonth = baseDate.plusMonths(1);
		int day = Math.min(
			baseDate.getDayOfMonth(),
			nextMonth.lengthOfMonth()
		);
		return nextMonth.withDayOfMonth(day);
	}
}
