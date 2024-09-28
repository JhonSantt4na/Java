package PooPt1;

import Entidades.Triangle; // Importamos a nossa entidade

import java.util.Locale;
import java.util.Scanner;

public class UsandoPoo {
  public static void main(String[] args) {
    // Classe é um tipo estruturado que pode conter (membros)
    // atributos(dados/campos) e metodos(funções/operações)
    // tem varios recursos: contrutores, sobrecarga, encapsulamenrto, herança, polimorfismo
    // Entidades: Produto, cliente, triangulo
    // Serviços: ProdutoService, ClienteService, EmailService, StorageService
    // Controladores: ProdutoController, ClienteControle
    // Ultilitarios: Calculadora, compactador
    // Outros: (views, repositorios, gerenciadores)

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

    double p = (x.a + x.b + x.c) / 2.0;
    double areaX = Math.sqrt(p * (p-x.a) * (p-x.b) * (p-x.c));

    p = (y.a + y.b + y.c) / 2.0;
    double areaY = Math.sqrt(p * (p -y.a) * (p -y.b) * (p -y.c));

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
