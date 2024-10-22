package ClassesMethodsAbstratas.ExercicioFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int qty = sc.nextInt();
		sc.nextLine();
		
		List<TaxPlayer> list = new ArrayList<>();
		
		for (int i = 1; i <= qty; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			System.out.print("Individual or company (i/c)? ");
			char typePersona = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			sc.nextLine();
			
			if(typePersona == 'c'){
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				sc.nextLine();
				
				TaxPlayer company = new Company(name, annualIncome, numberEmployees);
				list.add(company);
			}else{
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				sc.nextLine();
				
				TaxPlayer persona = new Individual(name, annualIncome, healthSpending);
				list.add(persona);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		for(TaxPlayer per: list){
			System.out.printf("%s : $ %.2f %n", per.getName(), per.taxesPaid());
			totalTaxes += per.taxesPaid();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES : $ %.2f", totalTaxes);
		sc.close();
	}
}