package ConceitosBasicos.TopicosBasicos;

import java.util.Scanner;

public class Bitwise {
  public static void main(String[] args) {
    // Operadores bit a bit
    // Cada numero tem a representação binaria
    // ex: 0101 1001 = 89
    // 0011 1100 = 60
    // Basicamente ele compara bit com bit

    int n1 = 89;
    int n2 = 60;

    // &  : Operação "E" bit a bit (Ambas Verdadeira)
    System.out.println(n1 & n2);
    // |  : Operação "Ou" bit a bit (Pelomenos uma verdadeira)
    System.out.println(n1 | n2);
    // ^  : Operação "Ou-Exclusivo" bit a bit (Verdade quando apenas uma da verdade)
    System.out.println(n1 ^ n2);

    Scanner sc = new Scanner(System.in);
    int mask= 0b100000; // Ou 32
    int n = sc.nextInt();

    if((n & mask) != 0){
      System.out.println("6th bit is true");
    }else{
      System.out.println("6th bit is false");
    }



  }
}
