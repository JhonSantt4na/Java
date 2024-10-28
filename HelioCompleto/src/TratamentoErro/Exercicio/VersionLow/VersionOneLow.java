package TratamentoErro.Exercicio.VersionLow;

import java.util.Locale;
import java.util.Scanner;

public class VersionOneLow {
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

        AccountLow acc = new AccountLow(number,holder,balance,withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para Sacar: ");
        double amount = sc.nextDouble();

        // Tratando os erros
        if( amount > acc.getWithdrawLimit()){
            System.out.println("Erro de Saque: A Quantia execede o limite de Saque");
        } else if (amount > acc.getBalance()) {
            System.out.println("Erro de Saque: Saldo insuficiente");
        }else{
            acc.withdraw(amount);
            System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
        }
        sc.close();
    }
}
