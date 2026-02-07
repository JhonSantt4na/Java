package com.santt4na.Finance.Controller;

import com.santt4na.Finance.entity.Account;
import com.santt4na.Finance.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@DeleteMapping("/deleteAccount/{userId}")
	public ResponseEntity<Void> deleteAccount(@PathVariable Long userId){
		accountService.delete(userId);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
}