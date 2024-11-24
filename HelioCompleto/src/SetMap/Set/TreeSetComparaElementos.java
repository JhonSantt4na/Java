package SetMap.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparaElementos {
	// Recordando as implementações
	// Principais implementações:
	
		// HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
		// TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou ComparatorIntro)
		// LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
	public static class Product implements Comparable<Product>{
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
				return "Product{" +
					"name='" + name + '\'' +
					", price=" + price +
					'}';
			}
			
			@Override
			public int compareTo(Product other) {
				return name.toUpperCase().compareTo(other.getName().toUpperCase());
			}
		}
		
	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}
	
	// quando usa o TreeSet tem, que usa uma implementação do compareble na classe do conjunto
	// que no caso é o Product

}
