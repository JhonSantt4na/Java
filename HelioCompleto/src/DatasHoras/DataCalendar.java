package DatasHoras;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendar {
  public static void main(String[] args) {
    //queremos acresentar uma unidade a uma data
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
    System.out.println(sdf.format(d)); // 25/06/2018 12:42:07

    Calendar cal = Calendar.getInstance(); // instanciando o Calendar
    cal.setTime(d); //Temos um calendario com a data instanciada
    // Apartir deste calendario podemos adicionar ou subtrair dias ou horas

    cal.add(Calendar.HOUR_OF_DAY, 5); // Hora do dia +5 25/06/2018 17:42:07
    d = cal.getTime(); // Atualizando os dados do D
    System.out.println(sdf.format(d));

    // Pegando uma unidade especifica ex: {dia, mes, ano, hora}
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

    Calendar cal2 = Calendar.getInstance();
    cal2.setTime(d2);

    // Usamos o metodo .get(passamos o calendario.unidade)
    int minuts = cal2.get(Calendar.MINUTE);
    System.out.println(minuts);

    int month = 1 + cal2.get(Calendar.MONTH); // Como o calendar comerca com zero o mes tem que somar com mais 1
    System.out.println(month); // 6

  }
}
