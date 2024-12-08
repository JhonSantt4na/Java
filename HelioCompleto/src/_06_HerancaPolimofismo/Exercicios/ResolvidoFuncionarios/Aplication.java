package _06_HerancaPolimofismo.Exercicios.ResolvidoFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Employee: ");
		int qty = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		sc.nextLine();
		for (int i = 0; i < qty; i++) {
			System.out.printf("Employer #%d data: %n", i + 1);
			System.out.print("Outsoucerd (y/n) ? ");
			char isOutsourced = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hours: ");
			double valuePerHours = sc.nextDouble();
			sc.nextLine();
			
			if (isOutsourced == 'y' || isOutsourced == 'Y') {
				System.out.print("Additional Charge: ");
				double addCharge = sc.nextDouble();
				sc.nextLine();
				
				Employee employeeOut = new OutsoucerdEmployee(name, hours, valuePerHours, addCharge);
				employees.add(employeeOut);
			}else{
				employees.add(new Employee(name, hours, valuePerHours)); // Podemos Fazer sem Variavel
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : employees ){
			System.out.printf("%s - $ %.2f %n",emp.getName(),emp.payment());
		}
		
		sc.close();
	}
}
