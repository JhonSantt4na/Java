package com.santt4na.Finance.Controller;

import com.santt4na.Finance.entity.Transaction;
import com.santt4na.Finance.services.RecurrenceService;
import com.santt4na.Finance.services.TransactionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.YearMonth;
import java.util.List;

@Log
@RestController
@AllArgsConstructor
@RequestMapping("/v1/transaction")
public class TransactionController {
	
	private final RecurrenceService recurrenceService;
	private final TransactionService transactionService;
	
	@PostMapping("/{userId}")
	public ResponseEntity<Transaction> createTransaction(@RequestBody @Valid Transaction transaction,
														 @RequestParam Long userId, Long accountId) throws Exception {
		Transaction newTransaction = transactionService.createTransaction(userId, accountId, transaction);
		return ResponseEntity.ok(newTransaction);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Transaction>> listTransactionsByMonth(@RequestParam Long userId, YearMonth month){
		List<Transaction> foundTransaction = transactionService.listTransactionsByMonth(userId, month);
		return ResponseEntity.ok(foundTransaction);
	}
	
	
}
