package HerancaPolimorfismo.herancaUpDownCasting;

public class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount(){
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override // Isso indica que é uma sobreposição de metodos
	// sem o Override não tem erro. mas com o Override ativo ele procura na super se nao achar retorna um erro
	public void withdraw(double amount){
		balance -= amount;// Na SavingAccount não descontamos o 5.0 que temos na Account ou Super Classe
	}
	
	public void updateBalance(){
		balance += balance * interestRate;
	}
}
