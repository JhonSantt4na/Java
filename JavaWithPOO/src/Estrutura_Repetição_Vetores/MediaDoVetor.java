package Estrutura_Repetição_Vetores;

import java.io.IOException;
import java.util.Scanner;

public class MediaDoVetor {
	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * @Cálculo_da_média_do_vetor1
		 */
		int[] vetor1 = {13,25,43,78,33};
		int somaVetor1 = 0;
		for (int i = 0; i < vetor1.length;i++) { // Com for
			somaVetor1 += vetor1[i];
		}
		System.out.println("A média do vetor1 é : "+ (float)somaVetor1/vetor1.length);
		
		/**
		 * @Cálculo_da_média_do_vetor2
		 */
		int[] vetor2 = {54, 82, 26, 51, 26};
		int somaVetor2 = 0;
		for (int valor : vetor2) { // com ForEach
			somaVetor2 += valor;
		}
		System.out.println("A média do vetor2 é : "+ (float)somaVetor2/vetor2.length);
		
		/**
		 * @Vetor1_na_ordem_inversa
		 * */
		System.out.println("Vetor1 na ordem inversa:");
		for (int i = vetor1.length -1; i >= 0; i--){   // inicia no tamanho total do vetor e vai decrementando
			System.out.format("%d, ", vetor1[i]);
		}
		System.out.println();
		
		/**
		 * @Soma_de_dois_vetores
		 * */
		int[] vetorSoma = new int[5];
		for (int i = 0; i < vetor1.length; i++){
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}
		for (int valor : vetorSoma) {
			System.out.format("%d, ", valor);
		}
		System.out.println();
		
		/**
		 * @Exibição_de_menu_console
		 * criamos a var opção:
		 * iniciamos o Scanner
		 * entramos no do e limpa o terminal
		 * imprime as opções
		 * pega a opção do usuario
		 * inicia um switch com a opção que ele escolheu como condição
		 * faz os cases
		 * fecha com o while enquanto for diferente da condição de parada
		 * fecha o Scanner
		 * */
		
		int op;
		Scanner sc = new Scanner(System.in);
		do {
			//clearScreen();
			System.out.println("1 - Jogar");
			System.out.println("2 - Sair");
			System.out.print("Opção desejada :");
			op = sc.nextInt();
			switch (op) {
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
		}while (op != 2);
		sc.close();
		System.out.println("Saiu!");
		
		
		
		/**
		 * @Cálculo_dos_N_primeiros_números_primos
		 * */
		
		int[] primos = new int[1000];
		int qtdePrimos = 0;
		int valorAtual = 1;
		
		boolean ehPrimo = true;
		while(qtdePrimos < primos.length) {
			for (int i = 2; i < valorAtual; i++) {
				if (valorAtual % i == 0){
					ehPrimo = false;
					break;
				}
			}
			
		}
		
		if (ehPrimo) {
			qtdePrimos ++;
			primos[qtdePrimos-1] = valorAtual;
			System.out.println("Número primo encontrados: " + valorAtual);
		}
	}
	
	private static void clearScreen() throws IOException, InterruptedException {
		// Metodo auxiliar simulando uma limpeza de terminal;
		// new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		// Simulado
		for (int i = 0; i < 100; i++) {
			System.out.println();;
		}
	}
}
