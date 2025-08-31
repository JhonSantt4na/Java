package Exercicios.distanciaEuclidiana;

import java.util.Scanner;

public class DistanciaEuclidiana {
	/**
	 * @Exercicio_07:
	 * Faça um programa em Java que leia as coordenadas (x,y) de dois pontos
	 * e retorne a distância euclidiana entre tais pontos.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] coordenadaX = new int[2];
		int[] coordenadaY = new int[2];
		
		
		System.out.println("Distancia Euclidiana");
		for (int i = 0; i < 2; i++) {
			
			System.out.print("Valor da coordenadas X: ");
			int p1 = sc.nextInt();
			coordenadaX[i] = p1;
			
			System.out.print("Valor da coordenadas Y: ");
			int p2 = sc.nextInt();
			coordenadaY[i] = p2;
		}
		
		int diffX = coordenadaX[1] - coordenadaX[0];
		int diffY = coordenadaY[1] - coordenadaY[0];
		double distancia = Math.sqrt(diffX*diffX + diffY*diffY);
		System.out.println(distancia);
		
		
		sc.close();
	}
	
}
