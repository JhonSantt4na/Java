package _04_DatasHoras;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.text.ParseException;
import java.util.TimeZone;

public class Dates8menos {
  public static void main(String[] args) throws ParseException {
    // Instanciando o objeto do tipo SimpleDateFormt
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");



    // Recebe um dado no formato de string respeitando o formato que fizemos e convertendo para data   Parse() = rece
    Date y1 = sdf1.parse("25/06/2024"); //Tue Jun 25 00:00:00 BRT 2024
    Date y2 = sdf2.parse("12/04/1998 15:42:01"); //Sun Apr 12 15:42:01 BRT 1998
    // Para converter para o formato que agente quer:
    System.out.println("y1 : " + sdf2.format(y1)); // 25/06/2024 00:00:00
    System.out.println("y2 : " + sdf2.format(y2)); // 12/04/1998 15:42:01

    // Data com hora actual
    Date x1 = new Date();
    System.out.println("x1 : " + sdf2.format(x1)); // 10/10/2024 21:52:16

    // outra forma pega o instante converte para milisegundo e cria a data
    Date x2 = new Date(System.currentTimeMillis()); // 10/10/2024 21:56:50
    System.out.println("x2 : " + sdf2.format(x2));

    // Se instanciar uma data com 0milisegundos == a data que o java armazena
    Date x3 = new Date(0L);
    System.out.println("x3 : " + sdf2.format(x3)); // 31/12/1969 21:00:00 como tamos -3 hr

    // Criando uma data as 5am do dia
    Date x4 = new Date(1000L * 60 * 60 * 5);
    System.out.println("x4 : " + sdf2.format(x4)); // 01/01/1970 02:00:00 como tamos -3 hr


    // Data por padrão no UTC se é impressa com data no horario local do pc ele retira -3
    Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
    System.out.println("y3 : " + sdf2.format(y3)); // 25/06/2018 12:42:07

    // Apos set o timeZone
    SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");   // Formatação
    sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));   // Setando o Timezone
    System.out.println("Com o GMT " + sdf3.format(y3));  // 25/06/2018 15:42:07
    // Com essa formatação usamos as Datas sem o -3 hr
  }
}
