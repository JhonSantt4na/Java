package Interfaces.Solution01;

import Interfaces.Solution01.Entities.CarRental;
import Interfaces.Solution01.Entities.Vehicle;
import Interfaces.Solution01.Services.BrazilTaxService;
import Interfaces.Solution01.Services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Formatação
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter com os dados do Aluguel :");
		System.out.print("Modelo do Carro: ");
		String carModel = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		// Vamos mudar de texto para data o que for mandado no intante de exc
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		// Instanciando um veiculo e passando no arg
		CarRental cr = new CarRental(start, finish,new Vehicle(carModel));
		
		System.out.print("Entre com Preço por Hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com Preço por Dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA :");
		System.out.println("Pagamento Basico : " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto : " + String.format("%.2f",cr.getInvoice().getTax()));
		System.out.println("Pagamento Total : " + String.format("%.2f",cr.getInvoice().getTotalPayment()));
		
		sc.close();
	}
}
