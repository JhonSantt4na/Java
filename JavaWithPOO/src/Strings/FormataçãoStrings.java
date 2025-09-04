package Strings;

import java.lang.StringBuilder;
import java.util.Formatter;

public class FormataçãoStrings {
	/**
	 * Diferentes formas de retornar o valor retornado para melhorar a legibilidade do usuario;
	 *
	 * System.out.format("texto a ser formatado %d", v1)
	 * sendo o '%d'= especificadores de formatação
	 * e v1 a variable que vai tomar o lugar o especificador
	 * */
	
	public static void main(String[] args) {
		
		String formatado = "formatado";
		String s1 = String.format("texto a ser %s", formatado); // substitue -> %s por -> o valor que ta dentro da variable formatado
		System.out.println(s1);
		
		// Ou exibir direto na tela da mesma forma
		System.out.printf("texto com o printf a ser %s%n", formatado);
		System.out.format("texto com o format a ser %s%n", formatado);
		
		// Associação a um String Builder
		StringBuilder sb = new StringBuilder();
		Formatter fmt = new Formatter(sb);   // Criando um formatador para sb
		fmt.format("Maior inteiro: %d%n", Integer.MAX_VALUE); // com o resultado faz um append no sb
		fmt.format("Menor inteiro: %d%n", Integer.MIN_VALUE);
		fmt.close(); // Fechamos o formatador
		System.out.println(sb.toString());
		
		
		/* Principais Tipos de Especificadores:
		*
		* Especificador   -        Tipos Compatíveis                  -    Saída
		     %s			  - 	qualquer tipo				          - string
		     %d			  - 	inteiro (byte, short, int, long) 	  - inteiro decimal
		     %f			  - 	ponto flutuante (float, double)	      - número decimal
		     %n			  - 	nenhum								  - quebra a linha
		     %b			  - 	qualquer tipo						  - true se nao for nulo, false se for nulo
		     %c			  - 	character(char) e inteiro (byte, short, int) - character unicode
		     %x			  - 	inteiro (byte, short, int, long) 	  - inteiro hexadecimal
		     %o			  - 	inteiro (byte, short, int, long)      - inteiro octal
		     %a			  - 	ponto flutuante (float, double)		  - número hexadecimal
		     %e			  - 	ponto flutuante (float, double)		  - número decimal em notação cientifica
		     %g			  - 	ponto flutuante (float, double)		  - número decimal, %f ou %e, o que for menor
		     %h			  - 	qualquer tipo				          - string hexadecimal resultante do metodo hashcode()
		     %t			  - 	data/hora(long, Calendar, Date e TemporalAccessor) - datas e horas formatadas com flags adicionais
		* */
	}
}
