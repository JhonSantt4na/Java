package ProgramacaoFuncional.Comparator;

//public class Product implements Compable<Product>{}
public class Product  {
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
		return "Product [name = " + name + ", Price = " + price + "]";
	}
	
	//@override
	//public int compareTo(Product p) {
		//return name.toUpperCase().compareTo(p.getName().toUpperCase());
	//}
	
	
}
