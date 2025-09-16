package Collection.Exercicios.hashMapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrama {
	/**
	 * Verificar se duas Strings são Anagramas
	 * Descrição:
	 * Use um HashMap para contar os caracteres e verificar se duas palavras são anagramas.
	 * Exemplo:
	 * Input: "amor", "roma"
	 * Output: true
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Digite duas palavras separadas por espaço: ");
		String entrada = sc.nextLine().trim();
		String[] palavras = entrada.split(" ");
		
		if (palavras.length != 2) {
			System.out.println("Por favor, digite exatamente duas palavras.");
			return;
		}
		
		String palavra1 = palavras[0].toLowerCase();
		String palavra2 = palavras[1].toLowerCase();
		
		Map<Character, Integer> mapa1 = contarCaracteres(palavra1);
		Map<Character, Integer> mapa2 = contarCaracteres(palavra2);
		
		if (mapa1.equals(mapa2)) {
			System.out.println("✅ São anagramas.");
		} else {
			System.out.println("❌ Não são anagramas.");
		}
		
		sc.close();
	}
	
	public static Map<Character, Integer> contarCaracteres(String palavra) {
		Map<Character, Integer> mapa = new HashMap<>();
		
		for (char c : palavra.toCharArray()) {
			mapa.put(c, mapa.getOrDefault(c, 0) + 1);
		}
		
		return mapa;
	}
}
