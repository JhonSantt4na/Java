package PooPt1.Entidades;

public class Sobrecarga {
  public String name;
  public double price;
  public int qty;

  public Sobrecarga(){

  }

  public Sobrecarga(String name, double price) {
    this.name = name;
    this.price = price;
    // Opcional o uso de this.quantity ou quantity = 0 pois por padrão comerça com 0
  }

  public Sobrecarga(String name, double price, int qty) {
    this.name = name;
    this.price = price;
    // Sobrecarga mais de 1 construtor
  }

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
    return "Sobrecarga name: "
            + name +
            ", $ " +
            String.format("%.2f", price) +
            ", "+
            qty +
            " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
  }
}
