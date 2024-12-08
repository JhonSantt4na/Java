package _04_DatasHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
  public static void main(String[] args) {
    // Data e hora formatada, ofPattern = Usando um padrão(padrão com os simbolos da docs)
    DateTimeFormatter fnt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // Date Ago
    LocalDate d01 = LocalDate.now();
    // Date + Hours ago com fração de segundos
    LocalDateTime d02 = LocalDateTime.now();
    // Mesma data porem com a hora de londres 'z' data GMT ou seja +3 hora
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2024-05-21");
    // Parse = metodo statico apartir do localdate

    //
    LocalDateTime d05 = LocalDateTime.parse("2024-05-21T21:30:25");
    Instant d06 = Instant.parse("2024-05-21T01:30:25Z"); // Tem que colocar o Z no final

    // Quardando no horario daq
    Instant d07 = Instant.parse("2024-05-21T01:30:25-03:00");
    // Ou algum relativo com o de londres

    //LocalDate d08 = LocalDate.parse("20/07/2024");
    // Não funciona pois não expecificamos onde é o dia, onde é o mes e o ano
    LocalDate d08 = LocalDate.parse("20/07/2024", fnt1);
    // Passando o objeto do formato que criamos pois tem uma sobrecarga que aceita o padrçaoo de formato

    // Retorna um erro com o fmt01 pois esta com o padrã diferente
    LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); // instancia apartir desse modelo
    // Podemos usar o diretamente o formatador

    // instanciar data direto
    LocalDate d10 = LocalDate.of(2024,7,20);
    // iuntanciando data e hora direto
    LocalDateTime d11 = LocalDateTime.of(2025,05,11,1,30);



    System.out.println(d01.toString()); // estamos chamando explicitamente o toString
    System.out.println(d02);
    System.out.println(d03);
    System.out.println(d04);
    System.out.println(d05);
    System.out.println(d06);
    System.out.println(d07);
    System.out.println(d08);
    System.out.println(d09);
    System.out.println(d10);
    System.out.println(d11);
  }
}
