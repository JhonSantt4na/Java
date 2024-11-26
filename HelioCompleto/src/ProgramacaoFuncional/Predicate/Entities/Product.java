package ProgramacaoFuncional.Predicate.Entities;

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
	
	// Trabalha com o produto que sera passado pelo parametro
	public static boolean staticProductPredicate( Product p) {
		return p.getPrice() >= 100.0;
	}
	
	// Trabalha com a referencia ou seja com a popria instancia
	public boolean naoStaticProductPredicate( ) {
		return price >= 100.0;
	}
	
	
	@Override
	public  String toString() {
		return "Product [name = " + name + ", Price = " + price + "]";
	}
	
}
