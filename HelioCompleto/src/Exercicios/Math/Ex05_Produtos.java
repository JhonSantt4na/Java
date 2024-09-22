package Exercicios.Math;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_Produtos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    sc.nextInt();
    byte qty = sc.nextByte();
    double val = sc.nextDouble();
    double valueProduct1 = val * qty;

    sc.nextLine();

    sc.nextInt();
    byte qty2 = sc.nextByte();
    double val2 = sc.nextDouble();
    double valueProduct2 = val2 * qty2;

    double val_pay = valueProduct1 + valueProduct2;

    System.out.printf("Value the Pay: R$ %.2f", val_pay);
    sc.close();
  }
}
