package Exercicios.ExtremidadeVetor;

import java.util.Scanner;

public class ExtremidadeVetor {
	/**
	 * @Exercicio_08: Faça um programa em Java que leia as coordenadas (x,y) da extremidade de um vetor que
	 * parte do ponto (0,0) e que, a partir disso, calcule e mostre a inclinação em graus em relação ao
	 * vetor do eixo X positivo
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inclinação do vetor: ");
		
		System.out.print("Digite o eixo X da coordenada: ");
		int eixoX = sc.nextInt();
		
		System.out.print("Digite o eixo Y da coordenada: ");
		int eixoY = sc.nextInt();
		
		// Calculo
		 double res = Math.atan2(eixoY, eixoX);
		 double anguloGrau= res * 180 / Math.PI;
		
		System.out.println("Inclinação é de " + anguloGrau + "° Graus.");
		sc.close();
	}
}
