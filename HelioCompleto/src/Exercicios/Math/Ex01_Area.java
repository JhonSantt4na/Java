package Exercicios.Math;
import java.util.Locale;
import java.util.Scanner;

public class Ex01_Area {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("What the width ?");
    double width = sc.nextDouble();
    System.out.println("What the height ?");
    double height = sc.nextDouble();
    System.out.println("What the square meter?");
    double square_meter = sc.nextDouble();

    double area = width * height;
    double price = area * square_meter;


    System.out.printf("Area = %.2f %n", area);
    System.out.printf("Preço = R$ %.2f", price);

    //Area = largura x comprimento
    //Preço= Area x 200
    sc.close();
  }
}
