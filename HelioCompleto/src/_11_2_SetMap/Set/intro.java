package _11_2_SetMap.Set;

import java.util.*;

public class intro {
	//Representa um conjunto de elementos (similar ao da Álgebra)
	
	// Não admite repetições
	// Elementos não possuem posição  (podem ou não possuir ordem)
	// Acesso, inserção e remoção de elementos são rápidos
	// Oferece operações eficientes de conjunto: interseção, união, diferença.
	
	// Set<T>  = uma interface
	
	// Principais implementações:
	
		// HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
	
		// TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou ComparatorIntro)
		
	   // LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
	
	
	// Alguns métodos importantes
		
		// add(obj), remove(obj), contains(obj)
			// Baseado em equals e hashCode
			// Se equals e hashCode não existir, é usada comparação de ponteiros
		
		// clear() = Esvazia o conjunto
		
		// size() = Tamanho do conjunto
	
		// removeIf(predicate) = remover todos que atenda ao predicado
	
		// addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
		// retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
		// removeAll(other) - diferença: remove do conjunto os elementos contidos em other
	
	//public static void main(String[] args) {
		// Instanciando usando a implementação mais rapida HashSet
		// Set<String> set = new HashSet<>();
		
		// Imprimindo todos os elementos extremamente rapido com o HashSet
		// porem a ordem é prejudicada
		// for (String p : set) {
			// System.out.println(p);
		// }
	
		// Set<String> set = new TreeSet<>();
			// for (String p : set) {
				// System.out.println(p);
			// }
			// Ordena a lista em String
				// A > a
				// a > z
		
		//Set<String> set = new LinkedHashSet<>(); // Simplismente mantem a ordem
		
		
		//set.add("TV");
		//set.add("Notebook");
		//set.add("Tablet");
		
		// Imprimindo  se existe "Notebook" no Set instanciado
		//System.out.println(set.contains("Notebook"));
		
		// Usando alguns metodos:
		
		//set.removeIf(x -> x.length() >= 3); // remove todos com mais de 3 letras
		//set.removeIf(x -> x.charAt(0) == 'T'); // remove todos que a priemira letra é "T
		
		//for (String p : set) {
			//System.out.println(p);
		//}
	//}
	
	// Exemplo 2
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

		//union
		// criando um conjunto ' c ' que vai ser uma copia do conjunto ' a '
		Set<Integer> c = new TreeSet<>(a);
		// Adicionando o Conjunto 'b' , unindo o 'a' com o 'b' no conjunto 'c'
		c.addAll(b);
		System.out.println(c); // [0, 2, 4, 5, 6, 7, 8, 9, 10]

		//intersection
		
		// criando um conjunto ' d ' que vai ser uma copia do conjunto ' a '
		Set<Integer> d = new TreeSet<>(a);
		// pegando todos os elementos incomun nos elementos
		d.retainAll(b);
		System.out.println(d); // [5, 6, 8, 10]

		//difference
		// criando um conjunto ' e ' que vai ser uma copia do conjunto ' a '
		Set<Integer> e = new TreeSet<>(a);
		// remover todos os elementos que não tem no conjunto ' b "
		e.removeAll(b); // [0, 2, 4]
		
		System.out.println(e);
	}
	
}
