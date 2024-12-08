package _03_Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor ? ");
    int qty = sc.nextInt();
    sc.nextLine();

    double[] vect = new double[qty];
    double soma = 0.0;

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      double valor = sc.nextDouble();
      vect[i] = valor;
      soma+=valor;
    }

    double media = soma / qty;

    System.out.printf("Media do Vetor = %.3f %n", media);
    System.out.println("Elementos Abaixo da Media:");
    for (int i = 0; i < vect.length; i++) {
      if(vect[i] < media){
        System.out.println(vect[i]);
      }
    }



    sc.close();
  }
}
