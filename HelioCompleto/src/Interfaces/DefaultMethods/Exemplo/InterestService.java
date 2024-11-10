package Interfaces.DefaultMethods.Exemplo;

import java.security.InvalidParameterException;

public interface InterestService {
	// não podemos colcoar esse methodo como padrao nem construtor
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
