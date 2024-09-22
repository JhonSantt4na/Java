package Exercicios.Math;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_Circulo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the Radius of the circle:");
    double radiusCircle = sc.nextDouble();
    double pi = 3.14159;
    double Area_formula = pi * Math.pow(radiusCircle, 2.0);

    System.out.printf("Area = %.4f", Area_formula);
    sc.close();
  }
}
