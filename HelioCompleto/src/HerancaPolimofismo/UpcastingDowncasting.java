package HerancaPolimofismo;

import HerancaPolimofismo.Herancaex.Account;
import HerancaPolimofismo.Herancaex.BusinessAccount;
import HerancaPolimofismo.Herancaex.SavingsAccount;

public class UpcastingDowncasting {
	// UpCasting => Da Sub para a Super
	// Uso comum Polimorfismo;
	// na pratica:
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex",0.0 );
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		// Upcasting:
		
		// BusinessAcount e SavingsAccount é uma Account
		// acc1, acc2 e acc3 não Retorna erro
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
		
		
		//DownCasting => Da Super para a Sub
		
		//BusinessAccount acc4 = acc2; // Retorna um erro pois não podemos converter uma Account em BusinessAcount
		// com isso vamos ter que fazer uma Casting manual ficando;
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // o compilador não sabe que o acc3 é um SavingsAccount
		// No entanto o erro so teremos em tempo de execução;
		// Para evitar isso é sempre bom testar Primeiro ex:
		if(acc3 instanceof BusinessAccount){
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		// Testando se o Acc3 é uma instancia do SavingsAccount
		if(acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		// Como acc3  == SavingsAccount
		// return > Update!
	}
	
	
	
	
	
}
