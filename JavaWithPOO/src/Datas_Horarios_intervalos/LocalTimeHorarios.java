package Datas_Horarios_intervalos;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeHorarios {
	/**
	 * @LocalTime: representa somente um horário;
	 *
	 * */
	public static void main(String[] args) {
		
		// Obter a hota atual do sistema
		LocalTime agora = LocalTime.now() ;
		
		// Criar um objeto DataTiem;
		LocalTime porDoSol = LocalTime.of(17,36);
		
		// Converter de String
		LocalTime almoco = LocalTime.parse("12:00"); // Formato padrão (hora:minutos:segundos.fraçãoDeSegundo)
	
		// Métodos para alterar um Objeto LocalTime:
		
		LocalTime almoco1 = LocalTime.of(12,0);
		System.out.println(almoco1.plusNanos(200000000));    		// 12:00:00.200
		System.out.println(almoco1.plusSeconds(3600));     		// 13:00
		System.out.println(almoco1.plusMinutes(20));       		// 12:20
		System.out.println(almoco1.plusHours(2));              		// 14:00
		System.out.println(almoco1.plus(500, ChronoUnit.MILLIS));	// 12:00:00.500
		System.out.println(almoco1.minusNanos(300000000));    	// 11:59:59.700
		System.out.println(almoco1.minusSeconds(1800));   	// 11:30
		System.out.println(almoco1.minusMinutes(30));    		// 11:30
		System.out.println(almoco1.minusHours(3));    	   		// 09:00
		System.out.println(almoco1.minus(500000, ChronoUnit.MICROS));  // 11:59:59.500
		
		// Verificação de um Objeto LocalTime
		LocalTime almocando = LocalTime.parse("12:05:53.6574");
		LocalTime porDoSool = LocalTime.of(17, 36);
		
		// Obtendo informações do LocalTime
		System.out.println(almocando.getNano());		// 657400000
		System.out.println(almocando.getSecond());		// 53
		System.out.println(almocando.getMinute());		// 5
		System.out.println(almocando.getHour());		// 12
		System.out.println(almocando.getLong(ChronoField.SECOND_OF_DAY)); // 43553
		
		// Comparações com LocalTime
		System.out.println(almoco1.isAfter(porDoSool));      // false
		System.out.println(almoco1.isBefore(porDoSool));     // true
		System.out.println(almoco1.toSecondOfDay());         // 43200
	}
}
