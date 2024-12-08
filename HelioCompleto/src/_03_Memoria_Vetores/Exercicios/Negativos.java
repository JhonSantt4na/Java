package _03_Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 * */
public class Negativos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros voce vai digitar?");
    int qty = sc.nextInt();
    sc.nextLine();
    int[] vect = new int[qty];

    int index = 0;
    int negativo = 0;
    while (index < vect.length) {
      System.out.println("Digite um número: ");
      int num = sc.nextInt();

      if (num < 0) {
        vect[negativo] = num;
        negativo++;
      }
      index++;
    }

    System.out.println("Numeros Negativos: ");
    // Iterando sobre o array com um índice
    for (int i = 0; i < vect.length; i++) {
      // Verificando se o elemento atual é diferente de 0
      if (vect[i] != 0) {
        // Exibindo o valor
        System.out.println(vect[i]);
      }
    }
    sc.close();
  }
}
