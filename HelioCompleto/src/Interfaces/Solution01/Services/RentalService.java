package Interfaces.Solution01.Services;

import Interfaces.Solution01.Entities.CarRental;
import Interfaces.Solution01.Entities.Invoice;

import java.time.Duration;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHours;
	
	// Isso nçao é uma boa pratica pois o servico de
	private BrazilTaxService taxService;
	
	public RentalService(Double pricePerHours, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHours = pricePerHours;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice (CarRental carRental){
		// Pegando a diff de duas datas e convertendo em minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		// Assim pegamos o valor das horas por fração
		
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			// Usar tarifa por hora e arredondar para cima
			basicPayment = pricePerHours * Math.ceil(hours);
		} else {
			// Usar tarifa por dia
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		// Usando o service da Taxa
		double tax = taxService.tax(basicPayment);
		
		// Usando o Serviço
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
