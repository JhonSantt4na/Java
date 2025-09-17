package Collection.Exercicios.hashMapp;

import java.util.*;

public class AgruparAnagrama {
	/**
	 * Agrupar palavras por anagramas
	 * Descrição:
	 * Dado um array de Strings, agrupe as palavras que são anagramas umas das outras.
	 * Exemplo:
	 * Input: ["bat", "tab", "tap", "pat", "apt"]
	 * Output: [["bat", "tab"], ["tap", "pat", "apt"]]
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Digite uma lista de palavra anagramas para ser agrupadas: ");
		String palavras = sc.nextLine().trim();
		String[] palavrasSplitadas = palavras.split(" ");
		
		// Chama o metodo para agrupar os anagramas
		List<List<String>> resultado = agruparAnagramas(palavrasSplitadas);
		
		for (List<String> grupo : resultado) {
			System.out.println(grupo);
		}
		
		sc.close();
	}
	
	public static List<List<String>> agruparAnagramas(String[] palavras) {
		// Mapa para armazenar grupos de anagramas
		Map<String, List<String>> mapa = new HashMap<>();
		
		// Para cada palavra no array
		for (String palavra : palavras) {
			// Convertemos a palavra para um array de char para ordenar
			char[] letras = palavra.toCharArray();
			Arrays.sort(letras);  // Ordena os caracteres
			String chave = new String(letras);  // Transforma novamente em String
			
			// Se o mapa já tiver essa chave, adicionamos a palavra
			if (!mapa.containsKey(chave)) {
				mapa.put(chave, new ArrayList<>());
			}
			mapa.get(chave).add(palavra);
		}
		
		// Retorna todos os grupos de anagramas como uma lista de listas
		return new ArrayList<>(mapa.values());
	}
	
}
