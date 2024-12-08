package _01_ConceitosBasicos.Exercicios.EstruturaCondicao;

import java.util.Scanner;

public class Multiplos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Write First value:");
    int A = sc.nextInt();
    System.out.println("Write Second Value:");
    int B = sc.nextInt();

    if (A % B == 0 || B % A == 0) {
      System.out.println("São Múltiplos");
    } else {
      System.out.println("Não São Múltiplos");
    }
    sc.close();
  }
}
