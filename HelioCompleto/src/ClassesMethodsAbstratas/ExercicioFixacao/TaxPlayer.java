package ClassesMethodsAbstratas.ExercicioFixacao;

public abstract class TaxPlayer {
	private String name;
	private Double annualIncome;
	
	public TaxPlayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	// Getters && Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	// Methods
	public abstract Double taxesPaid();
	
}
