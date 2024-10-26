package TratamentoErro.Exercicio.Models.Entities;

import TratamentoErro.versaoBoa.model.Exceptions.DoMainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	// Constructors
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	// Getters && Setters
	
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
	
	public void withdraw(double amount) throws Exception{
		if(balance == 0 && amount > withdrawLimit){
			throw new DoMainException("Impossivel Fazer o Saque.");
		}else {
			balance -= amount;
		}
	}
	//se não houver saldo na conta, ou se o valor do saque for superior ao limite de
	//saque da conta.
	
}
