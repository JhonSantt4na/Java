package Exercicios.Notas;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
	/**
	 * @Exercicio_06: Faça um programa em Java que leia duas notas de 10 alunos
	 * e mostre as médias de cada um.
	 * Obs.: as notas variam de 0 a 10 e podem ter casas decimais
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdAlunos = 11;
		ArrayList<Float> medias = new ArrayList<Float>(10);
		
		for (int i = 1; i < qtdAlunos; i++) {
			
			System.out.print("Qual a primeira Nota do aluno " + i + "(0 á 10) : ");
			float nota1 = sc.nextFloat();
			
			System.out.print("Qual a Segunda Nota do aluno " + i + " (0 á 10) : ");
			float nota2 = sc.nextFloat();
			System.out.println();
			
			medias.add((nota1 + nota2) / 2);
		}
		
		for (int i = 0; i <= medias.size()- 1; i++){
			System.out.println("Média do Aluno " + (i+1) + ": " + medias.get(i));
		}
		
		sc.close();
	}
}


