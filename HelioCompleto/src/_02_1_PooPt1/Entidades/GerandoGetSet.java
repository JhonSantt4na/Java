package _02_1_PooPt1.Entidades;

public class GerandoGetSet {
  private String name;
  private double price;
  private int qty;
  // Para Gerar automaticamente vamos fazer o
  // seguinte aperta com o botao direiro encima do nome da classe
  // e vamos em generate e podemos gerar os contrutores, gets e sets

  public GerandoGetSet(){

  }

  public GerandoGetSet(String name, double price) {
    this.name = name;
    this.price = price;
    // Opcional o uso de this.quantity ou quantity = 0 pois por padrão comerça com 0
  }

  public GerandoGetSet(String name, double price, int qty) {
    this.name = name;
    this.price = price;
    // Sobrecarga mais de 1 construtor
  }

  public GerandoGetSet(double price) {
    this.price = price;
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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}
