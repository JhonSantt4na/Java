package _06_HerancaPolimofismo.Exercicios.ResolvidoFuncionarios;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHours;
	
	// Constructors
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	// Getters e Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double getValuePerHours() {
		return valuePerHours;
	}
	
	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	// Methods
	public  Double payment(){
		return hours * valuePerHours;
	}
}