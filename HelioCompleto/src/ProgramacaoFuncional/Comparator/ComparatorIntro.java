package ProgramacaoFuncional.Comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ComparatorIntro {
	// Interface Funcional do Java 8
	public static void main(String[] args) {
		//Suponha uma classe Product com os atributos name e price.
		//• Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
		//• Entretanto, desta forma nossa classe não fica fechada para
		
		//alteração:
		// se o critério de comparação mudar, precisaremos alterar a classe Product.
		//• Podemos então usar o default method "sort" da interface List:
		//default void sort(ComparatorIntro<? super E> c)
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product( "TV", 900.00));
		list.add(new Product( "Notebook", 1200.00));
		list.add(new Product( "Tablet", 450.00));
		
		// 01 -- Usando o CompareTo
		// Precisa que a classe Product implement a CompareTo e tenha o seu metodos implementados
		
		//Collections.sort(list);
		
		
		// 02 -- Usando o ComparatorIntro
		// Interface ou seja precisamos criar uma classe que implemente o ComparatorIntro
		// public class ComparatorFuncional implements ComparatorIntro<Product>
		// e la na classe usaremos o methodo para a comparação
		
		//list.sort(new ComparatorFuncional());
		
		
		//03 -- Usando uma sintaxe de Classe anonima
		// Criando uma classe anonima no corpo do nosso programa
		
		//Comparator<Product> comp = new Comparator<Product>() {
			//@Override
			//public int compare(Product p1, Product p2) {
				//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			//}
		//};
		
		
		 //04 -- Usando Expressão Lambda
		// Função anonima ou ArrowFunction
		// Comparator<Product> comp = (Product p1, Product p2) -> {
			//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// };
		
		//05 -- Usando Expressão Lambda simplificada
		// Função anonima ou ArrowFunction
		// (Product p1, Product p2), return e {} = Opcional
		//Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		//list.sort(comp);
		
		// 6 -- Usando Expressão Lambda Diretamente como argumento no sort
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list){
			System.out.println(p);
		}
	}
}
