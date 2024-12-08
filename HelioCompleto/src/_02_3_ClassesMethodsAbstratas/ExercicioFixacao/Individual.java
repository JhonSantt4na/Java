package _02_3_ClassesMethodsAbstratas.ExercicioFixacao;

public class Individual extends TaxPlayer {
	private double healthSpending;
	
	public Individual(String name, Double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	// Getters && Setters
	public double getHealthSpending() {
		return healthSpending;
	}
	
	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	// Methods
	@Override
	public Double taxesPaid(){
		double porcent;
		double valuePay = getAnnualIncome();
		
		if(getAnnualIncome() < 20000.00){
			porcent = 0.15;
			return valuePay * porcent;
		} else if (healthSpending > 0) {
			porcent = 0.25;
			return valuePay * porcent - (healthSpending * 0.50) ;
		} else {
			porcent = 0.25;
			return valuePay * porcent;
		}
	};
	
}
