package TratamentoErro.Exercicio.Models;

import TratamentoErro.Exercicio.Models.Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			// Instanciando o Objeto
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double sacando = sc.nextDouble();
			
			acc.withdraw(sacando);
			
			System.out.println("New balance: " + acc.getBalance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		sc.close();
	}
}
