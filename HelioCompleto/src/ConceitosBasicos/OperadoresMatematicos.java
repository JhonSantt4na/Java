/**
 *  <h1>Order of Precedence </h1>
 *  <p>
 *  First ->    ()      <br>
 *  Second ->   / * %   <br>
 *  Lasted ->   + -     <br>
 *  </p>
 *
 *  2*6/3                 // res = 4
 *  3+2*4                 // res = 11
 *  (3 + 2) * 4           // res = 20
 *  60 / (3 + 2) * 4      // res = 48
 *  60 / ((3 + 2) * 4)    // res = 3
 */


package ConceitosBasicos;

public class OperadoresMatematicos {
    public static void main(String[] args) {
        // Arithmetic operator = + - / * %
        // Order of Precedence = ()  »  / * %  »  + -
        int num1 = 2;
        int num2 = 3;

        // basic operator
        int Addition = num1 + num2;
        int Subtraction = num1 - num2;
        int Multiplication = num1 * num2;
        int Division = num1 / num2;
        int Module = num1 % num2;

        System.out.println(Addition);
        System.out.println(Subtraction);
        System.out.println(Multiplication);
        System.out.println(Division);
        System.out.println(Module);
    }
}
