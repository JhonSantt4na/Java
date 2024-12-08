package _03_Memoria_Vetores.Exercicios;
import java.util.Locale;
import java.util.Scanner;

//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//NUMEROS PARES:
//8 2 14 20
//QUANTIDADE DE PARES = 4

public class NumerosPares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int qty = sc.nextInt();
    sc.nextLine();

    int[] vect = new int[qty];
    int qtyNumber = 0;

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      int num = sc.nextInt();
      sc.nextLine();

      if(num % 2 == 0){
        vect[i] = num;
        qtyNumber++;
      }
    }
    boolean first = true;
    for (int i = 0; i < vect.length; i++) {
      if(vect[i] != 0) {
        if (!first) {
          System.out.print(", ");
        }
        System.out.print(vect[i]);
        first = false;
      }
    }

    System.out.printf("%nQuantidade de Pares: %d", qtyNumber);
    sc.close();
  }
}
