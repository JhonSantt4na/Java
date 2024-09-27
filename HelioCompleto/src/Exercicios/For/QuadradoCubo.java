package Exercicios.For;

import java.util.Scanner;

public class QuadradoCubo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ler o número inteiro positivo N
    int N = scanner.nextInt();

    // Imprimir N linhas
    for (int i = 1; i <= N; i++) {
      int quadrado = i * i;  // Calcula o quadrado de i
      int cubo = i * i * i;  // Calcula o cubo de i

      // Imprimir o número, seu quadrado e seu cubo
      System.out.println(i + " " + quadrado + " " + cubo);
    }

    scanner.close();
  }
}
