/**
 * • Cannot start with a digit: use a letter or _
 * • Cannot have white space
 * • Do not use accents or tildes
 * • Suggestion: use the "camel case" pattern
 */

package _01_ConceitosBasicos;

public class Variaveis {
    public static void main(String[] args) {

        var using_var = "Allowing to add without type";
        System.out.println(using_var);

        // String in java is a Class. used as 'type'
        // always with "double quotes"
        String nome = "Jorge";

        // Create a variable
        // Map : type nameVariable = "ValueVariable";
        String nameVariable = "ValueVariable";
        System.out.println(nameVariable + nome);
    }
}
