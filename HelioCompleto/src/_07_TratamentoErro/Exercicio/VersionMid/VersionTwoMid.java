package _07_TratamentoErro.Exercicio.VersionMid;

import java.util.Locale;
import java.util.Scanner;

public class VersionTwoMid {
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

        AccountMid acc = new AccountMid(number,holder,balance,withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para Sacar: ");
        double amount = sc.nextDouble();

        // Resolvendo a Delegação

        String error = acc.validateWithdraw(amount);
        if (error != null){
            System.out.println(error);
        }else{
            acc.withdraw(amount);
            System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
        }
        sc.close();
    }
}
