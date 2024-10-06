package Memoria_Vetores.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar ? ");
    int qty = sc.nextInt();
    sc.nextLine();

    double[] vect = new double[qty];
    double maior = vect[0];
    int posMaior = 0;

    // Adicionando Valores ao Vect
    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um nuemero: ");
      double valor = sc.nextDouble();
      vect[i] = valor;
    }

    // Pegando o maior numero:
    for (int i = 1; i < vect.length; i++) {
      if (vect[i] > maior){
        maior = vect[i];
        posMaior = i;
      }
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("A posição do maior número é: " + posMaior);

    sc.close();
  }
}
