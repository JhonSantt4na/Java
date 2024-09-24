package Exercicios.EstruturaCondicao;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    double x = sc.nextDouble();
    double y = sc.nextDouble();

    if (x == 0 && y == 0) {
      System.out.println("Origem");
    } else if (x == 0) {
      System.out.println("Eixo Y");
    } else if (y == 0) {
      System.out.println("Eixo X");
    }
    // Verificar os quadrantes
    else if (x > 0 && y > 0) {
      System.out.println("Q1");
    } else if (x < 0 && y > 0) {
      System.out.println("Q2");
    } else if (x < 0 && y < 0) {
      System.out.println("Q3");
    } else if (x > 0 && y < 0) {
      System.out.println("Q4");
    }

    sc.close();
  }
}