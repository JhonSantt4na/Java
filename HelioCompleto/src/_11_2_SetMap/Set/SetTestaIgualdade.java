package _11_2_SetMap.Set;

import java.util.HashSet;
import java.util.Set;

public class SetTestaIgualdade {
	//  Como as coleções Hash testam igualdade?
	
		// Se hashCode e equals estiverem implementados:
			// Primeiro hashCode. Se der igual, usa equals para confirmar.
			// Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode
	
		// Se hashCode e equals NÃO estiverem implementados:
			// Compara as referências (ponteiros) dos objetos. (referencias do obj)
	
	// classe que não contem hashCode e equals implementado
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
	}
	
	// Program princp
	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		// testando se esse conjunto tem no nosso set Product
		System.out.println(set.contains(prod)); // false
		
		// Como não tem a implementação hashCode e iquals na Class Product
		// ele compara  a instanciação ou seja cada "new Product("ex") " é um obj
		// diferente
		
		// Para comparar o conteudo vamos implementar o hashCode Iquals
		// na nossa class Product e ai sim ele return true pois ele compara por conteudo
		// e não pela referencia de obj
	}
}
