package EnumeracaoComposicao.SumarioPedidos.Entities;

public class Product {
	private String name;
	private Double price;
	
	// Constructors
	public Product(){
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	// Getters && Setters
	
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
}
