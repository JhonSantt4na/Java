package Memoria_Vetores.Exercicios;
/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver
*/

import Memoria_Vetores.Entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas pessoas serao digitadas?");
    int qty = sc.nextInt();
    sc.nextLine();

    Pessoa[] pessoas = new Pessoa[qty];
    double somaAltura = 0.0;
    int menoresDe16 = 0;

    // Array para armazenar os nomes das pessoas com menos de 16 anos
    String[] nomesMenoresDe16 = new String[qty];

    for (int i = 0; i < qty; i++) {
      System.out.printf("Dados da %da pessoa: %n", i + 1);
      System.out.print("Nome: ");
      String nome = sc.nextLine();

      System.out.print("Idade: ");
      int idade = sc.nextInt();
      sc.nextLine();

      System.out.print("Altura: ");
      double altura = sc.nextDouble();
      sc.nextLine();

      pessoas[i] = new Pessoa(nome, idade, altura);

      // Acumulando a altura para calcular a média
      somaAltura += altura;

      // Verificando se a idade é menor que 16
      if (idade < 16) {
        nomesMenoresDe16[menoresDe16] = nome; // Armazena o nome
        menoresDe16++; // Incrementa a contagem
      }
    }

    // Cálculo da altura média
    double alturaMedia = somaAltura / qty;

    // Cálculo da porcentagem de pessoas com menos de 16 anos
    double porcentagemMenoresDe16 = (double) menoresDe16 / qty * 100;

    // Exibindo os resultados
    System.out.printf("Altura média: %.2f%n", alturaMedia);
    System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenoresDe16);

    // Exibindo nomes das pessoas com menos de 16 anos, se houver
    if (menoresDe16 > 0) {
      System.out.println("Nomes das pessoas com menos de 16 anos:");
      for (int i = 0; i < menoresDe16; i++) {
        System.out.println(nomesMenoresDe16[i]); // Exibe os nomes
      }
    } else {
      System.out.println("Não há pessoas com menos de 16 anos.");
    }

    sc.close();
  }
}
