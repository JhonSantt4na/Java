package _01_ConceitosBasicos.Exercicios.EstruturaCondicao;

import java.util.Scanner;

public class ItensTabela {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double codigo = sc.nextDouble();
    double qty = sc.nextDouble();

    if(codigo == 1){
      double res = 4.00 * qty;
      System.out.printf("Total : %.2f", res);

    } else if (codigo == 2) {
      double res = 4.50 * qty;
      System.out.printf("Total : %.2f", res);

    } else if (codigo == 3) {
      double res = 5.00 * qty;
      System.out.printf("Total : %.2f", res);

    } else if (codigo == 4) {
      double res = 2.00 * qty;
      System.out.printf("Total : %.2f", res);

    } else if (codigo == 5) {
      double res = 1.50 * qty;
      System.out.printf("Total : %.2f", res);

    } else {
      System.out.println("Produto não Encontrado");
    }
    sc.close();
  }
}
