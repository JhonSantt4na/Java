package _11_1_ProgramacaoFuncional.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionsComFunctionsParametros {
	// Entities
	public static class Product {
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
	}
	//Serviços
	public static class ProductService {
		// Para ficar mais sustentavel passamos um predicado como parametro ex:
		public double filteredSum(List<Product> list, Predicate<Product> criteria) {
			double sum = 0.0;
			for (Product p : list){
				if (criteria.test(p)){
					sum += p.getPrice();
				}
			}
			return sum;
		}
	}
	//App
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		System.out.println("Sum = "+ String.format("%.2f", sum));
	}
}
