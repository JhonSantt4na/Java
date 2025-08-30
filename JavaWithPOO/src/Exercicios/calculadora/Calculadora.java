package Exercicios.calculadora;

import java.util.Scanner;

public class Calculadora {
	/**
	 * @Exercicio_02: Faça um programa em Java que leia dois valores inteiros (x1 e x2) e
	 * exiba o resultado das quatro operações matemáticas básicas sobre eles.
	 * */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de Números Inteiros:");
		
		System.out.print("Qual o 1° número:");
		int x1 = sc.nextInt();
		
		System.out.print("Qual o 2° número:");
		int x2 = sc.nextInt();
		
		System.out.println("Calculando Valores...");
		Thread.sleep(1000);
		
		int soma = x1 + x2;
		int sub = x2 > x1 ? x2 - x1 : x1 - x2;
		int multi = x1 * x2;
		int div = x1 == 0 || x2 == 0 ? 0 : x1 / x2;
		
		System.out.format("A soma de %d + %d = %d%n", x1, x2, soma);
		System.out.format("A subtração de %d - %d = %d%n", x1, x2, sub);
		System.out.format("A multiplicação de %d * %d = %d%n", x1, x2, multi);
		System.out.format("A divisão de %d / %d = %d%n", x1, x2, div);
		
		sc.close();
	}
}
