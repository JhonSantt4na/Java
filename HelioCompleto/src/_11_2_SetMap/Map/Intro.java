package _11_2_SetMap.Map;

import java.util.Map;
import java.util.TreeMap;

public class Intro {
	public static void main(String[] args) {
		// Map<K,V>
		
		//• É uma coleção de pares chave / valor
		//• Não admite repetições do objeto chave
		//• Os elementos são indexados pelo objeto chave (não possuem posição)
		//• Acesso, inserção e remoção de elementos são rápidos
		
		//• Uso comum: cookies, local storage, qualquer modelo chave-valor
		
		//• Principais implementações:
		//• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
		//• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou ComparatorIntro)
		//• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		
		Map<String, String> cookies = new TreeMap<>();
		// TreeMap ordena com a chave, String é por ordem alfabetica
		
		
		// Alguns métodos importantes
		
		// put(key, value) = Adiciona uma Chave e valor
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@teste.com");
		cookies.put("phone", "985456574");
		
		// remove(key) = Remove uma Chave com seu valor
		cookies.remove("email");
		
		// containsKey(key) = Se tem no conjunto a chave "phone"
		System.out.println(cookies.containsKey("phone")); // return true
		// quando não tem a chave ele return null
		
		// get(key)
		System.out.println(cookies.get("username")); // return Maria
		
		//• size() = tamanho do conjunto
		System.out.println(cookies.size()); // Tamanho do meu Conjunto
		
		//• clear() = limpa o conjunto
		// cookies.clear();  // Limpa o conjunto
		
		//• keySet() - retorna um Set<K> = Imprimindo Todos
		System.out.println("All Cookies: ");
		for (String key : cookies.keySet()){
			System.out.println(key + ": " + cookies.get(key));
			// Percorendo o Map e imprimindo as suas chaves valores
		}
		
		cookies.put("phone", "985456574");
		// Caso eu use novamente a mesma chave como o Map não permite
		// ele simplismente substitue o valor
	
		//• values() - retornaa um Collection<V>
		
		//• Baseado em equals e hashCode
		//• Se equals e hashCode não existir, é usada comparação de ponteiros
	
	}
}
