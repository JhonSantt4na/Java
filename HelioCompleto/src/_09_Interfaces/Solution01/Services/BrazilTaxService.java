package _09_Interfaces.Solution01.Services;

import _09_Interfaces.Solucion02Interface.TaxService;

// BrazilTaxService com o implements depende da TaxService
public class BrazilTaxService  implements TaxService {
	public double tax(double amount){
		if (amount <= 100.0){
			return amount * 0.2;
		}else {
			return amount * 0.15;
		}
	}
}
