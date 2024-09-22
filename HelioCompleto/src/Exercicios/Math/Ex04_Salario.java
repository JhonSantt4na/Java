package Exercicios.Math;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Ex04_Salario {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Whats is your number:");
    int number = sc.nextInt();
    System.out.println("What are you working hours?");
    double working_hours = sc.nextDouble();
    System.out.println("How much do you get paid for the hours you work?");
    double valueHours_working = sc.nextDouble();
    double salary = working_hours * valueHours_working;


    System.out.printf("Number : %d %n", number);
    System.out.printf("Salary: U$ %.2f", salary);
    sc.close();
  }
}
