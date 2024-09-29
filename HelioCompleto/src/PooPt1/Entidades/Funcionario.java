package PooPt1.Entidades;

public class Funcionario {
  public String name;
  public double grossSalary;
  public double tax;

  public double NetSalary(){
    return grossSalary - tax;
  }

  public void IncreaseSallary(double por) {
    grossSalary += grossSalary * por / 100.0;
  }

  public String toString(){
    return name + ", $ " + String.format("%.2f", NetSalary());
  }

}