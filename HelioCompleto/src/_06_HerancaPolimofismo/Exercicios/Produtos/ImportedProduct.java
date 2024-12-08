package _06_HerancaPolimofismo.Exercicios.Produtos;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	// Constructs
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	// Getters && Setters
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	// Methods
	public Double totalPrice(){
		double taxa = 20.0;
		return super.getPrice() + taxa;
	}
	
	@Override
	public String priceTag(){
		String tag = String.format("%s $ %.2f (Customs fee: $ %.2f )", super.getName(), totalPrice(), getCustomsFee());
		return tag;
	}
}
