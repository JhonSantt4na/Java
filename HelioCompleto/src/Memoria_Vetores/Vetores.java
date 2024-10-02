package Memoria_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
  public static void main(String[] args) {
    //todos do mesmo tipo
    //ordenado por posições
    //Alocada de uma vez so em um bloco contiguo de memoria
    // vantag: Acesso imediato pela sua posição
    // desvtg: Tamanho fixo, Dificudade para se realizar inserções e deleções

    //Ex:
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    //inicia com 0 se for numero pq o java ver como double
    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
      vect[i] = sc.nextDouble();
    }
    
    double soma = 0.0;
    for (int i = 0; i < n; i++) {
      soma+=vect[i];
    }
    double avg = soma / n;
    System.out.printf("Average Height: %.2f ", avg);

    sc.close();
  }

}
