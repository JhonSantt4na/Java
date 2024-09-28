package PooPt1;
import Entidades.Product;
import java.util.Locale;
import java.util.Scanner;

public class Stoque {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    product.name = sc.nextLine();

    System.out.print("Price: ");
    product.price = sc.nextDouble();

    System.out.print("Quantity in stock: ");
    product.qty = sc.nextInt();

    System.out.println();
    System.out.println(product);

    System.out.println();
    System.out.print("Enter the number of products to be added in Stok: ");
    int qty = sc.nextInt();
    product.addProducts(qty);

    System.out.println();
    System.out.println(product);

    System.out.println();
    System.out.print("Enter the number of products to be removed in Stok: ");
    qty = sc.nextInt();
    product.removeProducts(qty);

    System.out.println();
    System.out.println(product);

    sc.close();
  }
}
