package Datas_Horarios_intervalos;

import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class IntervalosDeTempos {
	/**
	 * @Period: Usado para representar diferencas entre datas e horários.
	 * @Duration: Usado para tempo transcorrido não estruturado, quantos nanosegundos trasncorreu, valores negativos
	 * */
	public static void main(String[] args) {
		
		LocalDateTime dataNascimento = LocalDateTime.of(1998,03,21, 12,18,22,36);
		Period p1 = Period.between(dataNascimento.toLocalDate(), java.time.LocalDate.now());
		
		System.out.println(p1.getYears());   // 27
		System.out.println(p1.getMonths());  // 5
		System.out.println(p1.getDays());    // 18
		
		//Duration d1 = Duration.between(dataNascimento, LocalDate.now());
		//System.out.println(d1.getNano());
		//System.out.println(d1.getSeconds());
		
		// Ajustes Temporais
		LocalDate anyDate = LocalDate.of(200, Month.OCTOBER, 15);
		System.out.printf("Primeiro dia do Mês: %s%n",
			anyDate.with(TemporalAdjusters.firstDayOfMonth()));
		
		System.out.printf("Primeira Segunda-feira do Mês: %s%n",
			anyDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		
		System.out.printf("Próxima Segunda-feira do Mês: %s%n",
			anyDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		
		System.out.printf("Ultimo dia do Mês: %s%n",
			anyDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.printf("Primeiro dia do Próximo Ano: %s%n",
			anyDate.with(TemporalAdjusters.firstDayOfNextYear()));
	}
}
