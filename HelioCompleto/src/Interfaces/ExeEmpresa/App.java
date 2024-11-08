package Interfaces.ExeEmpresa;

import Interfaces.ExeEmpresa.Model.Entities.Contract;
import Interfaces.ExeEmpresa.Model.Entities.Instaliment;
import Interfaces.ExeEmpresa.Model.Services.ContractService;
import Interfaces.ExeEmpresa.Model.Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre os dados do contrato: ");
		
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Valor do Contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number,totalValue,date);
		
		System.out.print("Entre com o numero de parcelas :");
		int qtyInstalment = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.ProcessCrontract(contract, qtyInstalment);
		
		System.out.println("Parcelas: ");
		for (Instaliment instaliment : contract.getInstalments()){
			System.out.println(instaliment);
		}
		
		sc.close();
	}
}
