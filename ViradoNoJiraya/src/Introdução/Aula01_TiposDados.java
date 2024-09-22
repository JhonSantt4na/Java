package Introdução;

public class Aula01_TiposDados {
  public static void main(String[] args) {
    // We have 8 types, all are numeric except boolean
    // Any number java sees as int, so we need to use 'l' for long, '.0' for double and 'f' for float.
    byte ageByte = 1;
    int middleNumber = 121334545;
    short ageS = 3;
    long bigNumber = 99999999l;
    double salary = 4000.0;
    float salaryF = 5000f;
    boolean isDev = true; // No accept 0 or 1, only true end false
    boolean isBad = false;
    char one_letter = 'J'; // It has two bytes because of the Japanning language and we use single quotes

    // String is not a primitive type but a reference type
    String nome = "Jorge"; // We use double quotes
    var functionalityJava10 = "allowing to add without the type";

    // Cast
    float ageI = (float) 100000000; // we will force him to accept float (  100000000 is int )

    //Output data:
    System.out.println(functionalityJava10);
    System.out.println(nome);
    System.out.println(ageByte);
    System.out.println(ageI);
    System.out.println(ageS);
    System.out.println(bigNumber);
    System.out.println(isDev);
    System.out.println(isBad);
    System.out.println(one_letter);

    // Putting together, a data output (String + byte)
    System.out.println("The age is: " + ageByte);
  }
}

