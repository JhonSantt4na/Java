package Collection;

import java.util.HashSet;

public class CollectionHashSet {
	/**
	 *@HashSet : Colection para valores unicos, não deixa adicionar valores repetidos
	 * tem os mesmos metodos do ArrayList adição, remoção entre outros
	 * */
	public static void main(String[] args) {
		
		// Criação do HashSet Criado da mesma forma que ArrayList
		HashSet<String> tags = new HashSet<String>();
		HashSet<String> tags1 = new HashSet<String>(10);
		
		// Funcionamento:
		tags.add("java");
		tags.add("programação");
		tags.add("poo");
		tags.add("java");
		
		for (String tag:tags){
			System.out.println(tag + " - " + tag.hashCode());
		}
		
		/* "poo", "java", "programação"
		* A ordem não tem relação com a ordem da inserção, pois ela se baseia
		* no codigo hash dos objetos contidos na coleção
		* o codigo hash ou hashcode é um inteiro que representa o estado do objeto;
		* 1 o hashcode é = 1
		* 'A' o hashcode é = 65 inteiro com base na tabela ASCII
		* Para outros objetos mais complexos o hashcode pode ter sua forma de computação costumizada
		* podendo não havar garantia de ter 2 objetos com o mesmo hashcode
		*/
		
	}
}
