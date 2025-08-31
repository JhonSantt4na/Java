package Exercicios.primos;

import java.util.Scanner;

public class NumerosPrimos {
	/**
	 * @Exercicio_3: Faça um programa em Java que leia um número inteiro
	 * e mostre a quantidade de números primos positivos menores do que o número lido
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro:");
		int num = sc.nextInt();
		int qtd_divisores_positivos = 0;
		
		for(int i = 2; i < num; i++){
			if (isPrimo(i)){
				qtd_divisores_positivos++;
			}
		}
		
		System.out.println("Quantidade de números primos menores que " + num + ": " + qtd_divisores_positivos);
		sc.close();
	}
	
	public static boolean isPrimo(int n) {
		if (n<=1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++){
			if (n % i == 0) return false;
		}
		return true;
	}
}
