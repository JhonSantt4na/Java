package Collection.Exercicios.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class FilaAtendimento {
	/**
	 * Utilize uma LinkedList<String> para simular uma fila.
	 * A cada chamada, remova o primeiro elemento da lista e imprima quem foi atendido.
	 * */
	public static void main(String[] args) {
		LinkedList<String> fila = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opc;
		do {
			System.out.println("1 - Adicionar a fila");
			System.out.println("2 - Remover a fila");
			System.out.println("3 - Exibir a fila");
			System.out.println("0 - Sair do Programa");
			System.out.print("Digite a sua opção: ");
			opc = sc.nextInt();
			
			switch (opc){
				case 1 :
					System.out.print("Digite o nome do usuario: ");
					String nome = sc.next();
					fila.add(nome);
					System.out.printf("o user %s entrou na fila%n", nome);
					break;
				case 2 :
					String usuario = fila.removeFirst();
					System.out.printf("o user %s saiu", usuario);
					break;
				case 3 :
					for (String user : fila){
						System.out.println(user);
					}
					break;
				case 0 :
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção invalida..");
			}
			
		}while (opc != 0);
		
		
		sc.close();
	}
}
