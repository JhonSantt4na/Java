package PooPt1.Entidades;

public class Encapslmt {
  private String name;
  private double price;
  private int qty;

  public Encapslmt(){

  }

  public Encapslmt(String name, double price) {
    this.name = name;
    this.price = price;
    // Opcional o uso de this.quantity ou quantity = 0 pois por padrão comerça com 0
  }

  public Encapslmt(String name, double price, int qty) {
    this.name = name;
    this.price = price;
    // Sobrecarga mais de 1 construtor
  }
  // Logo apos o construtores usaremos os metodos set e get
  // get pegar os valores e set mudar
  // public para ficar visivel
  // void pois ele não retorna nada já que so vai atualizar os dados
  // setName em camelCase
  // Passamos uma string com o novo valor que sera atuzalizado
  // usamos o this para referencia que o name que não temos acesso agr vai receber valor x
  public void setName(String name) {
    this.name = name;
  }
  // caso queira so imprimir o nome tmb não sera acessivel
  // vamos criar um metodo getName
  public String getName() {
    return name;
  }

  // vamos fazer com o price
  // get
  public double getPrice(){
    return price;
  }
  // set
  public void setPrice(double price){
    this.price = price;
  }

  // como a quantidade so queremos que as pessoas vejam vamos usar somente o get
  public int getQty(){
    return qty;
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
