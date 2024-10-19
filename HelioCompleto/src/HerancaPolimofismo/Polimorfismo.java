package HerancaPolimofismo;

import HerancaPolimofismo.Herancaex.Account;
import HerancaPolimofismo.Herancaex.BusinessAccount;

public class Polimorfismo {
	public static void main(String[] args) {
		//  Variaveis do mesmo tipo com varios comportamentos
		Account ac1 = new Account(1002,"Maria", 0.0);
		Account ac1 = new BusinessAccount(1003, "Bob", 200.00,0.01);
		
		// Ou seja por mais que sejam do mesmo tipo, Account elas fazem coisas diferentes
		
	}
}
