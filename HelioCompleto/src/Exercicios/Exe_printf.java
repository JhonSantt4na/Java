package Exercicios;

public class Exe_printf {
    public static void main(String[] args){
            String product01 = "Computer";
            String product02 = "Office desk";

            byte age = 30;
            int code = 5290;
            char gender = 'F';

            double price1 = 2100.0;
            double price2 = 650.50;
            double measure = 53.234567;

            System.out.println("Products:");
            System.out.printf("%s, which price is $ %.2f %n", product01, price1);
            System.out.printf("%s, which price is $ %.2f %n %n", product02, price2);
            System.out.printf("Record: %d years old, code %d and gender: %s %n %n", age, code, gender);
            System.out.printf("Measue with eight decimal places: %.8f %n",measure);
            System.out.printf("Rouded ( three decimal places): %.3f %n", measure);
            java.util.Locale.setDefault(java.util.Locale.US);
            System.out.printf("US decimal point: %.3f%n", measure);

    }
}
