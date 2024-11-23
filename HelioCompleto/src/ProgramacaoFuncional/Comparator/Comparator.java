package ProgramacaoFuncional.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
	// Interface Funcional do Java 8
	public static void main(String[] args) {
		//Suponha uma classe Product com os atributos name e price.
		//• Podemos implementar a comparação de produtos por meio da
		//implementação da interface Comparable<Product>
		//• Entretanto, desta forma nossa classe não fica fechada para
		//alteração: se o critério de comparação mudar, precisaremos
		//alterar a classe Product.
		//• Podemos então usar o default method "sort" da interface List:
		//default void sort(Comparator<? super E> c)
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product( "TV", 900.00));
		list.add(new Product( "Notebook", 1200.00));
		list.add(new Product( "Tablet", 450.00));
		
		//Collections.sort(list); // Precisa que a classe Product implement a CompareTo
		list.sort(new ComparatorFuncional());
		
		for (Product p : list){
			System.out.println(p);
		}
	}
}
