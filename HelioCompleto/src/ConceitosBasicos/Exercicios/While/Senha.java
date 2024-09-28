package ConceitosBasicos.Exercicios.While;

import java.util.Scanner;

public class Senha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int senhaCorreta = 2002;
    int tentativa = sc.nextInt();

    while(tentativa != senhaCorreta){
      System.out.println("Senha Invalida");
      tentativa = sc.nextInt();
    }
    System.out.println("Acesso Permitido");
    sc.close();
  }
}
