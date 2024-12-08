package _02_3_ClassesMethodsAbstratas.ExercicioFixacao;

public class Company extends TaxPlayer{
	private Integer numberEmployees;

	public Company(String name, Double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}
	// Getters e Setters
	
	public int getNumberEmployees() {
		return numberEmployees;
	}
	
	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	// Methods
	@Override
	public Double taxesPaid() {
		double valuePay = getAnnualIncome();
		return numberEmployees > 10 ? valuePay * 0.14 : valuePay * 0.16;
	}
}
