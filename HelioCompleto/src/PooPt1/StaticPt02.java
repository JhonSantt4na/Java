package PooPt1;

import PooPt1.Entidades.Estatic02;

import java.util.Locale;
import java.util.Scanner;

public class StaticPt02 {
 // Passamos para uma novo arq
 // Retiramos o static e agora precisamos usar o seguinte metodo no nosso app principal

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Estatic02 calc = new Estatic02();

    System.out.println("Enter radius: ");

    double radius = sc.nextDouble();
    double c = calc.circunference(radius);
    double v = calc.volume(radius);
    System.out.printf("Circunference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", calc.PI);

    sc.close();
  }
}
