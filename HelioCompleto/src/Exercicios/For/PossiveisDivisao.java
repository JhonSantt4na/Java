package Exercicios.For;

import java.util.Scanner;

public class PossiveisDivisao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ler o número N de pares
    int N = scanner.nextInt();

    // Processar N pares de números
    for (int i = 0; i < N; i++) {
      // Ler o par de números
      int numerador = scanner.nextInt();
      int denominador = scanner.nextInt();

      // Verificar se o denominador é zero
      if (denominador == 0) {
        System.out.println("divisao impossivel");
      } else {
        // Calcular e imprimir o resultado da divisão
        double resultado = (double) numerador / denominador;
        System.out.printf("%.1f%n", resultado);
      }
    }

    scanner.close();
  }
}
