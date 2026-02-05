package com.santt4na.Finance.Controller;

import com.santt4na.Finance.entity.Account;
import com.santt4na.Finance.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@AllArgsConstructor
@RequestMapping("/v1/account")
public class AccountController {
	
	private final AccountService accountService;
	
	@GetMapping("/createAccount/{userId}")
	public ResponseEntity<Account> CreateAccount(@PathVariable Long userId, Account account) throws Exception {
		Account newAccount = accountService.create(userId, account);
		return ResponseEntity.ok(newAccount);
	}
}