package Strings;

public class TipoStrings {
	/**
	 * Função Armazenam dados do tipo texto ou uma sequência de caracteres ‘UNICODE’ em memória
	 * sendo que cada character é um valor do tipo char com (16bits), por conta disso o espaço de memoria do tipo
	 * “String” podem variar conforme o testo que ela representa;
	 *
	 * - Ficam sempre entre aspas "" duplas, já as aspas simples são usadas para char
	 *
	 * - Podem ser concatenadas com os seguintes operadores (+, +=); Junção de duas ou mais ‘Strings’
	 *		+ : Faz a soma de duas ‘Strings’ gerando uma terceira;
	 *		+= : Adiciona uma ‘String’ a uma ‘String’ já existente
	 *
	 * - “Strings” são imutáveis; a modificação é possível, mas nos bastidores
	 * qualquer mudança gera uma nova ‘string’ em memória;
	 *
	 *  - Possível Comparar ‘Strings’ com 3 modelos diferentes:
	 *		== : Compara as referências não o conteudo de memória
	 *		equals() :
	 *		compareTo() :
	 *		Sendo equals e compareTo, presente nos próprios objetos
	 *
	 * - Forma Literal de Criar ‘String’;
	 *	String s1 = "Texto 1"; Tipo Nome = "conteudo da String entre Aspas duplas";
	 *  final int i1 = 5; final informa que não será modificado
	 *	String s2 = s1 + i1; // return 'Texto 15' e nada mudara isso
	 *
	 *	String s2 = "Instituto "; (Lixo Será coletado depois com o GarbageCollector)
	 *  String s3 = "Federal ";	(Lixo Será coletado depois com o GarbageCollector)
	 *	String s4 = s2 + s3;
	 * precisamos evitar para poupar tempo computacional de criar essas ‘Strings’ e ganhar tempo/recursos
	 *
	 *	* Sting Literal usa um espaço na memória chamado SCP (String Constant Pull) conjunto de String armazenadas
	 * conforme as string criadas no texto de forma estática, as que o compilador consegue resolver em tempo de compilação
	 *
	 *	- Criação mais rápidas;
	 *	- Reutiliza Strings iguais;
	 *
	 *  - SCP (Fica dentro do Heap, mas num local reservado para Strings)
	 *
	 * - Strings Objetos
	 *	String s1 = new String("Texto 1"); // Nos bastidores
	 *
	 *  String s2 = "ABC"; String s3 = "BCA";
	 *  String s4 = s2 + s3; será um novo objeto, pois o compilador não entende que s2 e s3 são valores que não sofreram
	 *  alterações no decorrer do programa.
	 *
	 *  * Strings Objetos usa um espaço na memória chamado Heap; armazena objetos instanciados e a variavel criada aponta para
	 *  um objeto desse tipo.
	 *
	 * 	- Criação mais lenta;
	 * 	- Sempre cria uma nova string;
	 * 	- Resolvidos no tempo de execução
	 *
	 *
	 * metodo intern: verifica se existe o valor no SCP (Adiciona la ou retorna o valor existente)
	 * Sting s9 = s8.intern(); com o == e o valor estando no SCP ele retorna true
	 *
	 * */
	
	public static void main(String[] args) {
		//criarString(999999999);
		// Tempo para criar 999999999 Strings literais = 3ms.
		// Tempo para criar 999999999 Objetos Strings = 49ms.
		
		//compararStings();
		
		
	}
	
	// Criar String
	public static void criarString(int qtd){
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < qtd; i++) {
			String s1 = "Programação Orientada a Objetos";
			String s2 = "Utilizando Java no Intellij";
		}
		long fim = System.currentTimeMillis();
		long tempoPercorrido = fim - inicio;
		
		System.out.println("Tempo para criar " + qtd + " Strings literais = " + tempoPercorrido + "ms.");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < qtd; i++) {
			String s1 = new String("Programação Orientada a Objetos");
			String s2 = new String("Utilizando Java no Intellij");
		}
		fim = System.currentTimeMillis();
		tempoPercorrido = fim - inicio;
		
		System.out.println("Tempo para criar " + qtd + " Objetos Strings = " + tempoPercorrido + "ms.");
		
	}
	
	// Comparar String
	public static void compararStings(){
		String s1 = "ABC"; //SCP
		String s2 = "ABC"; //SCP
		System.out.println(s1 == s2); // true
		
		String s3 = new String("ABC"); //Heap
		String s4 = new String("ABC"); //Heap
		System.out.println(s3 == s4); //false
		
		String s5 = s1 + s2; //Heap
		String s6 = "ABCABC"; //SCP
		System.out.println(s5 == s6); //false
		
		System.out.println(s5.intern() == s6); //true
		
		final int i1 = 5;
		String s7 = "ABC" + i1; //SCP
		String s8 = "ABC5"; //SCP
		System.out.println(s7 == s8); //true
		
		String s9 = "Programação "; //SCP
		s9 += "Java"; //Heap
		String s10 = "Programação Java"; //SCP
		System.out.println(s9 == s10); // false
		
		String s11 = s9.intern(); //SCP
		System.out.println(s10 == s11); //true
		
	}
	
}
