package com.santt4na.Finance.repository;

import com.santt4na.Finance.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
	
	List<Transaction> findByUserId(Long Id);
	List<Transaction> findByUserIdAndDateBetween(
		Long userId,
		LocalDate start,
		LocalDate end
	);
	List<Transaction> findByUserIdAndRecurringTrue();
}