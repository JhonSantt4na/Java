package _11_1_ProgramacaoFuncional.Function;

import _11_1_ProgramacaoFuncional.Function.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementacaoFunction {
	// public interface Function<T, R> {
	//		R apply(T t);
	//}
	
	//Fazer um programa que, a partir de uma lista de produtos, gere uma
	//nova lista contendo os nomes dos produtos em caixa alta.
	
	public static void main(String[] args) {
		
		//Nota sobre a função map
		//• A função "map" (não confunda com a estrutura de dados Map) é uma
		//função que aplica uma função a todos elementos de uma stream.
	
		//• Conversões:
		//• List para stream: .stream()
		//• Stream para List: .collect(Collectors.toList())
		
		
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Implementação da interface
		
		// Criando nova lista e Convertendo em Streams, Aplico a função Uppercase com o map (que so funciona para Stream) e depois converto a Stream de volta  para List
		
		//List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
		//names.forEach(System.out::println);
		

		// Reference Method com metodo Statico
		
		//List<String> names = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		
		// Reference Method com metodo não Statico
		
		//List<String> names = list.stream().map(Product::noStaticUppercaseName).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		
		// Expressão Lambda Declarada
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		// Expressão Lambda inline
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}
	
}
