package Datas_Horarios_intervalos.Exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasDataNascimento {
	/**
	 * @Exercicio01: Faça um programa em Java que receba uma data de nacimento como entrada digitada
	 * e mostre quantos dias se passaram desde a data informada;
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma data de Nascimento (dd/mm/aaaa):");
		String dataString = sc.next();
		
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataUsuario = LocalDate.parse(dataString, dft1);
		
		LocalDate dataAtual = LocalDate.now();
		
		long diasVividos = ChronoUnit.DAYS.between(dataUsuario, dataAtual);
		//long diasVividos = dataAtual.toEpochDay() - dataUsuario.toEpochDay();
		//long diasVividos = Duration.between(dataUsuario.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
		
		//Period period = Period.between(dataUsuario, dataAtual);
		Period period = dataUsuario.until(dataAtual);
		
		System.out.println("Dias vividos :" +diasVividos);
		
		System.out.println("Dias: " + period.getDays());
		System.out.println("Meses: " + period.getMonths());
		System.out.println("Anos: " + period.getYears());
		
		sc.close();
	}
}
