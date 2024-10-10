package DatasHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraConvercao {
  public static void main(String[] args) {

    LocalDate d04 = LocalDate.parse("2024-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:30:26");
    Instant d06 = Instant.parse("2024-07-20T01:30:26Z");

    // Global para local => temos que passar alem da data global temos que informar o timezone
    // Geralmente ultilizamos o horario do sistema local
    /*
     Todos os timezone que pdemos usar
     for (String s :ZoneId.getAvailableZoneIds()){
      System.out.println(s);
    };
     */

    // Convertendo um global para uma data local considerando o fusohorario do meu pc
    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

    // Usando um lugar especifico
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

    System.out.println(r1); // 1 dia antes pois pega o de londre e retira - 3hr
    System.out.println(r2); // o dia com o fuso de portugal

    System.out.println();
    // Agora com a data
    LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
    System.out.println(r3); // Com o horario do sistema no brasil
    System.out.println(r4); // com horario para portugal

    System.out.println();
    // Obtendo os dados de uma hora local

    //Pegando o dia
    System.out.println(d04.getDayOfMonth());
    // Pegando o mes
    System.out.println(d04.getMonthValue());
    // Pegando o ano
    System.out.println(d04.getYear());

    System.out.println();

    // Pegando a hora
    System.out.println(d05.getHour());
    // Pegando o minuto
    System.out.println(d05.getMinute());
    // Pegando o Segundos
    System.out.println(d05.getSecond());


  }
}
