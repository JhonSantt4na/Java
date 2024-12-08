package _03_Memoria_Vetores.Exercicios;

import _03_Memoria_Vetores.Entidades.Func;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Func> list = new ArrayList<>();

    System.out.print("How many employees will be registered ? ");
    int qty = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < qty; i++) {
      System.out.println();
      System.out.println("Emplyoee #" + (i+1) + ":");

      System.out.print("Id: ");
      Integer id = sc.nextInt();
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Salary: ");
      Double salary = sc.nextDouble();

      Func emp = new Func(id, name, salary);
      list.add(emp);
    }

    System.out.print("Enter the employee id that will have salary increase : ");
    int idSalary = sc.nextInt();

    Integer pos = position(list, idSalary);
    if (pos == null){
      System.out.println("This id does not exist!");
    }else{
      System.out.print("Enter the percentage: ");
      double percent = sc.nextDouble();
      list.get(pos).increaseSalary(percent);
    }
    System.out.println();
    System.out.println("List of employees: ");

    for (Func emp : list) {
      System.out.println(emp);
    }

    sc.close();
  }

  // public opcional
  // Função pra receber uma lista e um id e retorna a pos se tiver
  public static Integer position(List<Func> list, int id){  // Int para retorna -1 caso use o Integer retornamos null
    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getId() == id ){
        return i;
      }
    }
    return null;
  }


}