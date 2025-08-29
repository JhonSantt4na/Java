package Exercicios.retangulo;

import java.util.Scanner;

public class Retangulo {
	/**
	 * @Atividade_01:
	 * 1. Faça um programa em Java que leia as dimensões de um retângulo
	 * e mostre a sua área.
	 * */
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimensões de um Retângulo");
		
		System.out.print("Qual a Altura do Retângulo:");
		double height = sc.nextDouble();
		
		System.out.print("Qual a Largura do Retângulo:");
		double width = sc.nextDouble();
		System.out.println();
		
		System.out.println("Processando...");
		Thread.sleep(1000);
		double sum = width * height;
		
		System.out.format("A área do Retângulo é : %dm²", (int)sum);
		sc.close();
	}
}
