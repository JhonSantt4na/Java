package Datas_Horarios_intervalos;

import java.time.LocalDateTime;

public class LocalDateTime2 {
	/**
	 * @LocalDateTime: é capaz de armazenar uma data e hora em apenas um objeto
	 * */
	public static void main(String[] args) {
		
		// Obter a date e hora atual do sistema
		LocalDateTime agora = LocalDateTime.now();
		
		// Criar um Objeto data
		LocalDateTime porDoSolDeNatal = LocalDateTime.of(2025, 12, 25,17, 36);
		
		// Converter de String
		LocalDateTime porDoSolDeNatalStr = LocalDateTime.parse("2025-12-25T17:36:00");
		
		// Possui todos os métodos de LocalDate e de LocalTime
		// porDoSolDeNatal3.toLocalDate().plusDays(10);
		// porDoSolDeNatal3.toLocalTime().plusMinutes(5);
		
		LocalDateTime porDoSolDeNatal3 = LocalDateTime.of(2025,12,25,17,36);
		System.out.println(porDoSolDeNatal3);                               // 2025-12-25T17:36
		System.out.println(porDoSolDeNatal3.getDayOfMonth());               // 25
		System.out.println(porDoSolDeNatal3.plusDays(5));  					// 2025-12-30T17:36
		System.out.println(porDoSolDeNatal3.minusMinutes(30));				// 2025-12-25T17:06
		System.out.println(porDoSolDeNatal3.toLocalDate().isLeapYear());	// false
		System.out.println(porDoSolDeNatal3.toLocalTime().toSecondOfDay()); // 63360
		
	}
	
}
