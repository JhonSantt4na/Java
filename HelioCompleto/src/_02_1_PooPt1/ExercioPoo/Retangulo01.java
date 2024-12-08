package _02_1_PooPt1.ExercioPoo;

import _02_1_PooPt1.Entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    Retangulo ret = new Retangulo();
    System.out.println("Enter rectangle width and height :");

    ret.width = sc.nextDouble();
    ret.height = sc.nextDouble();

    System.out.printf("Area = %.2f %n", ret.area());
    System.out.printf("Perimeter = %.2f %n", ret.perimeter());
    System.out.printf("Diagonal = %.2f %n", ret.diagonal());

    sc.close();
  }
}
