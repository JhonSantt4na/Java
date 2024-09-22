package ConceitosBasicos;

public class TiposDados {
    public static void main(String[] args) {

        //  Map : type qtyBits = valueMax    valueDefault
        // Types Numeric
        byte bits8 = 127;                        // 0
        short bits16 = 32767;                    // 0
        int bits32 = 2147483647;                 // 0
        long bits64 = 9223372036854770000l;      // 0l

        //Floating Numbers
        float bits32f = 340.280f;   // 3,4028E+38     0.0f
        double bits64d = 1.790d;    // 1,79E+308      0.0
        // obs: Always indicate the type of number  .0, f, l

        // Unicode
        char bits16c = 'a';         // \u0000'
        // obs : Always use single quotes
        // get only one digit

        // True or False
        boolean bit1 = true;         // false

        // Casting = Explicit conversion
        int num1 = 21;
        int num2 = 22;
        double convertDouble = (double) num1 + num2;
        System.out.println(convertDouble);
        // Converted a soma dos numeros int que deveria ser int para um res em double
    }
}
