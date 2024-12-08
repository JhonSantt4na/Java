package _01_ConceitosBasicos;

import java.util.Scanner;

public class For {
  public static void main(String[] args) {
    // for (inicio: condição: incremento){bloco de comandos}
    // Otima para contagens, usada quando sabemos a quantidade de repetições.
    Scanner sc = new Scanner(System.in);
    System.out.println("Write one Number:");

    int num = sc.nextInt();
    // Inicio : Somente na primeira vez
    // condição: Até se torna falsa
    // incremento: so exc se a condição for true

    for (int i = 1; i <= num; i++) {
      System.out.println("For :" + i);
    }
  }
}
