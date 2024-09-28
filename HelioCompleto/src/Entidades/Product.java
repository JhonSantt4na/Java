package Entidades;

public class Product {
  public String name;
  public double price;
  public int qty;

  public double totalValueInStock(){
    return  price * qty;
  }

  public void addProducts(int qty){
    this.qty += qty; // mesmo nome temos uma ambiguidade então precisamos usar o This para diferenciar o da classe para o do parametro
  }

  public void removeProducts(int qty){
    this.qty -= qty;
  }

  public String toString() {
    return "Product name: "
            + name +
            ", $ " +
            String.format("%.2f", price) +
            ", "+
            qty +
            " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
  }

}
