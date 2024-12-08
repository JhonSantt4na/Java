package _10_1_Generics;

import java.util.ArrayList;
import java.util.List;

public class Intro {
	// Permitem que classes, interfaces e metodos, possam ser parametrizados
	// por tipos
	// Beneficios:
	// Reuso, type safety, Performance
	// Uso comun:
	// Coleções
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// Adicionando elemento tipo string
		list.add("Maria");
		// Retorno tmb tipo String
		String name = list.get(0);
	}
	
}
