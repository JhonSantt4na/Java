package ProgramacaoFuncional.Function.Entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public  String toString() {
		return "Product [name = " + name + ", Price = " + String.format("%.2f", price) + "]";
	}
	
	public static String staticUppercaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String noStaticUppercaseName() {
		return name.toUpperCase();
	}
}
