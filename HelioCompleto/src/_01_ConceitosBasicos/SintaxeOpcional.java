package _01_ConceitosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {
  public static void main(String[] args) {
    // Atribuição Acumulativa
    // +=
    // -=
    // *=
    // /=
    // %=

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int minutes = sc.nextInt();
    double bill = 50.0;
    if(minutes > 100){
      bill += (minutes - 100) * 2;
    }
    System.out.printf("Value the bill = R$ %.2f%n", bill);
    sc.close();
  }
}
