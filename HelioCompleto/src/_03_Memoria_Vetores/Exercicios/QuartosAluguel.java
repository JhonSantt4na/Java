package _03_Memoria_Vetores.Exercicios;

import _03_Memoria_Vetores.Entidades.Quartos;

import java.util.Locale;
import java.util.Scanner;

public class QuartosAluguel {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many rooms will be rented? ");
    int qty = sc.nextInt();
    sc.nextLine();

    Quartos[] vect = new Quartos[9];

    for (int i = 0; i < qty; i++) {

      System.out.printf("Rent #%d: %n", i + 1);

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Email: ");
      String email = sc.nextLine();

      System.out.print("Room: ");
      int room = sc.nextInt();
      sc.nextLine();
      vect[room] = new Quartos(room, name, email);
      System.out.print("\n");
    }

    System.out.println("Busy rooms: ");
    for (int i = 0; i < vect.length; i++) {
      if(vect[i] != null){
        int quarto = vect[i].getRoom();
        String nome = vect[i].getName();
        String email = vect[i].getEmail();
        System.out.printf("%d : %s, %s %n", quarto, nome, email);
      }
    }

    sc.close();
  }
}
