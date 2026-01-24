package com.santt4na.Finance.services;

import com.santt4na.Finance.entity.Account;
import com.santt4na.Finance.entity.User;
import com.santt4na.Finance.repository.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Objects;


@Log
@Service
@AllArgsConstructor
public class AccountService {
	
	private final AccountRepository accountRepository;
	private final UserService userService;
	
	public Account create(Long userId, Account account) throws Exception {
		log.info("Creating new Account");
		
		if (account == null) {
			throw new Exception("Account cannot be null");
		}
		
		if (account.getName() == null ||
			account.getType() == null ||
			account.getDueDay() == null ||
			account.getClosingDay() == null) {
			
			throw new Exception("Name, type, due day and closing day are required");
		}
		
		if (account.getDueDay() < 1 || account.getDueDay() > 31) {
			throw new Exception("Invalid due day. Must be between 1 and 31");
		}
		
		if (account.getClosingDay() < 1 || account.getClosingDay() > 31) {
			throw new Exception("Invalid closing day. Must be between 1 and 31");
		}
		
		User user = userService.getOrFail(userId);
		
		Account newAccount = new Account();
		newAccount.setName(account.getName());
		newAccount.setType(account.getType());
		newAccount.setDueDay(account.getDueDay());
		newAccount.setClosingDay(account.getClosingDay());
		newAccount.setUser(user);
		
		log.info("Account created successfully for user: " + userId);
		return accountRepository.save(newAccount);
	}
	
	public Account findById(Long accountId) throws Exception {
		log.info("Finding Account by id :" + accountId);
		
		return accountRepository.findById(accountId)
			.orElseThrow(() ->
				new Exception("Account not found with id: " + accountId));
	}
	
	public Account getByIdAndUser(Long accountId, Long userId) throws Exception {
		log.info("Finding Account " + accountId + " for user " + userId);
		
		Account account = findById(accountId);
		
		if (!Objects.equals(account.getUser().getId(), userId)) {
			throw new Exception("Account does not belong to the given user");
		}

		return account;
	}
	
	public void updateBalance(Account account, BigDecimal amount) throws Exception {
		if (account == null) {
			throw new Exception("Account cannot be null");
		}
		
		if (amount == null) {
			throw new Exception("Amount cannot be null");
		}
		
		if (account.getBalance() == null) {
			account.setBalance(BigDecimal.ZERO);
		}
		
		account.setBalance(account.getBalance().add(amount));
		accountRepository.save(account);
	}
}
//Uma conta pertence a um único usuário
//Criar conta para um usuário
//Buscar contas do usuário
//Atualizar saldo
//Validar ownership