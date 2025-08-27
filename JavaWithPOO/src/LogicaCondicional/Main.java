package LogicaCondicional;

public class Main {
	public static void main(String[] args) {
		
		int c1 = 6;
		int c2 = 6;
		
		System.out.println(c1 + " > " + c2 + " :: " + (c1 > c2));
		System.out.println(c1 + " >= " + c2 + " :: " + (c1 >= c2));
		System.out.println(c1 + " < " + c2 + " :: " + (c1 < c2));
		System.out.println(c1 + " <= " + c2 + " :: " + (c1 <= c2));
		System.out.println(c1 + " == " + c2 + " :: " + (c1 == c2));
		System.out.println(c1 + " != " + c2 + " :: " + (c1 != c2));
		System.out.println();
		System.out.printf("%d >  %d :: %b%n", c1, c2, c1 > c2);
		System.out.printf("%d >= %d :: %b%n", c1, c2, c1 >= c2);
		System.out.printf("%d <  %d :: %b%n", c1, c2, c1 < c2);
		System.out.printf("%d <= %d :: %b%n", c1, c2, c1 <= c2);
		System.out.printf("%d == %d :: %b%n", c1, c2, c1 == c2);
		System.out.printf("%d != %d :: %b%n", c1, c2, c1 != c2);
		System.out.println();
		
		/**
		 * @Condição_Ternaria
		 * (Condição)? :
		 *
		 * */
		
		
		int v3 = 10;
		int v4 = 0;
		//int res = v3 / v4; // Erro de Divisão por 0
		int res = (v4 > 0) ? v3 / v4 : 0;
		System.out.format("Resultado: %d%n", res);
		
		
		/**
		 * @if_(condição):
		 * Se condição for verdade execulta o bloco de codigo dentro do seu escopo delimitados pelas abertura e fechamento de {}
		 * se for somente uma linha não tem necessidade de adicionar as "{ }"
		 *
		 * @else:
		 * caso a condição passada no if nao ser atendida, vamos executar o bloco de código do escolto contido no else
		 * comandos de linhas unicas nao precisa das {}
		 * */
		
		int r1 = 10;
		int r2 = 0;
		int r = 0;
		
		if (r2 != 0){ //se (condição) :: Se essa condição for atendida true
			r = r1 / r2;                     // Vamos executar todos os comandos nesse escopo
			System.out.format("Resultado: %d%n", r);
		} else      //se não:: Se não for atendida false
			System.out.println("Divisão impossível");     // Executarar todos os comandos nesse escopo
		
		// Bloco com mais de uma linha de codigo adiciona as chaves{}
		// Bloco com apenas uma linha {} opcionais
		
		int x1 = 10;
		int x2 = 5;
		int resposta = 0; // ideal ser inicializada fora para ser visivel dentro e fora dos blocos
		
		if (x1 > x2) { // <-- Abertura de bloco de código
			//int resposta =x1 - x2; erro pois não podemos inicializar a variable 2x
			resposta = x1 - x2; // Somente isso esta condicionado no bloco do if
			System.out.println("A variável x1 é maior.");
		} // <-- Fechamento de bloco de código: Muito importante tiver-se mais de 1 linha de código
		System.out.println("Saindo do Programa");
		
		// Tudo que for criado dentro do bloco de código so temos visibilidade dele para dentro, por exemplo, se for aninhado após a abertura do bloco de código
		// e quem tiver fora não tem acesso às variáveis de dentro do bloco, assim que o bloco termina ele excluir essa variable, ou seja, so funciona dentro do proprio ciclo de vida do bloco
		
		
		
		/**
		 * @Condição_composta
		 *
		 * @else_if_(condição):
		 * Usado para caso a primeira condição não for atendida, mas que agente não queira que caia no else por algum motivo específico
		 *
		 * @if_aninhado:
		 * Basicamente é como se fosse um if else por cima do outro. Temos a forma compacta com o uso do @Else_if
		 * e a forma não compacta mais visual conseguimos ver um if dentro do outro
		 *
		 * @Duplos_if:
		 * basta abrir mais um if no nosso código dentro do bloco do if especifico.
		 * Ou podemos usar os operadores lógicos:
		 *
		 */
		
		int e1 = 10;
		int e2 = 1;
		
		char op = 'a';
		
		// Forma compacta
		if (op == 'a') {
			System.out.format("Adição: %d%n", e1 + e2);
		}else if (op == 's') {
			System.out.format("Subtração: %d%n", e1 - e2);
		}else if (op == 'm') {
			System.out.format("Multiplicação: %d%n", e1 * e2);
		}else if (op == 'd') {
			if (e2 != 0) {
				System.out.format("Divisão: %d%n", e1 / e2);
			}else {
				System.out.println("Divisão por 0 impossivel !");
			}
		}else {
			System.out.println("Operação não reconhecida.");
		}
		
		// Forma não compacta
//		if (op == 'a') {
//			System.out.format("Adição: %d%n", e1 + e2);
//		}else {
//			if (op == 's') {
//				System.out.format("Subtração: %d%n", e1 - e2);
//			}else {
//				if (op == 'm') {
//					System.out.format("Multiplicação: %d%n", e1 * e2);
//				}else {
//					if (op == 'd') {
//						System.out.format("Divisão: %d%n", e1 / e2);
//					}else {
//						System.out.println("Operação não reconhecida.");
//					}
//				}
//			}
//		}
		System.out.println();
	
	
		/**
		 *
		 * @operadores_logicos:
		 *
		 * * & -- E: se os dois lados for true
		 * * | -- ou: um dos lados true ou um, ou o outro
		 * ^ -- ou exclusivo: apenas 1 dos lados tem que ser true
		 * ! -- negação: inverte o valor atual se é true vira false, se for false vira true
		 *
		 * */
		
		boolean t1 = true;
		boolean t2 = true;
		
		System.out.format("t1 & t2 : %b & %b = %b%n", t1,t2, t1 & t2);
		System.out.format("t1 | t2 : %b | %b = %b%n", t1,t2, t1 | t2);
		System.out.format("t1 ^ t2 : %b ^ %b = %b%n", t1,t2, t1 ^ t2);
		System.out.format("!t1     : !%b     = %b%n", t1,!t1);
		
		
		//t1 e t2 equivale a duas expressões/condições super complexa que retornam booleano e com
		// os operadores lógicos podemos montar a tabela verdade
		
		// Segue esse exemplo:
		
		int pessoas = 30;
		float areaM2 = 100;
		
		// Precisamos verificar se pessoas é != de 0
		// Ao usar o operador lógico simples se a primeira não der false ele vai fazer normalmente a divisao por 0
		// com && condicional ele quando a primeira condição der false ele já da false
		// funciona igual com o 'ou condicional' || analisa a primeira se for false ele nem vai alem.
		
		
		if ((pessoas > 0) && (areaM2 / pessoas < 4)){
			System.out.println("Risco de Contágio está alto.");
		}else {
			System.out.println("Risco de Contágio está baixo.");
		}
		
		
		/**
		 * @Swicth -> Estrutura condicional por cases, ou casos
		 * avalia a expressão, constante, variável ou condição entre os parentheses
		 * e procura uma corresponding do resultado nos casos abaixo.
		 * caso o resultado for 'x' ele faz y e sai do bloco (Muito importante sair do bloco)
		 * break é a última instrução de cada case
		 * não é necessário ter abertura e fechamento de bloco independence das quantidades de instruções/linhas no nosso bloco do cases
		 * ‘default’: serve para ter uma resposta padrão caso nenhum dos casos seja correspondente a resolução da expressão/condição
		 * */
		
		int b1 = 10;
		int b2 = 2;
		char opc = 'a';
		
		switch (opc) { // so podemos colocar expressoes que retornem valores ordinais, tipos (Inteiros e char)
			case 'a':
				System.out.format("Adição: %d%n", b1 + b2);
				break;
			case 's':
				System.out.format("Subtração: %d%n", b1 + b2);
				break;
			case 'm':
				System.out.format("Multiplicação: %d%n", b1 + b2);
				break;
			case 'd':
				if (e2 != 0) {
					System.out.format("Divisão: %d%n", e1 / e2);
				}else {
					System.out.println("Divisão por 0 impossivel !");
				}
				break;
			default:
				System.out.println("Operação não reconhecida.");
		}
		
	}
}