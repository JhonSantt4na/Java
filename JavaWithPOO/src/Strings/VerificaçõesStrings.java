package Strings;

public class VerificaçõesStrings {
	/**
	 * @Metodos que fazem verificações:
	 *
	 * - .contains() -> Verifica se contem um valor string contem outro valor string
	 * retorna um booleano
	 *
	 * - .startWith() -> verifica se a String comerça com determinada substring passada
	 *retorna um booleano
	 *
	 * - .endWith() -> verifica se a String termina com determinada substring passada
	 *retorna um booleano
	 *
	 * - .indexOf() -> retorna a posição da primeira ocorrência de uma substring
	 *retorna um indice int
	 *
	 * - .lastIndexOf() -> retorna a posição da última ocorrência de uma substring
	 *retorna um indice int
	 *
	 * - .isEmpty() -> Verifica se a String está vazia
	 *retorna um booleano
	 *
	 * - .length() -> Retorna o tamanho de uma String
	 *retorna o tamanho em int
	 * */
	
	public static void main(String[] args) {
		String s1 = "POO com Java";
		
		// .contains()
		System.out.println(s1.contains("JAVA")); // False por conta do Uppercase
		System.out.println(s1.toUpperCase().contains("JAVA")); // True já que esta comparando tudo em Uppercase
		
		// .startWith()
		System.out.println(s1.startsWith("POO"));  // True comerça com "POO"
		
		// .endWith()
		System.out.println(s1.endsWith("a"));  // True termina com "a"
		
		// .indexOf()
		System.out.println(s1.indexOf("a"));  // Retorna a posição index da primeira aparição da letra buscada
		
		// .lastIndexOf()
		System.out.println(s1.lastIndexOf("a"));  // Retorna a posição index da última aparição da letra buscada
		
		// .isEmpty()
		System.out.println(s1.trim().isEmpty()); //False limpamos os espaços vazio da lateral e verificamos se a String esta vazia
		
		// .length()
		System.out.println(s1.length());   // 12 Retorna o tamanho da String
	}
}
