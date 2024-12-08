package _01_ConceitosBasicos.Exercicios.Math;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_AllAreas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    float A = sc.nextFloat();
    float B = sc.nextFloat();
    float C = sc.nextFloat();

    double pi = 3.14159;

    float Triangulo = A * C / 2f;
    double Circulo = pi * Math.pow(C, 2.0);
    float Trapezio = (A + B) / 2 * C;
    float Quadrado = (float) Math.pow(B, 2.0);
    float Retangulo = A * B;

    System.out.printf("TRIANGULO: %.3f %n", Triangulo);
    System.out.printf("CIRCULO: %.3f %n", Circulo);
    System.out.printf("TRAPEZIO: %.3f %n",Trapezio);
    System.out.printf("QUADRADO: %.3f %n", Quadrado);
    System.out.printf("RETANGULO: %.3f %n", Retangulo);

    sc.close();
  }
}
