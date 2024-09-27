package Exercicios.For;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    //Lembrando que, por definição, fatorial de 0 é 1

    int numero = 5;  // Exemplo: calcular 5!
    long resultado = 1;

    for (int i = 2; i <= numero; i++) {
      resultado *= i;  // Multiplica o valor acumulado pelo próximo número
    }
    System.out.println("Fatorial de " + numero + " é: " + resultado);
  }
}
