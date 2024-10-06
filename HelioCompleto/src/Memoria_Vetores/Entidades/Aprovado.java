package Memoria_Vetores.Entidades;

public class Aprovado {
  String nome;
  double nota1;
  double nota2;

  public Aprovado(String nome, double nota1, double nota2) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public String getNome() {
    return nome;
  }

  public double getNota1() {
    return nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public double media(double nota1, double nota2){
    this.nota1 = nota1;
    this.nota2 = nota2;
    double soma  = nota1 + nota2;
    double media = soma / 2.0;
    return  media;
  }
}
