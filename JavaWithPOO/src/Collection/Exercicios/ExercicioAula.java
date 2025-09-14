package Collection.Exercicios;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ExercicioAula {
	/**
	 * Faça um programa em java que armazene um conjunto de produtos com os seus
	 * respetivos códigos únicos e preços. o programa deve permitir ao utilizador
	 * adicionar, remover e modificar um produto, além de permitir gerar um relatório em tala
	 * dos produtos cadastrados. A chave do produto deve ser gerada automaticamente de forma sequencial.
	 *
	 * Dica:
	 * Use Collections.Max(...) para obter o maior valor de uma chave inteira em um HashMap
	 * */
	
	public static void main(String[] args) throws InterruptedException, IOException {
		HashMap<Integer, String> nomes = new HashMap<>();
		HashMap<Integer, Double> precos = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int opcMenu = 0;
		do {
			mostraMenu();
			opcMenu = lerOpcMenu(sc);
			if (!processarOpcMenu(sc, opcMenu, nomes, precos)) {
				System.out.println("Opção invalida. Tente novamente...");
				Thread.sleep(2000);
			}
			
		}while ( opcMenu != 5);
		sc.close();
	}
	
	private static void mostraMenu() {
		System.out.println("CADASTRO DE PRODUTOS");
		System.out.println("---------------------");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Remover");
		System.out.println("4 - Listar");
		System.out.println("5 - Sair");
		System.out.println("---------------------");
	}
	
	private static int lerOpcMenu(Scanner sc) {
		System.out.print(">> Opção desejada: ");
		int opcEscolhida = sc.nextInt();
		sc.nextLine();
		return opcEscolhida;
	}
	
	private static boolean processarOpcMenu (
		Scanner sc,
		int opcMenu,
		HashMap<Integer, String> nomes,
		HashMap<Integer, Double> precos) throws InterruptedException, IOException{
		switch (opcMenu){
			case 1:
				adicionarProduto(sc, nomes, precos);
				return true;
			case 2:
				alterarProduto(sc, nomes, precos);
				return true;
			case 3:
				removerProduto(sc, nomes, precos);
				return true;
			case 4:
				listarProduto(nomes, precos);
				return true;
			case 5:
				sairPrograma();
				return true;
			default:
				return false;
		}
	}
	
	private static void adicionarProduto(Scanner sc, HashMap<Integer, String> nomes, HashMap<Integer, Double> precos) throws IOException {
		System.out.println("ADICIONANDO PRODUTOS");
		System.out.println("-----------------------");
		
		System.out.print(">> Nome: ");
		String nome = sc.next();
		
		System.out.print(">> Preço: ");
		Double preco = sc.nextDouble();
		
		int proximaChave = obterProximaChave(nomes.keySet());
		nomes.put(proximaChave, nome);
		precos.put(proximaChave, preco);
		System.out.println("-----------------------");
		System.out.println("Produto Adicionado com sucesso!");
		
		System.out.println(">> Pressione ENTER para voltar ao menu...");
		System.in.read(); // Aguarda o ENTER
		
	}
	
	
	private static void alterarProduto(Scanner sc, HashMap<Integer, String> nomes, HashMap<Integer, Double> precos) throws IOException {
		System.out.println("ALTERAÇÃO PRODUTOS");
		System.out.println("-------------------");
		System.out.print(">> Código: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		if (nomes.containsKey(codigo)){
			System.out.format("Valores originais:%n%s, R$ %.2f%n",
				nomes.get(codigo), precos.get(codigo));
			
			System.out.println("(Deixe em branco para manter o valor original)");
			
			System.out.print(">> Novo nome: ");
			String novoNome = sc.nextLine().trim();
			novoNome = novoNome.isEmpty() ? nomes.get(codigo) : novoNome;
			
			System.out.print(">> Novo preço: ");
			String novoPrecoStr = sc.nextLine().trim();
			Double novoPreco = novoPrecoStr.isEmpty() ? precos.get(codigo) :
				Double.parseDouble(novoPrecoStr.replace(',', '.'));
			
			nomes.put(codigo, novoNome);
			precos.put(codigo, novoPreco);
			
			System.out.println("-----------------------");
			System.out.println("Produto alterado com sucesso!");
			
		} else {
				System.out.println("Produto não encontrado!");
		}
		System.out.println(">> Pressione ENTER para voltar ao menu...");
		System.in.read(); // Aguarda o ENTER
	}
	
	private static void removerProduto(Scanner sc, HashMap<Integer, String> nomes, HashMap<Integer, Double> precos) throws IOException {
		System.out.println("REMOVER PRODUTOS");
		System.out.println("-------------------");
		System.out.print(">> Código: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		if (nomes.containsKey(codigo)){
			System.out.format("Valores originais:%n%s, R$ %.2f%n", nomes.get(codigo), precos.get(codigo));
			System.out.print(">> Confirmar a exclusão (S/N): ");
			String resposta = sc.nextLine().trim();
			if (resposta.toUpperCase().equals("S")){
				nomes.remove(codigo);
				precos.remove(codigo);
				System.out.println("-----------------------");
				System.out.println("Produto removido com sucesso!");
			} else {
				System.out.println("Remoção não confirmada.");
			}
		}else {
			System.out.println("Produto não encontrado!");
		}
		System.out.println(">> Pressione ENTER para voltar ao menu...");
		System.in.read(); // Aguarda o ENTER
	}
	
	private static void listarProduto(HashMap<Integer, String> nomes, HashMap<Integer, Double> precos) throws IOException {
		System.out.println("PRODUTOS CADASTRADOS");
		System.out.println("------------------------------");
		System.out.format("%6s | %-10s | %6s%n", "Código", "Nome", "Preço");
		for (int chave : nomes.keySet()){
			System.out.printf("%06d | %-10s | R$%6.2f%n", chave, nomes.get(chave), precos.get(chave));
		}
		System.out.println("------------------------------");
		System.out.println(">> Pressione ENTER para voltar ao menu...");
		System.in.read(); // Aguarda o ENTER
	}
	
	private static void sairPrograma() throws InterruptedException {
		System.out.println("Saindo do Programa");
		Thread.sleep(2000);
	}
	
	private static int obterProximaChave(Set<Integer> integers) {
		if (integers.size() > 0){
			return Collections.max(integers) + 1;
		}else return 1;
	}
	
}
