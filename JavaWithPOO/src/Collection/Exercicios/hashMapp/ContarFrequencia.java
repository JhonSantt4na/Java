package Collection.Exercicios.hashMapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarFrequencia {
	/**
	 * Contar frequências de palavras
	 * Descrição:
	 * Dada uma String, conte quantas vezes cada palavra aparece.
	 * Input: "java spring java map"
	 * Output: {java=2, spring=1, map=1}
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Digite uma frase : ");
		String frase = sc.nextLine();
		
		String[] fraseSplitada = frase.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String str :fraseSplitada){
			if (map.containsKey(str)){
				int contadorAtual = map.get(str);
				map.put(str, contadorAtual + 1);
			}else {
				map.put(str, 1);
			}
		}
		
		for (Map.Entry<String, Integer> p : map.entrySet()){
			System.out.printf("%s: %d%n", p.getKey(), p.getValue());
		}
		
		sc.close();
	}
	
}
