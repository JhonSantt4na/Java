package _03_Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos Elementos vai ter o vetor? ");
    int qty = sc.nextInt();
    sc.nextLine();

    int[] vect = new int[qty];
    int soma = 0, qtyPar = 0;
    double mediaPares = 0;

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      int valor = sc.nextInt();
      vect[i] = valor;
      if(valor % 2 == 0) {
        soma += valor;
        qtyPar++;
      }
    }

    if(soma <= 0){
      System.out.println("Nenhum Numero Par");
    }else {
      mediaPares = soma / qtyPar;
      System.out.println("Media dos Pares : " + mediaPares);
    }

    sc.close();
  }
}
