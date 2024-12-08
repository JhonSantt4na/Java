package _09_Interfaces.InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sintaxe_Problem01 {
	// Sintaxe :
	/*
	* public  interface Comparable<T> {
		int compareTo (T o);
	}
	* Exemplo de uso:
	 */
	
	public static void main(String[] args) {
		//Instanciando uma lista de String
		List<String> list = new ArrayList<>();
		// Caminho
		String path = "/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Interfaces/Sintaxe_Problem01/in.txt";
		// Leitura do Arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Lendo uma linha do arquivo
			String name = br.readLine();
			// Enquanto for diferente de null vamos adicionar na lista e pular uma linha
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			// Depois vamos usar o Collctions sort para ordena a nossa lista
			Collections.sort(list);
			// Percorer a lista exibindo tudo dela
			for (String s : list) {
				System.out.println(s);
			}
			// Capturando alguma exeption coso tenha
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
