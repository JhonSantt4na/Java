package Memoria_Vetores.Entidades;

public class Func {
  private int id;
  private String name;
  private double salary;

  public Func(){
  }

  public Func(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void increaseSalary(double percentage) {
   salary += salary * percentage / 100;
  }

  @Override   // Ajuda a não Errar, Aponta um erro.
  public String toString(){
    return id + ", " + name + ", " + String.format("%.2f", salary);
  }

}
