package Métodos;

import java.io.IOException;
import java.util.Scanner;

public class Metodos {
	/**
	 * @Métodos: são um dos principais blocos de construções de um programa.
	 * Razes la no paradigma de programação procedural onde eram chamados de (procedimentos, subprogramas ou rotinas)
	 * >> Obedeçem ao procedimento de Entrada, processamento e Saida;
	 * >> Segue as mesmas regras para nomes de variáveis:
	 * 			- aceita letras e numerous e o char _
	 * 			- Não pode iniciar com números
	 *
	 * >> Sempre inicializado fora do bloco main
	 * >> Muito importante para o reuso.
	 *
	 *
	 * */
	
	public static void main(String[] args) throws InterruptedException {
		
		
		/*  Obtendo Media de Vetor
		int[] vetor1 = { 13, 25, 43, 78, 33};
		int[] vetor2 = { 54, 82, 26, 51, 26};
		double res = obterMediaVetor(vetor1);
		double res2 = obterMediaVetor(vetor2);
		System.out.println(res);
		System.out.println(res2);
		*/
		
		/* Invertendo Vetor
		int[] vetorOriginal = {13, 25, 43, 78, 33};
		int[] vetorInvertido = obterVetorInvertido(vetorOriginal);
		mostrarVetor(vetorOriginal);
		System.out.println();
		mostrarVetor(vetorInvertido);
		 */
		
		/* Somando vetores
		int[] vetor1 = { 13, 25, 43, 78, 33};
		int[] vetor2 = { 54, 82, 26, 51, 26};
		int[] vetorSoma = obterSomaVetores(vetor1, vetor2);
		mostrarVetor(vetor1);
		System.out.println();
		mostrarVetor(vetor2);
		System.out.println();
		mostrarVetor(vetorSoma);
		* */
		
		// Computar vetor de primos
		int[] primos = computarVetorDePrimos(1000);
		mostrarVetor(primos);
		
		
		// Mostra menu
		//mostraMenu();
		
		//Processando Menu
		//processarMenu();
		
	}
	
	/**
	 * Modificador_de_acesso retorno nome_do_metodo (tipo do parametro e nome) { abertura do bloco de codigos
	 *			corpo do metodo ou bloco de código
	 * } fechamento do bloco de códigos
	 *
	 * */
	
	/**
	 * @Modificador_de_acesso: quem pode acessar esse metodo, qual classe/pacotes
	 *
	 * @static: Auto instantiable
	 *
	 * @Tipo_De_Retorno: o que o nosso metodo vai retornar podendo ser: (tipo primitivo, vetores, etc.)
	 *
	 * @Nome_do_metodo: use sempre um nome que se auto se Explique começando sempre com verbo de ação ou o que faz ex: calcularImpostos, gerarRelatório, isPrimo, isValid, isAccessible, etc.
	 *  e lembrando que precisa resolver apenas 1 problema.
	 *
	 * @Parametros_de_Entradas; pode ser sem parameters, ou com um parameter do tipo que agente informar.
	 *
	 * @Corpo_Do_Metodo: Onde o processamento do nosso metodo será feito, ou seja, onde vamos analisar se o parameter enviado
	 * é valido, ou se é primo, etc. ou no caso de não ter parameters de entrada será um código que faça alguma Ação no código
	 * */
	
	// Obter media do vetor
	public static double obterMediaVetor(int[] vetor) {
		int somaVetor2 = 0;
		for(int i = 0; i< vetor.length; i++){
			somaVetor2 += vetor[i];
		}
		double resultado = (float) somaVetor2 / vetor.length;
		return resultado;
	}
	
	// Obter vetor invertido
	public static int[] obterVetorInvertido(int[] vetor) {
		int[] vetorInvetido = new int[vetor.length];
		int iVetorInvetido = 0;
		for (int i = vetor.length -1 ; i >= 0 ; i--) {
			vetorInvetido[iVetorInvetido] = vetor[i];
			iVetorInvetido++;
		}
		return vetorInvetido;
	}
	
