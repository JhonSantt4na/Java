package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Coleções {
	/**
	 * Um vetor é imutável, se for adicionar um novo elemento ele cria um vetor assim como string que é um vetor de char
	 * antes do jdk1.2 eram array vetor e hashtable porem dificultava a programação:
	 *
	 * @ArrayList:
	 * é um tipo de vetor cujo tamanho pode ser redimensionado, ou seja, dinamico
	 * ele pode ser mais lento porem é conveniente para adição ou remoção de objetos
	 * o tamanho cresce e diminui com a necessidade
	 * */
	
	public static void main(String[] args) {
		// Criação do ArrayList:
		ArrayList<String> nomes = new ArrayList<>();
		// Criação com o tamanho:
		ArrayList<Integer> idades = new ArrayList<>(10);
		
		// Uso com tipos:
		// Byte, Short, Integer, Long, Float, Double, Boolean, Character
		
		// Principais Metodos:
		nomes.add("Slash");  // Adiciona elemento
		nomes.get(0);        // Pega a primeira posição
		nomes.set(0, "Satriani"); // redefini o elemento na primeira pos
		nomes.remove(0); // excluir o elemento na primeira pos
		nomes.clear();  // remove todos os objetos de uma so vez
		nomes.size();   // retorna a quantidade de elementos na lista
		nomes.contains("Slash"); // Verifica se tem esse elemento na lista retorno verdadeiro ou falso
		nomes.isEmpty(); // Verifica se a lista possue elemento retorno verdadeiro ou falso
		nomes.indexOf("kiko"); // retorna o indices do elemento passado no paramento caso não teja na lista retorna -1
		
		//ordenação:
		Collections.sort(nomes);  // Ordena uma lista cujos valores sejam passivel de comparação
		
		
		/**
		 * @LinkedList:
		 * uma lista duplamente encadeada, possui todos os métodos acima e funciona igual a ArrayList
		 * */
		
		// Criação :
		LinkedList<String> nomes2 = new LinkedList<>();
		
		// metodos especificos da linkedList
		nomes2.addFirst("Morello"); // Adiciona um valor no início
		nomes2.addLast("Malmsteen"); // Adiciona um valor no fim
		nomes2.removeFirst(); // Remove o valor da primeira pos
		nomes2.removeLast();  // Remove o valor da última pos
		nomes2.getFirst();    // Retorna o valor da primeira pos
		nomes2.getLast();	  // Retorna o valor da última pos
		
		/**
		 * @Quando_Usar:
		 * @Arraylist:
		 * se precisar acesa elementos de posições aleatórias de uma coleção
		 * e for adicionar e remover elementos no fim da lista o tipo
		 * @LinkedList:
		 * se for para usar a coleção percorrendo completamente sem acessar pos aleatórias
		 * e for adicionar e remover elementos no início e no meio
		 * */
		
		
		
	}
}
