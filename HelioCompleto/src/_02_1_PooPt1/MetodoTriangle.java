package _02_1_PooPt1;
import _02_2_Entidades.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class MetodoTriangle {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the measures of triangle X: ");
    Triangle x, y;    // x e y serão do tipo Triangle que é nossa entidade
    x = new Triangle(); // x recebe um Triagle
    y = new Triangle(); // y recebe um Triagle

    // x.atributo_da_classe = coloca na variavel
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    // y.atributo_da_classe = coloca na variavel
    System.out.println("Enter the measures of triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Large area: X");
    }else {
      System.out.println("Large area: y");
    }

    sc.close();
  }
}
