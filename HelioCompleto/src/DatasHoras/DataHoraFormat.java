package DatasHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraFormat {
  public static void main(String[] args) {

    LocalDate d04 = LocalDate.parse("2024-05-21");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-21T21:30:25");
    Instant d06 = Instant.parse("2024-05-21T01:30:25Z");

    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    // ou seja withZone(ZoneId.systemDefault()); usando isso para pegar direto do sistema que esta usando

    System.out.println(fmt01); // Chama normal
    System.out.println(d04.format(fmt01)); // Usando o Metodo .format(padrão)
    System.out.println(fmt01.format(d04)); // objdo padrão.format(data) Podemos usar desta forma tmb
    System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))); // ou podemos passar desta forma tmb instanciando na hora e a coleta de lixo exclui na variavel fica salvo ate seu bloco sumir

    System.out.println();

    System.out.println(d05.format(fmt01));
    System.out.println(d05.format(fmt02));

    System.out.println();

    // Para usar o Instant ja que o instant não tem o .format;
    System.out.println(d06); // Chamando o toString.
    System.out.println(fmt03.format(d06)); // com os outros não funciona pois não especificou o fusoHorario


    System.out.println();
    // Podemos usar os metodos prontos no lugar dos nosso padrão
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    System.out.println(d05.format(fmt4));
    //System.out.println(fmt4.format(d06)); // Erro tmb pois o Iso date time nçao tem fusohorario
    // Para usar vamos ter que usar um proprio para fusohorario
    System.out.println(fmt5.format(d06)); // Ai sim funciona

  }
}
