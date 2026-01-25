package com.santt4na.Finance.repository;

import com.santt4na.Finance.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	List<Transaction> findByUserId(Long userId);
	
	List<Transaction> findByUserIdAndDateBetween(
		Long userId,
		LocalDate start,
		LocalDate end
	);
	
	@Query("""
        SELECT t FROM Transaction t
        JOIN t.recurrence r
        WHERE r.active = true
    """)
	List<Transaction> findAllActiveRecurring();
}
