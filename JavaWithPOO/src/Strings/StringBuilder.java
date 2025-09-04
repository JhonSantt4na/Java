package Strings;

public class StringBuilder {
	
	/**
	 * @StringBuilder
	 *
	 * - Buffer de string mutável, uma representação em memória que armazena valores do tipo string que podem ser modificados sem a geração de novas Stings
	 * - constrói “strings” de forma mais eficiente;
	 * - forma de inicializar:
	 *		- StringBuilder sb1 = new StringBuilder();
	 *		- StringBuilder sb2 = new StringBuilder(100); com tamanho alocado
	 *
	 * - Contem os seguintes metodos de manipulação:
	 * 		- append() -> Adiciona no fim da String
	 * 		- insert() -> Adiciona numa posição específica
	 * 		- toString() -> Trasforma o buffer em um unico valor string
	 * */
	
	public static void main(String[] args) {
		java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
		sb1.append("Java");  // Adicionar no final essa String
		sb1.insert(0, "Programação com ");  // Na possição 0 adicionar essa substring
		System.out.println(sb1.toString());
	}
	// Em comparação com o Metodo String o uso do String builder é muito mais eficiente em tempo de processamento e de memória
}
