package HerancaPolimofismo.Exercicios.ResolvidoFuncionarios;

public class OutsoucerdEmployee extends Employee{
	private Double additionalCharge;
	
	// Constructs
	public OutsoucerdEmployee() {
		super();
	}
	
	public OutsoucerdEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	
	// Getters && Setters
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	// Methods
	@Override
	public Double payment() {
		double taxa = additionalCharge * 1.1;
		return super.payment() + taxa;
	}
}
