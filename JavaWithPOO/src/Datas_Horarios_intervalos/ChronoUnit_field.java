package Datas_Horarios_intervalos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoUnit_field {
	/**
	 * @ChronoUnit : ChronoUnit permite adicionar (plus) ou remover (minus) quantidades específicas de tempo em objetos
	 * como LocalDateTime, ajustando automaticamente componentes como dias, meses ou anos, respeitando regras como anos bissextos.
	 * */
	
	public static void main(String[] args) {
		// plus -> Adiciona quantidades específicas de tempo em objetos
		LocalDateTime dataHoraPlus = LocalDateTime.of(2025, 12, 25, 12, 0, 0, 0); // Exemplo: 2025-12-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.NANOS));     // Adiciona 1 nanos: 2025-12-25T12:00:00.000000001
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.MICROS));    // Adiciona 1 micro: 2025-12-25T12:00:00.000001
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.MILLIS));    // Adiciona 1 milli: 2025-12-25T12:00:00.001
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.SECONDS));   // Adiciona 1 segundo: 2025-12-25T12:00:01
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.MINUTES));   // Adiciona 1 minuto: 2025-12-25T12:01:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.HOURS));     // Adiciona 1 hora: 2025-12-25T13:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.HALF_DAYS)); // Adiciona 12 horas: 2025-12-26T00:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.DAYS));      // Adiciona 1 dia: 2025-12-26T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.WEEKS));     // Adiciona 1 semana: 2026-01-01T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.MONTHS));    // Adiciona 1 mês: 2026-01-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.YEARS));     // Adiciona 1 ano: 2026-12-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.DECADES));   // Adiciona 10 anos: 2035-12-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.CENTURIES)); // Adiciona 100 anos: 2125-12-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.MILLENNIA)); // Adiciona 1.000 anos: 3025-12-25T12:00:00
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.ERAS));      // Adiciona 1 era: 1000002025-12-25T12:00:00 (ajuste conceitual)
		System.out.println(dataHoraPlus.plus(1, ChronoUnit.FOREVER));   // Representa infinito positivo, usado para max bound
		
		// minus -> Remove quantidades específicas de tempo em objetos
		LocalDateTime dataHoraMinus = LocalDateTime.of(2025, 12, 25, 12, 0, 0, 0); // Exemplo: 2025-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.NANOS));    // Remove 1 nanos: 2025-12-25T11:59:59.999999999
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.MICROS));   // Remove 1 micro: 2025-12-25T11:59:59.999999
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.MILLIS));   // Remove 1 milli: 2025-12-25T11:59:59.999
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.SECONDS));  // Remove 1 segundo: 2025-12-25T11:59:59
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.MINUTES));  // Remove 1 minuto: 2025-12-25T11:59:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.HOURS));    // Remove 1 hora: 2025-12-25T11:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.HALF_DAYS));// Remove 12 horas: 2025-12-25T00:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.DAYS));     // Remove 1 dia: 2025-12-24T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.WEEKS));    // Remove 1 semana: 2025-12-18T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.MONTHS));   // Remove 1 mês: 2025-11-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.YEARS));    // Remove 1 ano: 2024-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.DECADES));  // Remove 10 anos: 2015-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.CENTURIES));// Remove 100 anos: 1925-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.MILLENNIA));// Remove 1.000 anos: 1025-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.ERAS));     // Remove 1 era: -999999975-12-25T12:00:00
		System.out.println(dataHoraMinus.minus(1, ChronoUnit.FOREVER));  // Representa infinito negativo, usado para min bound
		
		/**
		 * @ChronoField: define campos granulares em objetos temporais como LocalDateTime, permitindo extrair valores
		 * específicos com get ou ajustar com with, retornando novas instâncias imutáveis.
		 * Cada campo tem um range válido (ex.: MONTH_OF_YEAR de 1 a 12) e pode lançar DateTimeException se o valor for inválido.
		 * */
		
		// get -> extrair valores específico
		LocalDateTime dataHoraGet = LocalDateTime.of(2025, 12, 25, 12, 0, 0, 0); // Exemplo: 2025-12-25T12:00:00
		System.out.println(dataHoraGet.get(ChronoField.NANO_OF_SECOND)); // Obtém: 0
		System.out.println(dataHoraGet.get(ChronoField.NANO_OF_DAY)); // Obtém: 43200000000000 (12h em nanos)
		System.out.println(dataHoraGet.get(ChronoField.MICRO_OF_SECOND)); // Obtém: 0
		System.out.println(dataHoraGet.get(ChronoField.MICRO_OF_DAY)); // Obtém: 43200000000 (12h em micros)
		System.out.println(dataHoraGet.get(ChronoField.MILLI_OF_SECOND)); // Obtém: 0
		System.out.println(dataHoraGet.get(ChronoField.MILLI_OF_DAY)); // Obtém: 43200000 (12h em millis)
		System.out.println(dataHoraGet.get(ChronoField.SECOND_OF_MINUTE)); // Obtém: 0
		System.out.println(dataHoraGet.get(ChronoField.SECOND_OF_DAY)); // Obtém: 43200 (12h em segundos)
		System.out.println(dataHoraGet.get(ChronoField.MINUTE_OF_HOUR)); // Obtém: 0
		System.out.println(dataHoraGet.get(ChronoField.MINUTE_OF_DAY)); // Obtém: 720 (12h em minutos)
		System.out.println(dataHoraGet.get(ChronoField.HOUR_OF_AMPM)); // Obtém: 0 (12 PM como 0 em 12h)
		System.out.println(dataHoraGet.get(ChronoField.CLOCK_HOUR_OF_AMPM)); // Obtém: 12 (12 em relógio 12h)
		System.out.println(dataHoraGet.get(ChronoField.HOUR_OF_DAY)); // Obtém: 12
		System.out.println(dataHoraGet.get(ChronoField.CLOCK_HOUR_OF_DAY)); // Obtém: 12
		System.out.println(dataHoraGet.get(ChronoField.AMPM_OF_DAY)); // Obtém: 1 (PM)
		System.out.println(dataHoraGet.get(ChronoField.DAY_OF_WEEK)); // Obtém: 4 (quinta-feira)
		System.out.println(dataHoraGet.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)); // Obtém: 4 (alinhado)
		System.out.println(dataHoraGet.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)); // Obtém: 4 (alinhado no ano)
		System.out.println(dataHoraGet.get(ChronoField.DAY_OF_MONTH)); // Obtém: 25
		System.out.println(dataHoraGet.get(ChronoField.DAY_OF_YEAR)); // Obtém: 359 (em ano não bissexto)
		System.out.println(dataHoraGet.get(ChronoField.ALIGNED_WEEK_OF_MONTH)); // Obtém: 4 (semana no mês)
		System.out.println(dataHoraGet.get(ChronoField.ALIGNED_WEEK_OF_YEAR)); // Obtém: 52 (semana no ano)
		System.out.println(dataHoraGet.get(ChronoField.MONTH_OF_YEAR)); // Obtém: 12
		System.out.println(dataHoraGet.get(ChronoField.PROLEPTIC_MONTH)); // Obtém: Meses desde ano 0
		System.out.println(dataHoraGet.get(ChronoField.YEAR_OF_ERA)); // Obtém: 2025 (ano na era)
		System.out.println(dataHoraGet.get(ChronoField.YEAR)); // Obtém: 2025
		System.out.println(dataHoraGet.get(ChronoField.EPOCH_DAY)); // Obtém: Dias desde 1970-01-01
		System.out.println(dataHoraGet.get(ChronoField.ERA)); // Obtém: 1 (CE/AD)
		// System.out.println(dataHoraGet.get(ChronoField.INSTANT_SECONDS)); // Não suportado diretamente, requer Instant
		// System.out.println(dataHoraGet.get(ChronoField.OFFSET_SECONDS)); // Não suportado, requer ZonedDateTime
		
		// with -> Para ajustar valores especificos
		LocalDateTime dataHoraWith = LocalDateTime.of(2025, 12, 25, 12, 0, 0, 0); // Exemplo: 2025-12-25T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.NANO_OF_SECOND, 500000000)); // Define: 2025-12-25T12:00:00.500
		System.out.println(dataHoraWith.with(ChronoField.NANO_OF_DAY, 0)); // Define: 2025-12-25T00:00:00
		System.out.println(dataHoraWith.with(ChronoField.MICRO_OF_SECOND, 500000)); // Define: 2025-12-25T12:00:00.500
		System.out.println(dataHoraWith.with(ChronoField.MICRO_OF_DAY, 0)); // Define: 2025-12-25T00:00:00
		System.out.println(dataHoraWith.with(ChronoField.MILLI_OF_SECOND, 500)); // Define: 2025-12-25T12:00:00.500
		System.out.println(dataHoraWith.with(ChronoField.MILLI_OF_DAY, 0)); // Define: 2025-12-25T00:00:00
		System.out.println(dataHoraWith.with(ChronoField.SECOND_OF_MINUTE, 30)); // Define: 2025-12-25T12:00:30
		System.out.println(dataHoraWith.with(ChronoField.SECOND_OF_DAY, 0)); // Define: 2025-12-25T00:00:00
		System.out.println(dataHoraWith.with(ChronoField.MINUTE_OF_HOUR, 30)); // Define: 2025-12-25T12:30:00
		System.out.println(dataHoraWith.with(ChronoField.MINUTE_OF_DAY, 0)); // Define: 2025-12-25T00:00:00
		System.out.println(dataHoraWith.with(ChronoField.HOUR_OF_AMPM, 6)); // Define: 2025-12-25T18:00:00 (PM)
		System.out.println(dataHoraWith.with(ChronoField.CLOCK_HOUR_OF_AMPM, 6)); // Define: 2025-12-25T18:00:00 (PM)
		System.out.println(dataHoraWith.with(ChronoField.HOUR_OF_DAY, 18)); // Define: 2025-12-25T18:00:00
		System.out.println(dataHoraWith.with(ChronoField.CLOCK_HOUR_OF_DAY, 18)); // Define: 2025-12-25T18:00:00
		System.out.println(dataHoraWith.with(ChronoField.AMPM_OF_DAY, 0)); // Define: 2025-12-25T00:00:00 (AM)
		System.out.println(dataHoraWith.with(ChronoField.DAY_OF_WEEK, 1)); // Define: 2025-12-22T12:00:00 (segunda)
		System.out.println(dataHoraWith.with(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH, 1)); // Define: 2025-12-22T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR, 1)); // Define: 2025-12-22T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.DAY_OF_MONTH, 1)); // Define: 2025-12-01T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.DAY_OF_YEAR, 1)); // Define: 2025-01-01T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.ALIGNED_WEEK_OF_MONTH, 1)); // Define: 2025-12-01T12:00:00 a 07
		System.out.println(dataHoraWith.with(ChronoField.ALIGNED_WEEK_OF_YEAR, 1)); // Define: 2025-01-01T12:00:00 a 07
		System.out.println(dataHoraWith.with(ChronoField.MONTH_OF_YEAR, 1)); // Define: 2025-01-25T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.PROLEPTIC_MONTH, 0)); // Define: 0000-01-25T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.YEAR_OF_ERA, 2000)); // Define: 2000-12-25T12:00:00 (assume era atual)
		System.out.println(dataHoraWith.with(ChronoField.YEAR, 2000)); // Define: 2000-12-25T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.EPOCH_DAY, 0)); // Define: 1970-01-01T12:00:00
		System.out.println(dataHoraWith.with(ChronoField.ERA, 0)); // Define: -2024-12-25T12:00:00 (BCE/BC, ajusta ano)
		// Exemplos para INSTANT_SECONDS e OFFSET_SECONDS requerem conversão (ex.: to Instant ou with offset)
	}
}
