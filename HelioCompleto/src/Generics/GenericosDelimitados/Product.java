package Generics.GenericosDelimitados;

// Ai com isso precisamos dizer que implementa o comparable
// e teremos que adicionar o metodo que mostra o que vamos comparar
public class Product implements Comparable<Product> {
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
		public String toString() {
			return name + ", " + String.format("%.2f", price);
		}
		
		@Override
		public int compareTo(Product other) {
			return price.compareTo(other.getPrice());
		}
		// esse method diz que vamos comparar um precço com outro
		
}
