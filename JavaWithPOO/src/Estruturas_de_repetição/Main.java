package Estruturas_de_repetição;

public class Main {
	public static void main(String[] args) {
		
		/**
		 * @Estrutura_de_Repetições: São estruturas que tem blocos de códigos que seram
		 * executados de forma repetida enquanto uma condição está a ser atendida;
		 *
		 * @While(Enquanto): Enquanto a condição for verdadeira vamos executar o bloco e verificamos novamente
		 * se for verdade continuamos até ser falso.
		 *
		 *  - Condição é interpretada no início tendo a possibilidade de o bloco de cod não ser executado
		 * se for falso ele nem entra no bloco de código.
		 *
		 * - A condição pode ser uma expressão supercomplexa com operadores lógicos, etc.
		 *
		 * - Ficar sempre ligado na variavel de controle:
		 * no caso valor → se ela nunca for alterada dentro ou fora. A condição fica a ser executado de forma indefinida
		 * criando um “loop” infinito fazendo o pc travar, ou seja, tem que ser convergida para que a condição deixe de ser satisfeita
		 *
		 * */
		
		int valor = 5;
		int fatorial = 1;
		
		while (valor > 1) {
			fatorial *= valor;
			valor--;
		}
		System.out.println(fatorial);
		
		/**
		 * @DoWhile: Estrutura de repetição com teste logic no final executa o bloco de código e depois verifica se a condição
		 * está a ser atendida para repetir o bloco de código;
		 *
		 * - Ficar sempre ligado na variavel de controle: i precisa ser modificado para que atenda o fim da condição
		 *
		 * */
		
		int numero = 8;
		int limite = 10;
		int i = 1;
		System.out.println("Tabuada de " + numero);
		
		do {
			System.out.format("%d x %d = %d%n", numero,i, numero * i);
			i++;
		} while (i <= limite);
		
		
		/**
		 * @For: Assim como o while tem o teste de condição de parada no início;
		 * - totalmente controlada pelas instruções que vão dentro da condição;
		 *
		 * - Contador
		 * - Condição de parada
		 * - Incremento do contador
		 *
		 * - notação simplificada porque no início agente já deixa toda a situação de controle dificultando ter ‘loops’
		 *
		 * - tem a possibilidade de o bloco de cod não ser executado
		 * se for falso ele nem entra no bloco de código.
		 *
		 * */
		
		System.out.println("Tabuada de " + numero);
		for (int j = 1; j < limite; j++) {
			System.out.format("%d x %d = %d%n", numero,j, numero * j);
		}
		
	}
}
