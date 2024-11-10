package Interfaces.DefaultMethods.Exemplo;

public class BrazilInterestService implements InterestService {
	private double interestRate;
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public double payment(double amount, int months) {
		return 0;
	}
}
