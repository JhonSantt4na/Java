package ClassesMethodsAbstratas;

import HerancaPolimofismo.Herancaex.Account;
import HerancaPolimofismo.Herancaex.BusinessAccount;
import HerancaPolimofismo.Herancaex.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstracts {
	// São Classes que não podem ser instamciadas
	// Forma de Garantir herança total : somente subclasses não abstratas
	// podem ser instanciadas, mas nunca a superclasse abstrata.
	
	// Suponha um sistema de banco apenas contas popanças e contas para empresas
	// São permetido e não existe contas comuns > Basta adicionar a palavra abstract
	// Declaração da classe contacomun e a notação UML = nome da classe italic
	public static void main(String[] args) {
		Account acc1 = new Account(1001,"Alex",12000.0);
		Account acc2 = new SavingsAccount(1002,"Maria",400.0, 0.01);
		Account acc3 = new BusinessAccount(1003,"Bob",7600.0,2000.00);
		// vamos na classe Account e colcamos o Abstract
		// com isso retorn um erro no nivel de compilação (não deixa instanciar)pois a variavel acc1 não pode instamciar a classe Account
		// Criamos a classe Account : reuso pois se não teriamos que cria duas vezes os atributos
		// motivo2 e principal = Polimorfismo pois a super classe generiaca nos permite tratar de
		// forma facil e uniforme todos os tipos de contas, inclusive se for com polimorfismo
		List<Account> list = new ArrayList<>();
		// Ou seja nessa lista do tipo generico posso colocar todos os outros tipos de contas
		list.add(acc1); //Account
		list.add(acc2); //SavingsAccount
		list.add(acc3); //BusinessAccount
		
		// Podemos fazer uma soma de todos os saldos das contas independete do tipo
		double sum = 0.0;
		for(Account acc : list){
			sum += acc.getBalance();
		}
		System.out.println("Total Balance " + String.format("%.2f",sum));
		// Ou podemos adicionar 10 em cada conta
		for(Account acc: list){
			acc.deposit(10.0);
		}
		// Exibindo os dados atualizados
		for (Account acc: list){
			System.out.println(acc.getBalance());
		}
	}
}
