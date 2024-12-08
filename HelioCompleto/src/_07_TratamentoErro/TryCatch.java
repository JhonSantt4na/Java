package _07_TratamentoErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Lendo Strings e Adicionando no Vetor
			String[] vect = sc.nextLine().split(" ");
			
			// Perguntando a posição a ser exibida
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		}catch (InputMismatchException e){
			System.out.println("Input Error");
		}
		// Sem os tratamento dos erros o programa encerra
		// Anntes de exibir a msg que o programa terminou
		System.out.println("Fim do ProgramMR");
		sc.close();
	}
}
