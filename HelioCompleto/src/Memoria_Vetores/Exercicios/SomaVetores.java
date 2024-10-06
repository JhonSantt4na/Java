package Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos Valores vai ter em cada vetor? ");
    int qty = sc.nextInt();
    sc.nextLine();

    int[] vectA = new int[qty];
    int[] vectB = new int[qty];
    int[] somaVect = new int[qty];

    System.out.println("Digite os Valores do Vetor A:");
    for (int i = 0; i < vectA.length; i++) {
      int num = sc.nextInt();
      vectA[i] = num;
    }

    System.out.println("Digite os Valores do Vetor B:");
    for (int i = 0; i < vectB.length; i++) {
      int num = sc.nextInt();
      vectB[i] = num;
    }

    for (int i = 0; i < somaVect.length; i++) {
      int soma = vectA[i] + vectB[i];
      somaVect[i] = soma;
    }

    System.out.println("Soma dos Vetores:");
    for (int i = 0; i < somaVect.length; i++) {
      System.out.println(somaVect[i]);
    }

    sc.close();
  }
}
