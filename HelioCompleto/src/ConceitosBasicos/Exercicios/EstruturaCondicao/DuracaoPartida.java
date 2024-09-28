package ConceitosBasicos.Exercicios.EstruturaCondicao;
import java.util.Scanner;

public class DuracaoPartida {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int horaInicial = sc.nextInt();
      int horaFinal = sc.nextInt();
      int duracao;

      if (horaInicial < horaFinal) {
        duracao = horaFinal - horaInicial;
      } else if (horaInicial > horaFinal) {
        duracao = 24 - horaInicial + horaFinal;
      } else {
        duracao = 24;
      }

      System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

      sc.close();
    }
}

