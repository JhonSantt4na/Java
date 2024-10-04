package Memoria_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // Criando o vetor com possições indefinida
    // Ou seja o valor que eu definir sera a qtd de elemento do vetor
    double[] vect = new double[n];

    // Guardando dados nos elementos
    // for para acessar as possição do vetor
    for (int i = 0; i < n; i++) {
      vect[i] = sc.nextDouble();
    }
    double soma = 0.0; // Declaramos um acumulador soma
    for (int i = 0; i < n; i++) {  // Rodamos pelo array
      soma += vect[i];              // adicionamos o valor do arry ao acumulador cada passagem soma
    }
    double avg = soma / n;     // com os valores somado, dividimos para ter a media

    System.out.println(avg);

    sc.close();
  }

}
