package PooPt1.ExercioPoo;

import java.util.Locale;
import java.util.Scanner;

public class StaticPt01 {
  public static final double PI = 3.14159;
  // para ser constante usase o final
  // mais de uma palavra _ sempre maiuscula

  public static void main(String[] args) {
    // conhcecido como membros de classe
    // oposição e instancia
    // Não precisa de objetos e é chamado pelo nome da classe
    // usado em classes utilitarias: operações >> sqrt
    // declaração de constantes.
    // a classe que so tem metodos statico, não pode ser instanciada
    // Main por padrão statica - não pode chamr um metodo statico dentro de uma classe static
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius: ");
    double radius = sc.nextDouble();
    double c = circunference(radius);
    double v = volume(radius);
    System.out.printf("Circunference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", PI);

    sc.close();
  }
  public static  double circunference( double radius){
    return 2.0 * PI * radius;
  }
  public static  double volume( double radius){
    return 4.0 * PI * radius * radius * radius / 3.0;
  }

}
