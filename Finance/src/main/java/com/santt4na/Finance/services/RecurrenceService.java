package com.santt4na.Finance.services;

import com.santt4na.Finance.entity.Transaction;

import java.time.LocalDate;

public class RecurrenceService {
	
	void processRecurringTransactions(LocalDate today);
	LocalDate calculateNextDate(Transaction transaction);
	
}
//Gerar transações futuras
//Calcular próxima data
//Executar recorrências automaticamente