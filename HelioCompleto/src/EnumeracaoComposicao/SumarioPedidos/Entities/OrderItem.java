package EnumeracaoComposicao.SumarioPedidos.Entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	// Composição
	Product product = new Product();
	
	//Constructors
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Getters && Setters
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	// Methods
	public Double subTotal(){
		return price * quantity;
	}
}
