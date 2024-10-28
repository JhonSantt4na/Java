package TratamentoErro.Exercicio.VersionHard.Models.Entities;

import TratamentoErro.Exercicio.VersionHard.Models.Exception.AccountException;
import TratamentoErro.versaoBoa.model.Exceptions.DoMainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	// Methods
	public void deposit(double amount){
		balance += amount;
	}

	public void withdraw(double amount){
		// Já que ela é private ja fazemos aqui a analize
		validateWithdraw(amount);
		balance -= amount;
	}

	// Delegando a regra para a propria classe
	private void validateWithdraw(double amount){
		if( amount > getWithdrawLimit()){
			throw new AccountException("Erro de Saque: A Quantia execede o limite de Saque");
		}
		if (amount > getBalance()) {
			throw new AccountException("Erro de Saque: Saldo insuficiente");
		}
	}
}
