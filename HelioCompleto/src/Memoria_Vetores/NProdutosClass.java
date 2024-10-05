package Memoria_Vetores;
import Memoria_Vetores.Entidades.NProdutos;
import java.util.Locale;
import java.util.Scanner;

public class NProdutosClass {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    NProdutos[] vect = new NProdutos[n];
    // Para não usar a variavel n usamos o vect.length
    // pq não fica dependendo de uma outra variavel

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new NProdutos(name, price);
    }

    double soma = 0;
    for (int i = 0; i < vect.length; i++) {
      soma += vect[i].getPrice();
    }
    double avg = soma / n;

    System.out.printf("Media de Preços = %.2f%n", avg);

    sc.close();
  }
}
