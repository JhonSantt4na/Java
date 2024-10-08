package Memoria_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    //Criando a matriz
    int[][] mat = new int[n][n]; // 2[] = Bidmessional

    // mat.length = qty de linhas
    // mat[i].length = qty de coluna

    for (int i = 0; i < mat.length; i++) { // Linha
      for (int j = 0; j < mat[i].length; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    // Elementos em diagonal principal tem os mesma linha e coluna 
    System.out.println("Main Diagonal = ");
    for (int i = 0; i < n; i++) {
      System.out.print(mat[i][i] + " "); // adiciona a matiz da row e col 0 0 e acresenta um espaço vazio
    }
    System.out.println();

    // Qty de numeros neg
    int count = 0;

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if(mat[i][j] < 0) {
          count++;
        }
      }
    }
    System.out.println("Negative Number =" + count);
    sc.close();
  }
}
