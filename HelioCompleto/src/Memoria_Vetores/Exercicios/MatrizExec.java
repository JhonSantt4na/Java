package Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExec {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int c = sc.nextInt();

    int [][] mat = new int[l][c];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    int x = sc.nextInt();

    encontrarVizinhos(mat, x);

    sc.close();
  }

  public static void encontrarVizinhos(int[][] matriz, int numero) {
    // Percorre a matriz para encontrar a posição do número
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] == numero) {
          System.out.println("Número " + numero + " encontrado na posição (" + i + ", " + j + ")");

          // Verifica o elemento acima
          if (i > 0) {
            System.out.println("Acima: " + matriz[i - 1][j]);
          }

          // Verifica o elemento abaixo
          if (i < matriz.length - 1) {
            System.out.println("Abaixo: " + matriz[i + 1][j]);
          }

          // Verifica o elemento à esquerda
          if (j > 0) {
            System.out.println("À esquerda: " + matriz[i][j - 1]);
          }

          // Verifica o elemento à direita
          if (j < matriz[i].length - 1) {
            System.out.println("À direita: " + matriz[i][j + 1]);
          }

          // Retorna após encontrar o número e mostrar os vizinhos
          return;
        }
      }
    }

    System.out.println("Número " + numero + " não encontrado na matriz.");
  }

}
