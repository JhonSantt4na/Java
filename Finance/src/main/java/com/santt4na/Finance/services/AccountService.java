package com.santt4na.Finance.services;

import com.santt4na.Finance.entity.Account;
import com.santt4na.Finance.entity.User;
import com.santt4na.Finance.repository.AccountRepository;
import com.santt4na.Finance.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Log
@Service
@AllArgsConstructor
public class AccountService {
	
	private final UserRepository userRepository;
	private final AccountRepository accountRepository;
	private final UserService userService;
	
	public Account create(Long userId, Account account) throws Exception {
		log.info("Create new Account");
		User getUser = userService.getOrFail(userId);
		
		if (account.getName() == null || account.getType() == null ||
			account.getDueDay() == null || account.getClosingDay() == null) {
			throw new Exception("Name, type, due day, and closing day are required");
		}
		
		if (account.getDueDay() < 1 || account.getDueDay() > 31) {
			throw new Exception("Invalid due date");
		}
		
		if (account.getClosingDay() < 1 || account.getClosingDay() > 31) {
			throw new Exception("Invalid closing day");
		}
		
		Account newAccount = new Account();
		newAccount.setName(account.getName());
		newAccount.setType(account.getType());
		newAccount.setDueDay(account.getDueDay());
		newAccount.setClosingDay(account.getClosingDay());
		
		newAccount.setUser(getUser);
		
		log.info("New Account created");
		return accountRepository.save(newAccount);
	};
	
	public Account findById(Long accountId){
	
	};
	
	public Account getByIdAndUser(Long accountId, Long userId){
	
	};
	
	public void updateBalance(Account account, BigDecimal amount){
	
	};
	
}
//Uma conta pertence a um único usuário
//Criar conta para um usuário
//Buscar contas do usuário
//Atualizar saldo
//Validar ownership