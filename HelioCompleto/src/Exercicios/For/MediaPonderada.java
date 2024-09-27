package Exercicios.For;

import java.util.Scanner;

public class MediaPonderada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ler o número de casos de teste
    int N = scanner.nextInt();

    // Processar cada caso de teste
    for (int i = 0; i < N; i++) {
      // Ler os três valores
      double v1 = scanner.nextDouble();
      double v2 = scanner.nextDouble();
      double v3 = scanner.nextDouble();

      // Calcular a média ponderada
      double mediaPonderada = (v1 * 2 + v2 * 3 + v3 * 5) / 10;

      // Imprimir o resultado com uma casa decimal
      System.out.printf("%.1f%n", mediaPonderada);
    }

    scanner.close();
  }
}
