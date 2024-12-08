package _09_Interfaces.ExeEmpresa.Model.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Instaliment> Instalments = new ArrayList<>();
	// Constructors
	public Contract() {
	}
	
	public Contract(Integer number, Double totalValue, LocalDate date) {
		this.number = number;
		this.totalValue = totalValue;
		this.date = date;
	}
	// Getters && Setters
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public List<Instaliment> getInstalments() {
		return Instalments;
	}
	// Removemos o SetInstaliment
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
}
