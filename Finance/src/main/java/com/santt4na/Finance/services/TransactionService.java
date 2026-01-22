package com.santt4na.Finance.services;

public class TransactionService {
	Transaction createTransaction(
		UUID userId,
		UUID accountId,
		Transaction transaction
	);
	
	List<Transaction> listTransactionsByMonth(
		UUID userId,
		YearMonth month
	);
	
	void markAsPaid(
		UUID transactionId,
		UUID userId
	);
	
	void generateNextMonthRecurringTransactions(
		UUID userId
	);
	
}

//Responsabilidades:
//Criar transação
//Validar:
//	usuário
//	conta
//	categoria (se já criou)
//tipo (RECEITA/DESPESA)
//Atualizar saldo da conta
//Lidar com recorrência