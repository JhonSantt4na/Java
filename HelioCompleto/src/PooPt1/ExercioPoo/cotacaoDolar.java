package PooPt1.ExercioPoo;

import PooPt1.Entidades.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class cotacaoDolar {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the dollar price?");
    double precoDolar = sc.nextDouble();

    System.out.println("How many dollars will be bought?");
    double dolarIof = sc.nextDouble();

    double result = Dolar.dollarToReal(dolarIof, precoDolar);

    System.out.printf("Amount to be paid in reais = %.2f%n", result);

    sc.close();
  }
}
