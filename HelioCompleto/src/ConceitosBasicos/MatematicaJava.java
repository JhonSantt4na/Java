package ConceitosBasicos;

import java.sql.SQLOutput;

public class MatematicaJava {
  public static void main(String[] args) {
    // math in java :
    // Math.sqrt(value)           = Square Root (Raiz_Quadrada)
    // Math.pow(value, elevated)  = Value elevated (Potência)
    // Math.abs(value)            = Value Absolute (Absoluto)

    double value1 = 3.0;
    double value2 = 4.0;
    double value3 = -5.0;
    double res1, res2, res3;

    res1 = Math.sqrt(value1);
    res2 = Math.sqrt(value2);
    res3 = Math.sqrt(25.0);
    System.out.printf("Square Root at %.1f is > %.1f %n", value1, res1);
    System.out.printf("Square Root at %.1f is > %.1f %n", value2, res2);
    System.out.printf("Square Root at 25.0 is > %.1f %n", res3);

    res1 = Math.pow(value1, value2);
    res2 = Math.pow(value2, 2.0);
    res3 = Math.pow(5.0, 2.0);
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);

    res1 = Math.abs(value1);
    res2 = Math.abs(value2);
    res3 = Math.abs(value3);
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
  }
}
