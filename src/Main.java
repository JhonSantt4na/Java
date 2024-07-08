import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salario = 150000;
        var nome = "Jorge";
        byte idade = 26;
        boolean isBrasilian = true;
        char letra = 'k';
        String sobrenome = "Santt4na";
        double tamanho = 1.80;
        float salario2 = 4000.50F;

        if(idade >= 28){
            System.out.println("Maior");
        }else if (idade == 28){
            System.out.println("Igual");
        }else{
            System.out.println("Menor");
        }

        int[] numeros = {2,3,4};
        numeros[0] = 4;


        String[] qtdnum = new String[10];
        qtdnum[0] = "Jhonn";


        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(20);
        num.add(55);
        num.add(21);
        num.remove(0);
        num.get(1);
        num.size();

        for(var i = 0; i<= 5; i++){
            System.out.println(i);
        }
        int i = 0;

        while(0 < 10){
            i++;
            System.out.print(i);
        }

        int idade1 = 22;
        double idade2 = idade1;

        idade1 = (int) idade2;

        char ai = 'a';
        String nomed = String.valueOf(ai);
        ai = nomed.charAt(0);
        String nome2 = String.valueOf(idade);
        idade2 = Integer.parseInt(nome2);















    }
}