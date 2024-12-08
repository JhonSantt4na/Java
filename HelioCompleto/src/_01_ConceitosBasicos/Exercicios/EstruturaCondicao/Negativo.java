package _01_ConceitosBasicos.Exercicios.EstruturaCondicao;

import java.util.Scanner;

public class Negativo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Write the number:");
    int value = sc.nextInt();

    if(value < 0){
      System.out.println("NEGATIVO");
    }else{
      System.out.println("NÂO NEGATIVO");
    }
    sc.close();
  }
}
