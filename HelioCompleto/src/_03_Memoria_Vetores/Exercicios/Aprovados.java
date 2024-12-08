package _03_Memoria_Vetores.Exercicios;

import _03_Memoria_Vetores.Entidades.Aprovado;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serao digitados? ");
    int qty = sc.nextInt();
    sc.nextLine();

    Aprovado[] vect = new Aprovado[qty];

    for (int i = 0; i < vect.length; i++) {
      System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);

      String nome = sc.nextLine();
      double nota1 = sc.nextDouble();
      sc.nextLine();
      double nota2 = sc.nextDouble();
      sc.nextLine();

      vect[i] = new Aprovado(nome,nota1,nota2);
    }

    System.out.println("Alunos Aprovados: ");

    for (int i = 0; i < vect.length; i++) {
      double nota1 = vect[i].getNota1();
      double nota2 = vect[i].getNota2();
      if(vect[i].media(nota1, nota2) >= 6.0){
        System.out.println(vect[i].getNome());
      }
    }

    sc.close();
  }
}
