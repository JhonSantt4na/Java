package Datas_Horarios_intervalos.Exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class domingosDoMes {
	/**
	 * @Exercicio_04: Faça um programa em Java que receba um ano e mês como entrada
	 * digitadas e mostre as datas referentes aos domingos daquele mês;
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um Ano (ex: 2025) ->");
		int ano = sc.nextInt();
		
		System.out.print("Digite um Mes (ex: 01-12) ->");
		int mes = sc.nextInt();
		
		LocalDate dataInicioMes = LocalDate.of(ano, mes, 1);
		LocalDate primeiroDomingo = dataInicioMes.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		
		int mesReferencia = primeiroDomingo.getMonthValue();
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		do {
			System.out.println(primeiroDomingo.format(dft1));
			primeiroDomingo = primeiroDomingo.plusWeeks(1);
		} while (primeiroDomingo.getMonthValue() == mesReferencia);
		
		sc.close();
	}
}
