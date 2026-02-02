package com.santt4na.Finance.Controller;

import com.santt4na.Finance.services.RecurrenceService;
import com.santt4na.Finance.services.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@AllArgsConstructor
@RequestMapping("/v1/transaction")
public class TransactionController {
	
	private final RecurrenceService recurrenceService;
	private final TransactionService transactionService;
	
	
}
