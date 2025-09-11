package Datas_Horarios_intervalos.Exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class VencimentoBoleto {
	/**
	 * @Exercicio_02: Faça um programa em java que receba uma data de vencimento de um
	 * boleto como entrada e informe se ela cai em um dia útil e, se não cair, mostrar o próximo
	 * dia útil como data de vencimento. (Obs.: considerar não-útil apenas fins de semana)
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vencimento de Boletos:");
		System.out.print("Digite um data de vencimento do Boleto: ");
		String strData = sc.next();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");

		LocalDate userDate = LocalDate.parse(strData, fmt1);
		//DayOfWeek weekDate = userDate.getDayOfWeek();
		
		if ((userDate.getDayOfWeek() == DayOfWeek.SATURDAY) || (userDate.getDayOfWeek() == DayOfWeek.SUNDAY)){
			userDate = userDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		
		
		System.out.printf("O Pagamento deve ser feito até %s.",userDate);
		
		//if(weekDate == DayOfWeek.SATURDAY) {
			//System.out.println("Seu Boleto será no Sábado Próximo Dia Util: " + userDate.plusDays(2).format(dtf2));
		//} else if(weekDate == DayOfWeek.SUNDAY){
			//System.out.println("Seu Boleto Cai no Domingo, Próximo Dia Util: " + userDate.plusDays(1).format(dtf2));
		//} else {
			//System.out.println("Seu Boleto cai no dia: " + userDate.format(dtf2));
		//}
		
		sc.close();
	}
}
