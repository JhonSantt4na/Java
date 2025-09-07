package Datas_Horarios_intervalos;

import java.time.temporal.ChronoUnit;

public class LocalDate {
	/**
	 * Os Principais tipos que o Java usava ate o Java7 eram:
	 * Date e Calendar
	 * Porem como tinha problemas constantes os manutedores do java resolveram atualizar com novos tipos:
	 * Principais problemas:
	 * 	- Insegurança com Threads - Problemas de concorencia, ou seja disputa simutanea do mesmo objeto no mesmo instante
	 * 	- Mal Projetadas - Metodos nadas intuitivos
	 * 	- Fuso-Horário - Programador tinha que deseenvolver codigos para lidar com fusohorarios
	 *
	 * 	Novas Classes introduzidas:
	 * 	Classes principais:
	 * 	- LocalDate - Serve para manipular somente datas.
	 * 	- LocalTimeHorarios - Serve para manipular somente horarios.
	 * 	- LocalDateTime -
	 * Classe Auxiliar:
	 * 	- Duration
	 * 	- Instant
	 * 	- Period
	 * */
	public static void main(String[] args) {
		
		/**
		 * @LocalDate: Manipulações somente de Datas
		 * */
		
		//Obter a data atual do sistema >> now()
		java.time.LocalDate hoje = java.time.LocalDate.now();
		
		//Criar um Objeto Data >> of()
		java.time.LocalDate natal = java.time.LocalDate.of(2025,12,25);
		
		//Converter para String >> parse() recebe uma string com o formato ano-mes-dia
		java.time.LocalDate feriado = java.time.LocalDate.parse("2025-11-15");
		
		/**
		 * @Principais_métodos:
		 *
		 * @plus -> Adiciona quantidade de tempo de uma data, dias, semanas, mes, dia, ano até decadas...
		 * @minus -> Remove quantidade de tempo de uma data, dias, semanas, mes, dia, ano até decadas...
		 * */
		
		java.time.LocalDate natal1 = java.time.LocalDate.of(2025,12,25);        // Formato padrão ano-mes-dia
		System.out.println(natal1);                                                 //2025-12-25
		System.out.println(natal1.plusDays(30));                         //2026-01-24
		System.out.println(natal1.plusWeeks(2));                        //2026-01-08
		System.out.println(natal1.plusMonths(3));                      //2026-03-25
		System.out.println(natal1.plusYears(1));                        //2026-12-25
		System.out.println(natal1.plus(1, ChronoUnit.CENTURIES));      //2125-12-25
		System.out.println(natal1.minusDays(30));                   //2025-11-25
		System.out.println(natal1.minusWeeks(2));                  //2025-12-11
		System.out.println(natal1.minusMonths(3));                //2025-09-25
		System.out.println(natal1.minusYears(1));                  //2024-12-25
		System.out.println(natal1.minus(1, ChronoUnit.DECADES));  //2015-12-25
		
		// Métodos de Verificação de um Objeto LocalDate
		java.time.LocalDate natal2 = java.time.LocalDate.of(2025,12,25);
		System.out.println(natal2.getDayOfWeek());     // DayOfWeek.THURSDAY > Dia da Semana de uma data
		System.out.println(natal2.getDayOfMonth());    // 25 > Dia de uma data
		System.out.println(natal2.getMonth());         // Month.DECEMBER > Mes de uma data
		System.out.println(natal2.getMonthValue());    // 12 > Mes de uma data em numero
		System.out.println(natal2.getYear());          // 2025 > Ano de uma data
		System.out.println(natal2.getDayOfYear());     // 359 > Dia do ano de uma data
	
		// Verificação / comparação
		java.time.LocalDate anoNovo = java.time.LocalDate.of(2026,1,1);
		System.out.println(natal2.isAfter(anoNovo));      // false > Verificando se é depois da data do parametro
		System.out.println(natal2.isBefore(anoNovo));     // true > Verificando se é antes da data do parametro
		System.out.println(natal2.isLeapYear());          // true > Verificando se a data pertence a um ano bisesto
		System.out.println(natal2.isEqual(anoNovo));      // false > Compara se são as mesmas datas
		System.out.println(natal2.compareTo(anoNovo));    // -1 > compara a data e retorna 0 pra iguais, -1 quando a do parametro é maior, e 1 quando a do parametro é menor
	}
	
}
