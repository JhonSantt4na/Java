package Collection.Exercicios.arrayList;

import java.util.ArrayList;

public class InverterLista {
	/**
	 * Faça um metodo que recebe um ArrayList<Integer>
	 * e retorna outro ArrayList com os elementos na ordem reversa.
	 * */
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
		
		System.out.println(numeros);
		System.out.println(reverterLista(numeros));
		
	}
	
	public static ArrayList<Integer> reverterLista(ArrayList<Integer> listas){
		ArrayList<Integer> arrayInvertido = new ArrayList<>();
		for (int i = listas.size() - 1; i >= 0; i--) {
			arrayInvertido.add(listas.get(i));
		}
		return arrayInvertido;
	}
	
}
