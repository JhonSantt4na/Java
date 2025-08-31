package Exercicios.processamento;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Processamento {
	/**
	 * @Exercicio5 : Faça um programa em Java que leia um vetor de 5 elementos e
	 * mostre o maior valor, o menor valor, a média aritmética, os elementos pares e os elementos ímpares.
	 * */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 números inteiros: (press enter for next digit)");
		
		int[] elementos = new int[5];
		
		ArrayList<Integer> elementos_pares = new ArrayList<>(5);
		ArrayList<Integer> elementos_impares = new ArrayList<>(5);
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		float media;
		
		for(int i = 0; i < elementos.length; i++) {
			elementos[i] = sc.nextInt();
			
			if (elementos[i] > 0 && elementos[i] < menor){
				menor = elementos[i];
			}
			
			if (elementos[i] > maior){
				maior = elementos[i];
			}
			
			// Populando pares e impares
			if (i % 2 == 0) {
				elementos_pares.add(elementos[i]);
			}else {
				elementos_impares.add(elementos[i]);
			}
		}
		
		System.out.println("Processando os Dados...");
		Thread.sleep(1000);
		
		System.out.print("Números Pares inseridos :  ");
		for (int valor : elementos_pares) {
			System.out.print(valor + ", ");
		}
		System.out.println();
		
		System.out.print("Numeros Impares inseridos : ");
		for (int valor : elementos_impares) {
			System.out.print(valor + ", ");
		}
		System.out.println();
		
		// Calculo media
		int soma = 0;
		for (int valor : elementos) {
			soma += valor;
		}
		media = (float) soma / 5;
		
		System.out.println("O maior número inserido foi : " + maior);
		System.out.println("O menor número inserido foi : " + menor);
		System.out.println("A media dos números inseridos foi : " + media);
		
		sc.close();
	}
	
}
