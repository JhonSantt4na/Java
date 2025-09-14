package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {
	/**
	 * @HashMap: Apesar de ter uma estrutura semelhante aos tipos ArrayList etc..
	 * ele é um tipo de mapa onde declara chaves valores
	 *
	 * @HashTable: identico ao HashMap porem mais recomendado usar com Threads.
	 * */
	public static void main(String[] args) {
		
		// Criação do HashMap
		HashMap<Integer, String> produtos = new HashMap<>();
		HashMap<Integer, String> produtos2 = new HashMap<>(10);
		
		// Métodos Especificos
		
		// Put -> Insere e atualiza valores
		produtos.put(1, "Banana");
		produtos.put(2, "Maça");
		produtos.put(3, "Manga");
		produtos.put(4, "Morango");
		produtos.put(5, "Uva");
		produtos.put(1, "Abacaxi");
		
		// intera sobre as chaves dos elementos
		for (int chave: produtos.keySet()){
			System.out.println(chave);
		}
		
		// intera sobre os valores dos elementos
		for (String valor: produtos.values()){
			System.out.println(valor);
		}
		
		// intera sobre os elementos deixando acessivel chaves e valores dos elementos
		// Sempre usa Integer, String, Double etc...
		// getKey() -> retorna a chave
 		// getValue() -> retorna o valor
		for (Map.Entry<Integer, String> p : produtos.entrySet()){
			System.out.printf("%d: %s%n", p.getKey(), p.getValue());
		}
		
	}
}
