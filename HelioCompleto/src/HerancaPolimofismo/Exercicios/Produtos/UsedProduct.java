package HerancaPolimofismo.Exercicios.Produtos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Constructrs
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	// Getters && Setters
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// Methods
	@Override
	public String priceTag(){
		String tag = String.format("%s (Used) $ %.2f ( Manufacture date: %s)",
			super.getName(),
			super.getPrice(),
			sdf.format(getManufactureDate()));
		return tag;
	}
}
