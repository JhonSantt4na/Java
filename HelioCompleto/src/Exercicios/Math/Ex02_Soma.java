package Exercicios.Math;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_Soma {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Write the first value:");
    int value1 = sc.nextInt();
    System.out.println("Write the second value:");
    int value2 = sc.nextInt();

    int soma = value1 + value2;
    System.out.printf("A soma de %d + %d = %d", value1, value2, soma);
    sc.close();
  }
}
