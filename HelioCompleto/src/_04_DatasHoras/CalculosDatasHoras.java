package _04_DatasHoras;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDatasHoras {
  public static void main(String[] args) {
    // DataHora em java é um objeto imutavel uma vez instanciada fica com ela pra sempre
    LocalDate d02 = LocalDate.parse("2024-07-20");
    LocalDateTime d03 = LocalDateTime.parse("2024-07-20T01:30:26");
    Instant d04 = Instant.parse("2024-07-20T01:30:26Z");

    LocalDate pastWeekLocalDate = d02.minusDays(7); // Subritai 7 dias da data do d02
    LocalDate nextWeekLocalDate = d02.plusDays(7); // Aumenta 7 dias da data do d02

    // plusYears(1); = Aumenta em 1 ano
    // minusYears(2); = Diminui em 2 anos

    System.out.println(d02);
    System.out.println(pastWeekLocalDate);
    System.out.println(nextWeekLocalDate);

    // Com o LocalDateTime

    LocalDateTime pastWeekLocalDateTime = d03.minusHours(1); // Subritai 1hr da data do d02
    LocalDateTime nextWeekLocalDateTime = d03.plusHours(1); // Aumenta 1hr da data do d02

    // plusMinutes(1); = Aumenta em 1 hr
    // minusMinutes(2); = Diminui em 2 hr

    System.out.println(d02);
    System.out.println(pastWeekLocalDateTime);
    System.out.println(nextWeekLocalDateTime);
    // quando é localdatetime pode ser as horas que o localdate não tem

    // Agora com o Instate
    // Primeira coisa é que ele não tem o minus day,ano,mes

    // Usamos o qunatidade e a unidade: sendo a unidade dia, mes , ano etc..

    Instant pastWeekInstant = d04.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d04.plus(7, ChronoUnit.DAYS);


    System.out.println(d04);
    System.out.println(pastWeekInstant);
    System.out.println(nextWeekInstant);

    // Duração de Tempos
    // Importamos o import java.time.Duration;
    Duration t1 = Duration.between(pastWeekLocalDateTime, d03);
    System.out.println(t1.toHours()); // Me retorna a duração ou seja dif entre as duas

    //Duration t2 = Duration.between(pastWeekLocalDate, d02);
    //System.out.println(t2); // erro pois o local date não tem o tempo
    // Precisamos converter ele pra LocaldateTime ex:
    //Duration t22 = Duration.between(pastWeekLocalDate.atTime(0,0), d02.atTime(0,0)); //  OU seja passando a hora e o minuto pra o LocalDate

    // ou usa esse metodo que converte para meia noite
    Duration t22 = Duration.between(pastWeekLocalDate.atStartOfDay(), d02.atStartOfDay());
    System.out.println(t22.toDays());

    // Agora com o Instant

    Duration t3 = Duration.between(pastWeekInstant, d04);
    System.out.println(t3.toHours());
    // Tambem calculamos em caso de numeros negativos
  }

}
