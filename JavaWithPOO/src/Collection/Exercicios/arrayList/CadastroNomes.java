package Collection.Exercicios.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNomes {
	/**
	 * Crie um programa que permita ao usuário cadastrar nomes via Scanner. Ao final,
	 * imprima todos os nomes cadastrados ordenadamente.
	 * */
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> nomes;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> users = new ArrayList<>();
		int opc = 0;
		do {
			System.out.println("1 - Cadastro User");
			System.out.println("2 - Remover User ");
			System.out.println("3 - Listar Users");
			System.out.println("0 - Sair do programa");
			System.out.print("Escolha uma opção: ");
			opc = sc.nextInt();
			String user ;
			switch (opc) {
				case 1:
					System.out.print("Digite o nome do User: ");
					user = sc.next();
					users.add(user);
					System.out.println("Cadastrando User...");
					Thread.sleep(2000);
					System.out.println("User Cadastrado");
					break;
				case 2:
					System.out.print("Digite o nome do user a ser removido: ");
					user = sc.next();
					if (users.contains(user)){
						users.remove(user);
						System.out.println("Deletando User...");
						Thread.sleep(2000);
						System.out.println("User Deletado");
						break;
					}else {
						System.out.println("User não encontrado.");
						break;
					}
				case 3:
					System.out.println("Listando Users...");
					Thread.sleep(2000);
					for (String nome: users){
						System.out.println(nome);
					}
					break;
				case 0:
					System.out.println("Saindo do programa...");
					Thread.sleep(1000);
					break;
				default:
					System.out.println("Opção invalida!");
					Thread.sleep(2000);
					break;
			}
		}while(opc != 0);
		
		
		sc.close();
	
	}
}

