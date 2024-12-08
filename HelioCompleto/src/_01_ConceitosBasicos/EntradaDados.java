package _01_ConceitosBasicos;
import java.util.Scanner;

public class EntradaDados {
  public static void main(String[] args) {
    // Import ConcreatScanner and use the as method in the next saved variables
    Scanner sc = new Scanner(System.in);

    String name;
    char sex;
    int age;
    double height;

    System.out.println("Whats Your Name?");
    name = sc.next();   // To String use next() (only a word)

    System.out.println("What your sex?");
    sex = sc.next().charAt(0); // First char in the String

    System.out.println("Whats your age?");
    age = sc.nextInt(); // To int use nextInt()

    System.out.println("What your height?");
    height = sc.nextDouble(); // To double use nextDouble()

    System.out.printf("Your name is: %s %nsex: %s %nyou have %d age %nand %.2f height", name,sex,age,height);
    sc.close();   // Closing method ConcreatScanner
  }
}
