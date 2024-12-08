package _02_1_PooPt1.ExercioPoo;

import _02_1_PooPt1.Entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Funcionario employee = new Funcionario();

    System.out.println("Name : ");
    employee.name = sc.nextLine();

    System.out.println("Gross Salary :");
    employee.grossSalary = sc.nextDouble();

    System.out.println("Tax :");
    employee.tax = sc.nextDouble();

    double salaryTax = employee.NetSalary();
    String nome = employee.name;
    double salarioBruto = employee.grossSalary;

    System.out.printf("Employee: %s, $ %.2f %n", nome, salaryTax);

    System.out.println("Which percentage to increase salary ? ");
    double por = sc.nextDouble();
    employee.IncreaseSallary(por);

    System.out.println("Updated data: " + employee);

    sc.close();
  }
}
