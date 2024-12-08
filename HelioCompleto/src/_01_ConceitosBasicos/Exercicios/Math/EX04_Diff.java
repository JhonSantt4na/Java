package _01_ConceitosBasicos.Exercicios.Math;

import java.util.Locale;
import java.util.Scanner;

public class EX04_Diff {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("What value A :");
    int A = sc.nextInt();
    System.out.println("What value B :");
    int B = sc.nextInt();
    System.out.println("What value C :");
    int C = sc.nextInt();
    System.out.println("What value D :");
    int D = sc.nextInt();

    int form_Diff = A * B - C * D;

    System.out.println("The Diff is:" + form_Diff);
    sc.close();
  }
}
