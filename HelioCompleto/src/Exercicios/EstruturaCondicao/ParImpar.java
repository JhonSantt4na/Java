package Exercicios.EstruturaCondicao;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Write one value:");
    int value = sc.nextInt();

    if(value % 2 == 0){
      System.out.println("PAR");
    }else{
      System.out.println("IMPAR");
    }
    sc.close();
  }
}
