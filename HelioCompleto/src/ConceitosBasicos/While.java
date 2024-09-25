package ConceitosBasicos;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    // Usase quando não sabe previamente a qunatidade de repetições que será realizada.
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();

    int soma = 0;
    while(numero != 0){
      soma += numero;
      numero = sc.nextInt();
    }
    System.out.printf("A soma dos Valores é: %d", soma);
  }
}
