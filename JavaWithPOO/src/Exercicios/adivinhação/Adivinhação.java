package Exercicios.adivinhação;

import javax.swing.plaf.TableHeaderUI;
import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
	/**
	 * @Exercicio_10: Faça um programa em Java que sorteie um número inteiro aleatório entre 0 e 10
	 * e que permita ao usuário tentar adivinhá-lo até conseguir, informando quantas tentativas foram
	 * necessárias.
	 *
	 * Obs.: para gerar o número aleatório use:
	 * Random gerador = new Random();
	 * int valorSorteado = gerador.nextInt(11);
	 * */
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int valorSorteado = gerador.nextInt(11);
		int tentativas = 0;
		int valorDigitado = -1;
		
		do {
			
			System.out.print("Digite seu palpite: ");
			valorDigitado = sc.nextInt();
		
			if (valorDigitado != valorSorteado){
				Thread.sleep(1000);
				System.out.println("Você Errou... Tente novamente.");
			}
			tentativas++;
		}while (valorDigitado != valorSorteado);
		
		Thread.sleep(1000);
		System.out.println("Parabéns Voce Acertou!");
		System.out.format("Você acertou com %d, Tentativas.", tentativas);
		
		sc.close();
	}
}
