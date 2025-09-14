package Collection.Exercicios.linkedList;

import java.util.LinkedList;

public class InsercaoOrdenada {
	/**
	 * Crie um metodo que recebe um LinkedList<Integer> e um número,
	 * e insere o número na posição correta para manter a lista ordenada.
	 * */
	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<>();
		
		lista.add(2);
		lista.add(4);
		lista.add(7);
		lista.add(10);
		
		System.out.println("Antes da inserção: " + lista);
		
		System.out.println("Depois da inserção de 5: " + lista);
		
		// Inserindo o número 1
		InsertOrdenado(lista, 1);
		
		System.out.println("Depois da inserção de 1: " + lista);
		
		// Inserindo o número 12
		InsertOrdenado(lista, 12);
		
		System.out.println("Depois da inserção de 12: " + lista);
	
	}
	
	public static LinkedList<Integer> InsertOrdenado(LinkedList<Integer> list, int numero){
		int i = 0;
		
		while (i < list.size() && list.get(i) < numero) {
			i++;
		}
		
		list.add(i, numero);
		return list;
	}
}