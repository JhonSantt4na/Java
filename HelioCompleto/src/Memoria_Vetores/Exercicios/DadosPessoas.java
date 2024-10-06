package Memoria_Vetores.Exercicios;

import Memoria_Vetores.Entidades.DadosP;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas Pessoas serão digitadas ? ");
    int qty = sc.nextInt();
    sc.nextLine();

    DadosP[] persona = new DadosP[qty];

    for (int i = 0; i < persona.length; i++) {
      System.out.printf("Altura da %da Pessoa: ", i + 1);
      double altura = sc.nextDouble();
      System.out.printf("Genro da %da Pessoa: ", i + 1);
      char genero = sc.next().charAt(0);

      persona[i] = new DadosP(altura, genero);
    }

    double menorAltura = persona[0].getAltura();
    double maiorAltura = persona[0].getAltura();

    for (int i = 1; i < persona.length; i++) {
      if(persona[i].getAltura() > maiorAltura){
        maiorAltura = persona[i].getAltura();
      }
      if(persona[i].getAltura() > menorAltura){
        menorAltura = persona[i].getAltura();
      }
    }

    System.out.printf("Menor Altura = %2.f", menorAltura);
    System.out.printf("Maior Altura = %2.f", maiorAltura);

    sc.close();
  }
}
