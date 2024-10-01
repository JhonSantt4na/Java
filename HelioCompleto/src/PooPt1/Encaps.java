package PooPt1;

import PooPt1.Entidades.Encapslmt;
import PooPt1.Entidades.Sobrecarga;

import java.util.Locale;
import java.util.Scanner;

public class Encaps{
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Price: ");
    double price = sc.nextDouble();

    Encapslmt product = new Encapslmt(name, price);
    // Não conseguimos mais acessar os atributos
    // product.name = "Computador";
    product.setName("Carro");
    // Caso agente queira imprimir o valor de name não sera possivel tmb
    // System.out.println(product.name); apos a criação do getName
    System.out.println(product.getName());
    // usando os metodos get e set do atributo price
    //get
    product.setPrice(255.00);
    System.out.println(product.getPrice());
    // como o produto so tem a quantidade por os metodos vamos somente exibir
    System.out.println(product.getQty());

    System.out.println("Sobrecarga data: " + product);
    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();

    product.addProducts(quantity);

    System.out.println("Updated data: " + product);
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();

    product.removeProducts(quantity);

    System.out.println("Updated data: " + product);
    sc.close();
  }
}
