package _01_ConceitosBasicos.Exercicios.For;

import java.util.Scanner;

public class Divisores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= Math.sqrt(n); i++) {
      // Se i for divisor de n
      if (n % i == 0) {
        // Imprimir o divisor i
        System.out.println(i);

        // Se o outro divisor (n / i) for diferente de i, imprimir também
        if (i != n / i) {
          System.out.println(n / i);
        }
      }
    }
  }
}
