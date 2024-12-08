package _03_Memoria_Vetores.Exercicios;

import _03_Memoria_Vetores.Entidades.MaioIdade;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);

    System.out.print("Quantas Pessoas voce vai digitar ?");
    int qty = sc.nextInt();
    sc.nextLine();

    MaioIdade[] pessoa = new MaioIdade[qty];

    for (int i = 0; i < pessoa.length; i++) {
      System.out.printf("Dados da %da pessoa: %n", i+1);
      System.out.print("Nome: ");
      String nome = sc.nextLine();

      System.out.print("Idade: ");
      int idade = sc.nextInt();
      sc.nextLine();
      pessoa[i] = new MaioIdade(nome, idade);
    }

    int idadeMaior = pessoa[0].getIdade();
    String nomeMaior = pessoa[0].getNome();

    for (int i = 1; i < pessoa.length; i++) {
      if (pessoa[i].getIdade() > idadeMaior ) {
        idadeMaior = pessoa[i].getIdade();
        nomeMaior = pessoa[i].getNome();
      }
    }

    System.out.println("Pessoa Mais Velha: " + nomeMaior);

    sc.close();
  }
}
