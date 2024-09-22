package ConceitosBasicos;

import java.util.Scanner;

public class NextLineScanner {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s1, s2, s3;
    int x;

    x = sc.nextInt();
    sc.nextLine();      // when we use another type, we need to do it like this
    s1 = sc.nextLine(); // get all the text until you press enter
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println(x);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
