package ProgramacaoFuncional.Consumer;

import ProgramacaoFuncional.Consumer.Entites.Product;
import ProgramacaoFuncional.Consumer.Ultil.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImplementacaoConsumer {
	// public interface Consumer<T> {
	//				void accept(T t);
	//				}
	
	//Fazer um programa que, a partir de uma lista de produtos, aumente o
	//preço dos produtos em 10%.
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	
		// Percorrendo a lista e Aumentando o preço em 10%
		// forEach = Recebe um consumer como argumento
		// ele é um methodo default que vai percorrer a coleção e executar esse consumer para cada elemento
		// vamos criar uma classe para implementar o Consumer
		
						// list.forEach(new PriceUpdate());
		
		
		// Referencia para methodo estatico
						//list.forEach(Product :: staticPriceUpdate);
		
		// Referencia para methodo estatico
						//list.forEach(Product::naoStaticPriceUpdate);
		
		// Expressão lambda declarada
		double factor = 1.1 ;
		//Consumer<Product> cons = p ->{
			//p.setPrice(p.getPrice() * factor);
		//};
		//list.forEach(cons);
		
		// expressção lambda em line
		list.forEach(p-> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out :: println);
	
	}
	//
}