	// Mostra Vetor
	public static void mostrarVetor(int[] vetor){
		for (int valor : vetor) {
			System.out.print(valor + ", ");
		}
	}
	
	// Obter soma dos vetores
	public static int[] obterSomaVetores(int[] vetorA, int[] vetorB){
		int[] vetorSoma = new int[vetorA.length];
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
		}
		return vetorSoma;
	}
	
	// Computar Vetor de Primos
	public static int[] computarVetorDePrimos(int tamanho){
		int[] primos = new int[tamanho];
		int qtdePrimos = 0;
		int valorAtual = 1;
		while (qtdePrimos < primos.length){
			boolean ehPrimo = true;
			for (int i = 2; i < valorAtual; i++) {
				if (valorAtual % i == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			if (ehPrimo){
				qtdePrimos++;
				primos[qtdePrimos-1] = valorAtual;
			}
			valorAtual++;
		}
		return primos;
	}
	
	// Mostar menu
	public static void mostraMenu() throws InterruptedException {
		int opc;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1 - Jogar");
			System.out.println("2 - Sair");
			System.out.print("Opção desejada: ");
			opc = sc.nextInt();
			switch (opc) {
				case 1:
					System.out.println("Jogando...");
					Thread.sleep(2000);
					System.out.println("Acabou o Jogo!");
					Thread.sleep(1000);
					break;
				case 2:
					System.out.println("Saindo...");
					Thread.sleep(1000);
					break;
				default:
					System.out.println("Opção invalida!");
					Thread.sleep(2000);
					break;
			}
		}while (opc != 2);
		sc.close();
		System.out.println("Saiu!");
	}
	
	// Obter Opção do Menu
	public static int obterOpcaoDoMenu(Scanner sc){
		System.out.println("1 - Jogar");
		System.out.println("2 - Sair");
		System.out.print("Opção desejada: ");
		int opcaoDesejada = sc.nextInt();
		return opcaoDesejada;
	}
	
	// Execultando opção do Menu
	public static void executarOpcaoDoMenu(int opc) throws InterruptedException{
		switch (opc) {
			case 1:
				System.out.println("Jogando...");
				executarJogo();
				System.out.println("Acabou o Jogo!");
				Thread.sleep(1000);
				break;
			case 2:
				System.out.println("Saindo...");
				Thread.sleep(1000);
				break;
			default:
				System.out.println("Opção invalida!");
				Thread.sleep(2000);
				break;
		}
	}
	
	// Mock executando Game
	public static void executarJogo() throws InterruptedException {
		for (int i = 1; i < 6; i++) {
			Thread.sleep(1000);
			System.out.format("Passou da fase %d...%n", i);
		}
		System.out.println("Você venceu!");
		Thread.sleep(1000);
	}
	
	// Menu Infinito
	public static void processarMenu() throws InterruptedException {
		int opc;
		Scanner sc = new Scanner(System.in);
		do {
			opc = obterOpcaoDoMenu(sc);
			executarOpcaoDoMenu(opc);
		} while (opc != 2);
		sc.close();
		System.out.println("Programa Finalizado.");
	}
	
	
	
	/**
	 * @Observações:
	 *  - Em alguns casos o metodo pode acabar não retornando nada se usa a palavra reservada void no lugar de retorno
	 * esse metodo executa algo mais não retorna, ou seja, algo mais visual ou processado;
	 *
	 * - quando não temos um tipo de vetor definido o uso do return é opcional exceto se você queira
	 * sair do metodo.
	 *
	 * - Parameters devem ser separados com ',' vírgulas e devem ser passados como variáveis declaradas
	 * sempre indicando o tipo e o nome. A ordem que é passado tmb importa, pois o primeiro valor alimenta o primeiro parameter, etc.
	 *
	 * - Por padrão quando passamos uma variable ou valor como parameter um novo espaço na memória e criado para
	 * ser armazenado uma cópia do valor da variable, o valor original não é modificado.
	 *
	 * - Métodos podem não ter parameters e nem tipo de retorno
	 * */
}
