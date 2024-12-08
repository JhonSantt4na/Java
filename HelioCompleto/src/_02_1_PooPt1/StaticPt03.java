package _02_1_PooPt1;
import _02_1_PooPt1.Entidades.Estatic03;
import java.util.Locale;
import java.util.Scanner;

public class StaticPt03 {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      // não precisamos mais instanciar
      // usamos diretamente o nome da classe

      System.out.println("Enter radius: ");

      double radius = sc.nextDouble();

      double c = Estatic03.circunference(radius);
      double v = Estatic03.volume(radius);
      // Já que Estatic03 todos os metodos são static
      // podemos usar diretamente com o nome da classe e podemos
      // usar os metodo independente do objeto

      System.out.printf("Circunference: %.2f%n", c);
      System.out.printf("Volume: %.2f%n", v);
      System.out.printf("PI value: %.2f%n", Estatic03.PI);

      sc.close();
  }
}
