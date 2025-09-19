package Collection.Exercicios.hashMapp;

import java.util.HashMap;
import java.util.Map;

public class ElementoDuplicados {
	/**
	 *	8. Verificar duplicatas com HashMap
	 * Descrição:
	 * Dado um array de inteiros, verifique se há elementos duplicados utilizando HashMap.
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 4, 103, 50, 60};
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		boolean repeat = false;
		
		for (int num : arr) {
			if (map.containsKey(num)) {
				repeat = true;
				break;
			} else {
				map.put(num, true);
			}
		}
		
		
		if (repeat){
			System.out.println("O array contem um valor repetido.");
		}else {
			System.out.println("O array não contem um valor repetido");
		}
	}
}
