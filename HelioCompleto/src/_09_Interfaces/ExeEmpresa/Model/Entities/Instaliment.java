package _09_Interfaces.ExeEmpresa.Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Instaliment {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private Double amount;
	
	public Instaliment() {
	}
	
	public Instaliment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
