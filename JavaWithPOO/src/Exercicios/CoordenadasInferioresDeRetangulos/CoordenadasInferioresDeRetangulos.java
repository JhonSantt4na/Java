package Exercicios.CoordenadasInferioresDeRetangulos;

import java.util.Scanner;

public class CoordenadasInferioresDeRetangulos {
	/**
	 * @Exercicio_09: Faça um programa em Java que leia as coordenadas inferior esquerda e superior direita de
	 * dois retângulos e determine se esses retângulos possuem alguma sobreposição
	 * */
	
	public static void main(String[] args) {
		
		// As duas coordenadas de baixo do retangulo A, precisa ser menor que as duas coordenadas de baixo do retangulo B
		// e as duas coordenadas de cima do retangulo B, precisa ser maior que as duas coordenadas de cima do retangulo A
		
		// B1 inferior precisa ser Maior que A1 inferior
		// A2 superior precisa ser Menor que B2 superior
		
		Scanner sc = new Scanner(System.in);
		double x1A = 10;
		double y1A = 10;
		double x2A = 10;
		double y2A = 10;
		
		double x1B = 10;
		double y1B = 10;
		double x2B = 10;
		double y2B = 10;
		
		if ((x2B > x1A && y2B > y1A) && ( x1B < x2A && y1B < y2A)){
			System.out.println("Estão colidindo.");
		}else {
			System.out.println("Não estão colidindo");
		}
		
	}
		
}
