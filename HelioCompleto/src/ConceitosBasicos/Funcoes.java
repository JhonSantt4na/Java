package ConceitosBasicos;

import java.util.Scanner;

public class Funcoes {
  public static void main(String[] args) {
   // Representa um processamento que possui um significado
   // Exemplos de Funções: Math.sqrt(double),  System.out.println(string);
   // Pode ter parametros entre os parenteses() e ter ou não um retorno
   // VANTAGENS : Delegação e modularização de programa, reaprveitar varias vezes.
   // Em POO funções recebem os nomes de "metodos".

   //Ex: Fazer um programa que pega 3 numeros e retorna o maio deles

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.println("Higher = " + a);
    } else if (b > c) {
      System.out.println("Higher = " + b);
    }else {
      System.out.println("Higher = "+ c);
    }


   // Usando a função:
    System.out.println("Enter three numbers: ");
    int aa = sc.nextInt();
    int bb = sc.nextInt();
    int cc = sc.nextInt();

    // Chamando a Funcoes
    int higher = max(aa, bb, cc);
    showResult(higher);
    sc.close();
  }
  // Função que retorna o int
  public static int max(int x,int y,int z) {
    int aux;
    if (x > y && x > z) {
      aux = x;
    } else if (y > z) {
      aux = y;
    }else {
      aux = z;
    }

    return aux;
  }
  // Função que nao retorna nada e imprime na tela
  public static void showResult(int msg) {
    System.out.println(msg);
  }

}
