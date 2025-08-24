package variaveis_Tipos_Operadores_02;

public class operadores {
	public static void main(String[] args) {
		/**
		 * 3 Tipos de operadores :
		 * @Basicos : + - / * %
		 * perg: Se tivermos valores com tipos diferentes?
		 * ex: int v1 = 100;		e		float v2 = 200;
		 * Resp: Podemos armazenar tudo em float porem podemos perder a precisão tipo: 99.999
		 * */
		
		
		int v1 = 100;
		int v2 = 200;
		
		int r1 = v1 + v2;
		int r2 = v2 - v1;
		int r3 = v1 * v2;
		int r4 = v2 / v1;  // Armazena somente a parte inteira
		int r5 = v2 % v1;  // Armazena o resto da Divisão inteira (pode ser usado com float)
		
		System.out.println("Soma: " + r1);  		// Soma: 300
		System.out.println("Subtração: " + r2);		// Subtração: 100
		System.out.println("Multiplicação: " + r3);	// Multiplicação: 20000
		System.out.println("Divisão: " + r4);		// Divisão: 2
		System.out.println("Modulo: " + r5);		// Modulo: 0
		
		/**
		 * @Prefixo_e_Posfixo
		 *		incremento  ++
		 *		decremento 	--
		 * */
		
		int p1 = 10;
		System.out.println(p1++);  // Posfixo - apos o valor: nesse caso de incremento
		System.out.println(++p1);  // Prefixo - antes do valor: entao exibira 10 (Porque imprimimos depois fazemos a operação)
		
		/**
		 * @Composto
		 *		+=5		-> valor Atual Somado Com 5
		 *		-=5		-> valor Atual subtraído Com 5
		 *		*=5		-> valor Atual multiplicado Com 5
		 *		/=5		-> valor Atual dividido Com 5;
		 * 		%=5		-> valor Atual modulado Com 5
		 * */
		
		int c1 = 10;
		c1+=5;
		
		System.out.println(c1);  // return 15
		
		
		/**
		 * @Ordem_de_Precedencia
		 *
		 *	Prioridade-> Operador(es) 		-> Descrição 									-> Associatividade
		 * 	1º () 							-> Parênteses (agrupamento)
		 *	2º ++ -- (pós-fixados) 			-> Incremento/decremento pós-fixado							-> Esquerda → Direita
		 *	3º ++ -- + - ~ ! (prefixados)	-> Incremento, decremento, unários, negação					-> Direita → Esquerda
		 *	4º (tipo)						-> Cast (conversão de tipo) = Direita → Esquerda			-> Direita → Esquerda
		 *	5º * / %						-> Multiplicação, divisão, módulo = Esquerda → Direita		-> Esquerda → Direita
		 *	6º + -							-> Soma, subtração											-> Esquerda → Direita
		 *	7º << >> >>>					-> Deslocamento de bits 									-> Esquerda → Direita
		 * 	8º < > <= >= instanceof			-> Comparações												-> Esquerda → Direita
		 * 	9º == !=						-> Igualdade e diferença									-> Esquerda → Direita
		 *	10º &							-> AND bit a bit											-> Esquerda → Direita
		 *  10º ^							-> XOR bit a bit											-> Esquerda → Direita
		 *  12º `							-> `														-> OR bit a bit
		 *  13º &&							-> E lógico (curto-circuito)								-> Esquerda → Direita
		 *	14º ?:							-> Operador ternário										-> Direita → Esquerda
		 *	15º =, +=, -=, *=, /=, %= etc.	-> Atribuição e operadores compostos						-> Direita → Esquerda
		 *
		 * Use parênteses para deixar clara a ordem desejada, mesmo que você saiba as regras de precedência.
		 * Isso melhora a legibilidade e evita bugs difíceis de encontrar.
		 * */
		
		int vA = 12;
		int vB = 9;
		int vC = 6;
		int vD = 3;
		
		int rs1 = vA + vB / vC;				// vB / vC + vA
		int rs2 = (vA + vB) / vC;			// vA + vB / vC
		int rs3 = vA / vC * vD + vB;		// vA / vc * vD + vB
		int rs4 = vA / (vC * (vD + vB));	// vD + vB * vC / vA
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs2: " + rs2);
		System.out.println("rs3: " + rs3);
		System.out.println("rs4: " + rs4);
		
	}
}
