package HerancaPolimofismo;

import HerancaPolimofismo.Herancaex.Account;
import HerancaPolimofismo.Herancaex.BusinessAccount;
import HerancaPolimofismo.Herancaex.SavingsAccount;

public class SobreposicaoSuperAnotacao {
	// Sobreposição : podemos definir um comportamento diferente pra um metodo da superclasse
	// Recomendado usar a Anotação = @Override > com isso a leitura fica mais clara e o compilador cuida da implementação
	
	// Ex: Vamos na classe Account e no metodo withdraw teremos :
	// balance -= amount + 5.0; Ou seja a cada operação desconta 5.0
	
	// Porem na consta poupança vamos sobrescever esse metodo
	/*
		@Override    >> Sem o Override Funciona mais o compilador não retorna os erros
		public void withdraw(double amount){
			balance -= amount ;
		}
	*/
	// Testando
	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance()); // Return 795.0 com a taxa de 5.0
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance()); // Return 800.0 sem a taxa
		
		// Palavra Chave : Super >> Usada para chamar implementação da SuperClasse
		// Basicamente com a palavra super vamos fazer o withdraw normal com a taxa
		// e fazer mais alguma outra cois como por exemplo discontar -= 2.0
		/*
			@Override
			public void withdraw(double amount){
				super.withdraw(amount); // Faz o padrão e adiciona mais uma taxa de 2.0
				balance -= 2.0 ;
			}
		 */
		Account acc3 = new BusinessAccount(1003,"bob",1000.0,500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance()); // Return 793.0
		
		// Tambem usamos o super nos construtores para pegar os atributos da SuperClasse
	}
	
	
}
