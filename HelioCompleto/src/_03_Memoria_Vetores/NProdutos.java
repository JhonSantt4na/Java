package _03_Memoria_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class NProdutos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    double[] soma = new double[n];
    double res = 0.0;
    double avg = 0.0;

    for (int i = 0; i < n; i++) {
      String nameProduto = sc.nextLine();
      soma[i] = sc.nextDouble();
      sc.nextLine();
      res += soma[i];
      avg = res / n;
    }

    System.out.println(avg);

    sc.close();
  }
}
