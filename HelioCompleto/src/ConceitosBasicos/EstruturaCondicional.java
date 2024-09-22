package ConceitosBasicos;

import java.util.Scanner;

public class EstruturaCondicional {
  public static void main(String[] args) {
    //if(condition){          // Simples only the "if"
    //  Command block
    // }else{                 // Compost used the "else"
    //  Command block2
    // }
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the schedule?");
    int hora = sc.nextInt();

    if (hora < 12) {    // Return true he exec the command block below
      System.out.println("Good morning");
    }else if(hora < 18){          // Returns False executes the command block below or if not, follows the flow
      System.out.println("Good afternoon");
    }else{
      System.out.println("Good night");
    }

    // One Command { optional}


    sc.close();
  }
}
