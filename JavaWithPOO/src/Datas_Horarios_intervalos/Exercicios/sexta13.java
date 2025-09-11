package Datas_Horarios_intervalos.Exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class sexta13 {
	/**
	 * @Exercicio_05: Faça um programa Java que mostre qual foi o ano com a maior
	 * quantidade de sextas-feiras 13 desde o ano de nascimento de Cristo (ano 0)
	 * */
	public static void main(String[] args) {
		
		int anoVencedor = 0;
		int qtdeVencedora = 0;
		
		for (int i = 0; i < LocalDate.now().getYear(); i++) {
			int qtde_i = quantasSextas(i);
			if (qtde_i >= qtdeVencedora) {
				qtdeVencedora = qtde_i;
				anoVencedor = i;
			}
		}
		System.out.printf("O ano mais recente com a maior quantidade de Sextas 13 foi %d, com %d ocorrências.%n", anoVencedor, qtdeVencedora);
	}
	
	public static int quantasSextas(int ano){
		LocalDate dataInicio = LocalDate.of(ano, 1, 1);
		LocalDate primeiroSexta = dataInicio.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		int quantSextas13 = 0;
		
		do {
			if (primeiroSexta.getDayOfMonth() == 13){
				quantSextas13++;
			}
			primeiroSexta = primeiroSexta.plusWeeks(1);
		}while (primeiroSexta.getYear() == ano);
		return quantSextas13;
		
	}
}
