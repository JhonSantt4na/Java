package _06_HerancaPolimofismo.Herancaex;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount(){
		super();
	}
	// Escolhendo o construtor completo
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	// Getters && Setters
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	// Metodos
	// Atualizando o saldo com os juros
	public void updateBalance(){
		balance += balance * interestRate;
	}
	@Override
	public void withdraw(double amount){
		balance -= amount ;
	}
	
}
