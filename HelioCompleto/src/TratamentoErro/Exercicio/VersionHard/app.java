package TratamentoErro.Exercicio.VersionHard;

import TratamentoErro.Exercicio.VersionHard.Models.Entities.Account;
import TratamentoErro.Exercicio.VersionHard.Models.Exception.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os Dados da Conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Titular: ");
		String holder = sc.nextLine();

		System.out.print("Saldo Inicial: ");
		double balance = sc.nextDouble();

		System.out.print("Limite de Saque: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number,holder,balance,withdrawLimit);

		System.out.println();
		System.out.print("Informe uma quantia para Sacar: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
		} catch (AccountException e) {
			// Apos tentar caso der erro so exibir o a execption basta exibirla
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
