package _10_1_Generics.ProjectExemple;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService</*Integer aq opcional*/>();
		// ou seja o nosso array so aceita o tipo inteiro, se colocarmos String so
		// aceitara String e assim pra qualquer tipo
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		//não deixa adicionar qualuer coisa do tipo object
		for (int i = 0; i < n; i++){
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println(" First: " + ps.first());
		
		sc.close();
	}
}
