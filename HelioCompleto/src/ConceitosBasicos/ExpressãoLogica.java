package ConceitosBasicos;

public class ExpressãoLogica {
  public static void main(String[] args) {
    // Logical Expressions
    // expression1 && expression2 Return valueTrueOrFalse
    // && = E
    // || = OU
    //  ! = NÂO

    int E = 5; // Used && {Both expressions must be true.}
    boolean res = E <= 20 && E == 10;             // False
    boolean res2 = E > 0 && E != 3;               // True
    boolean res3 = E <= 20 && E == 10 && E != 3;  // False

    int OU = 5;  // Used || {One of the two expressions must be true}
    boolean res4 = OU == 10 || OU <= 10;             // True
    boolean res5 = OU > 0 || OU != 3;                // True
    boolean res6 = OU <= 0 || OU != 3 || OU != 5;    // True

    int NAO = 5; // Used ! {Expression will be inverted}
    boolean res7 = !(NAO == 10);                  // True
    boolean res8 = !(NAO >= 2);                   // False
    boolean res9 = !(NAO <= 20 && NAO == 10);     // True

    System.out.println(res7);
    System.out.println(res8);
    System.out.println(res9);

  }
}
