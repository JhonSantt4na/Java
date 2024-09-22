/**
 * • System.out.print   =
 *
 * • System.out.println =
 *
 * • System.out.printf = with formatting
 *      • %d             = type int
 *      • %f             = type double
 *      • %s             = type string
 *      • %n             = skip the line
 */

package ConceitosBasicos;
import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {

        // Output data
        System.out.print("not skip the line");
        System.out.print("together");
        System.out.println("with skip the line");
        System.out.println("line down");

        // with formatting
        // Symbol types: %s > %n > %d > %.2f
        // Map : printf("string formatted with symbol types", Variables,in,order,of,Symbol,types);
        String name = "john";
        int age = 22;
        double height = 1.74;
        Locale.setDefault(Locale.US);    // Used for dot "." instead of comma ","  obs: import Locale and use before of data output.
        System.out.printf("my name is %s, %nI have %d age and %.2f height", name, age, height);
    }
}
