package com.santt4na.Finance.repository;

import com.santt4na.Finance.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {
	
	List<Account> findByUserId(Long userId);
	
	void delete(Optional<Account> user);
}