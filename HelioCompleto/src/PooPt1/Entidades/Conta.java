package PooPt1.Entidades;

public class Conta {
  public int number;
  private String holder;
  private double balance;

  private double depositoInicial = 0;

  public String toString() {
    return  "Account " +
            number+
            ", Holder: "+
            holder+
            ", Balance: $ "+
            String.format("%.2f", balance);
  }

  public Conta(int numeroConta,String nomeTitular) {
    this.number = numeroConta;
    this.holder = nomeTitular;
  }

  public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
    this.number = numeroConta;
    this.holder = nomeTitular;
    deposito(depositoInicial);
  }

  public int getNumeroConta() {
    return number;
  }

  public String getNomeTitular(){
    return holder;
  }

  public void setNomeTitular(String nomeTitular){
    this.holder = nomeTitular;
  }

  public double getSaldo(){
    return balance;
  }

  public void deposito(double saldo){
    this.balance += saldo;
  }

  public void saque(double saque){
      this.balance -= saque + 5.00;
  }

}
