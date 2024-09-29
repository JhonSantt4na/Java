package PooPt1.Entidades;

public class Aluno {
  public String name;
  public double nota1;
  public double nota2;
  public double nota3;

  public double finalMedia() {
    return nota1 + nota2 + nota3;
  }

  public void isPassed(double media){
    if(media >= 60.0){
      System.out.println("Pass");
    } else {
      double resta = 60.0 - media;
      System.out.printf("Failed %n");
      System.out.printf("Missing = %.2f Points", resta);
    }
  }
}