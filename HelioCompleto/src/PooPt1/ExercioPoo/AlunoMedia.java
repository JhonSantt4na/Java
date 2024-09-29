package PooPt1.ExercioPoo;

import PooPt1.Entidades.Aluno;
import PooPt1.Entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMedia {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Aluno novoAluno = new Aluno();

    novoAluno.name = sc.nextLine();
    novoAluno.nota1 = sc.nextDouble();
    novoAluno.nota2 = sc.nextDouble();
    novoAluno.nota3 = sc.nextDouble();

    double notaMedia = novoAluno.finalMedia();
    System.out.printf("Final Grade = %.2f %n", novoAluno.finalMedia());
    novoAluno.isPassed(notaMedia);

    sc.close();
  }
}
