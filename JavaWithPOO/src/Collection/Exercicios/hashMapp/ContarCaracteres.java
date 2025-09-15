package Collection.Exercicios.hashMapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarCaracteres {
	/**
	 * Contar caracteres repetidos
	 * Descrição:
	 * Dada uma String, retorne um Map com a contagem de cada caractere (ignorando espaços).
	 * Exemplo:
	 * Input: "banana"
	 * Output: {b=1, a=3, n=2}
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Digite uma Palavra: ");
		String palavra = sc.next();
		
		char[] letras = palavra.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char cha : letras){
			if (map.containsKey(cha)){
				int contadorAtual = map.get(cha);
				map.put(cha, contadorAtual + 1);
			}else {
				map.put(cha,1);
			}
		}
		
		for (Map.Entry<Character, Integer> p : map.entrySet()){
			System.out.printf("%c: %d%n", p.getKey(), p.getValue());
		}
	
		sc.close();
	}
	
}
