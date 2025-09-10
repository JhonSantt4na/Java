package Datas_Horarios_intervalos.Exercicios;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiasDoMes {
	/**
	 * @Exercicio_03: Faça um programa em Java que receba um ano como entrada digitada
	 * e mostre a quantidade de dias de cada mes daquele ano;
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digit one Year (ex: 2025):");
		int strUser = sc.nextInt();
		
		for (int i = 1; i < 13; i++){
			YearMonth mesAtual = YearMonth.of(strUser,i);
			System.out.printf("%s : %d days%n",mesAtual.getMonth(), mesAtual.lengthOfMonth());
		}
		
		sc.close();
	}
}
