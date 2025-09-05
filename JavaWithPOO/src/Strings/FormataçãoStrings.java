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
		
		// Exibição de um inteiro com diferentes especificadores:
		int valorInteiro = 65;
		System.out.printf("%d%n", valorInteiro);  // 65
		System.out.printf("%o%n", valorInteiro);  // 101
		System.out.printf("%#x%n", valorInteiro);  // 41   x em minuscule, X maiúsculas
		System.out.printf("%#X%n", valorInteiro); // 0X41  prefixo # -> Exibe que é Hexadecimal
		System.out.printf("%b%n", valorInteiro);  // true
		System.out.printf("%c%n", valorInteiro);  // A
		System.out.printf("%s%n", valorInteiro);  // 65
		System.out.printf("%h%n", valorInteiro);  // 41 gerado pelo hashcode
		
		// Exibição de um double com diferentes especificadores:
		double valorDouble = 62.75;
		System.out.printf("%f%n",valorDouble);   // 62,750000 Exibe como decimal normal com 6 casas decimais
		System.out.printf("%a%n",valorDouble);   // 0x1.f6p5  Exibe o valor decimal em hexadecimal
		System.out.printf("%e%n",valorDouble);   // 6,275000e+01 Exibe o decimal em notação em científica
		System.out.printf("%g%n",valorDouble);   // 62,7500 Exibe em notificação cientifica ou em notação comun com 4 digits após à vírgula o menor é escolhido
		System.out.printf("%#a%n",valorDouble);  // 0x1.f6p5 Exibe em hexadecimal minusculas
		System.out.printf("%#A%n",valorDouble);  // 0X1.F6P5 Exibe em hexadecimal Maiúsculas
		System.out.printf("%b%n",valorDouble);   // true Exibe em booleano null ou nao
		System.out.printf("%s%n",valorDouble);   // 62.75 Exibe em String
		System.out.printf("%h%n",valorDouble);   // 404f6000 Hexadecimal com hashcode
		
		
		// Símbolos complementos
		double preco = 47.5;
		System.out.printf("|%.2f|%n",preco);    // |47,50| .2 -> informa que será com 2 casas após a vírgula
		System.out.printf("|%6.2f|%n",preco);   // | 47,50| 6. -> numero antes do ponto informa a quantidade de casas que vai complementa com espaços a esquerda
		System.out.printf("|%-6.2f|%n",preco);  // |47,50 | -6. -> complementa com espaços a direita
		System.out.printf("|%06.2f|%n",preco);  // |047,50| 06. -> complementa com 0
		int qtd = 71;
		System.out.printf("|%d|%n",qtd);     // |71|
		System.out.printf("|%6d|%n",qtd);    // |    71|
		System.out.printf("|%-6d|%n",qtd);   // |71    |
		System.out.printf("|%06d|%n",qtd);   // |000071|
	
		// Separadores, Exibição de negativos e combinações
		double saldoPos = 7654.321;
		System.out.printf("|%.2f|%n",saldoPos);         // |7654,32| .2f -> Mostrando somente com 2 casas por mais que tenha 3
		System.out.printf("|%,.2f|%n",saldoPos);        // |7.654,32| ,. -> Mostrando com os separadores de Milhar
		
		double saldoNeg = -7654.321;
		System.out.printf("|% ,.2f|%n",saldoNeg);       // |-7.654,32|  ,.2f -> se positivo ele adicona um espaço, se nao exibe o valor negativo
		System.out.printf("|% ,.2f|%n",saldoPos);       // | 7.654,32|
		System.out.printf("|%+,.2f|%n",saldoNeg);       // |-7.654,32|
		System.out.printf("|%+,.2f|%n",saldoPos);       // |+7.654,32| +,.2f-> ao inves de adicionar o espaço vazio adicionamos o sinal de '+'
		System.out.printf("|%(,11.2f|%n",saldoNeg);		// | (7.654,32)| 11 espaços com separador de milhar negativo entre parenteses e positivo deixa espaço no inicio
		System.out.printf("|%(,011.2f|%n",saldoPos);    // | 007.654,32|
		
		listarProdutos();
		
	}
	
	public static void listarProdutos() {
		String[] nomes = new String[]
			{"Abacaxi", "Banana", "Laranja", "Morango", "Uva"};
		
		double[] precos = new double[]
			{4.25, 2.33, 2.99, 7.89, 11.79};
		
		int[] quantidades = new int[]
			{423, 26, 365, 811, 712};
		
		System.out.printf("%-10s|%7s | %7s%n", "Nome", "Preço", "Estoque");
		System.out.println("----------------------------");
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("%-10s|%7.2f | %07d%n", nomes[i], precos[i], quantidades[i]);
		}
		
	}
	
	
}
