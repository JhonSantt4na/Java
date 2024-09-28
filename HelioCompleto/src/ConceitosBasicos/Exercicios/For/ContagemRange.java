package ConceitosBasicos.Exercicios.For;

import java.util.Scanner;

public class ContagemRange {
  public static void main(String[] args) {
    //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

    Scanner sc = new Scanner(System.in);
    System.out.println("Write one number:");
    int n = sc.nextInt();
    int in = 0;
    int out = 0;

    for (int i = 0; i < n; i++) {
      int numeros = sc.nextInt();
      if(numeros >= 10 && numeros <=20){
        in++;
      }else {
        out++;
      }
    }
    System.out.printf("%d in %n", in);
    System.out.printf("%d out", out);

    sc.close();
  }
}
