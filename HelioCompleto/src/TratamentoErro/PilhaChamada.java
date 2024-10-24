package TratamentoErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaChamada {
	public static void main(String[] args) {
		method01();
		System.out.println("End of ProgramMR");
	}
	public static void method01() {
		System.out.println("***METHOD1 START***"); // Quando inicia o Method1
		method02();
		System.out.println("***METHOD1 END***"); // Quando Termina o Method1
	}
	
	public static void method02(){
		System.out.println("***METHOD2 START***"); // Quando Inicia o method2
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace(); // Mostra a Pilha de Chamada dos erros
			// que acarretou na Exception
		}catch (InputMismatchException e){
			System.out.println("Input Error");
		}
		sc.close();
		System.out.println("***METHOD2 END***"); // Quando Termina o method2
	}
}

// Return:
// java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1
//	at TratamentoErro.PilhaChamada.method02(PilhaChamada.java:23)
//	at TratamentoErro.PilhaChamada.method01(PilhaChamada.java:13)
//	at TratamentoErro.PilhaChamada.main(PilhaChamada.java:8)

// com o printStackTrace o erro não interrompe o programa