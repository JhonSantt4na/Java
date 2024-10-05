package Memoria_Vetores.Exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
* */
public class Soma_vetor {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros você vai digitar?");
    int qty = sc.nextInt();
    sc.nextLine();

    double soma = 0;
    double media;
    double[] vect = new double[qty];

    for (int i = 0; i < vect.length; i++) {
      System.out.println("Digite um numero :");
      double num = sc.nextDouble();
      vect[i] = num;
      soma += num;
    }

    media = soma / vect.length;

    System.out.print("Valores = ");
    for (int i = 0; i < vect.length; i++) {
      System.out.print(vect[i]);
      if (i < vect.length - 1) { // ate o ultimo elmento do array
        System.out.print(", ");  // Adiciona uma vírgula entre os números
      }
    }
    System.out.println();
    System.out.printf("Soma = %.2f %n", soma);
    System.out.printf("Media = %.2f", media);

    sc.close();
  }
}
