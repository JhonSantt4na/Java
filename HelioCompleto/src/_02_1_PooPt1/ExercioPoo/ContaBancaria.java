package _02_1_PooPt1.ExercioPoo;

import _02_1_PooPt1.Entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Conta newAcc;

    int number;
    String holder;
    char resposta;
    double depositInitial;

    System.out.println("Enter account number: ");
    number = sc.nextInt();

    System.out.println("Enter account holder: ");
    holder = sc.nextLine();
    
    sc.nextLine();

    System.out.println("Is there na initial deposit (y/n) ? ");
    resposta = sc.next().charAt(0);

    if (resposta == 'y'){
      System.out.println("Enter initial deposit value: ");
      depositInitial = sc.nextDouble();
      newAcc = new Conta(number, holder, depositInitial );
    }else {
      newAcc = new Conta(number,holder);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.println(newAcc);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble();
    newAcc.deposito(depositValue);
    System.out.println("Updated account data:");
    System.out.println(newAcc);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    double saqueValue = sc.nextDouble();
    newAcc.saque(saqueValue);
    System.out.println("Updated account data:");
    System.out.println(newAcc);

    sc.close();
  }
}
