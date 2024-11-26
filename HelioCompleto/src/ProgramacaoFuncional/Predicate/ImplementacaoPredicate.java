package ProgramacaoFuncional.Predicate;

import ProgramacaoFuncional.Predicate.Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ImplementacaoPredicate {
	// public interface Predicate<T> {
	//			boolean test(T t);
	//}
	// Interface generica parametrizada com o tipo t com varios metodos porem apenas um metodo abstarto
	// chamdo teste q recebe um tipo t e retorna um boolean
	
	// Fazer um programa que, a partir de uma lista de produtos, remova da
	//lista somente aqueles cujo preço mínimo seja 100.
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Implementação de Interface :  uma classe que implementa o Predicate<T>
		// e implementar o methodo teste e fazer a logica que queremos;
					// list.removeIf(new ProductPredicate());
		
		// Implementação por referencia para o methodo
		// :: = MethodReference
					//	list.removeIf(Product::staticProductPredicate);
		
		// Implementação por referencia sem ser static
					//list.removeIf(Product::naoStaticProductPredicate);
		
		//Expressão Lambda declarada
					//double min = 100.0;
					//Predicate<Product> pred = p -> p.getPrice() >= min;
					//list.removeIf(pred);
		
		// Remove if com um predicado
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list ){
			System.out.println(p);
		}
		
	}


}
