package Datas_Horarios_intervalos.Exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiasDataNascimento {
	/**
	 * @Exercicio01: Faça um programa em Java que receba uma data de nacimento como entrada digitada
	 * e mostre quantos dias se passaram desde a data informada;
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma data de Nacimento (dia/mes/ano):");
		String dataString = sc.next();
		
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataUsuario = LocalDate.parse(dataString, dft1);
		
		LocalDate dataAtual = LocalDate.now();
		
		Period distanceDates = Period.between(dataUsuario, dataAtual);
		
		System.out.println("Dias: " + distanceDates.getDays());
		System.out.println("Meses: " + distanceDates.getMonths());
		System.out.println("Anos: " + distanceDates.getYears());
		
		sc.close();
	}
}
