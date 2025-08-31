package Exercicios.produtoVetorial;

public class ProdutoVetorial {
	/**
	 * @Exercicio4: Faça um programa em Java que retorne o produto vetorial
	 * de dois vetores constantes de 10 elementos inteiros.
	 * */
	
	public static void main(String[] args) {
		
		int qtd = 3;
		
		int[] vetor01 = new int[qtd];
		int[] vetor02 = new int[qtd];
		
		int[] prod_vetorial = new int[qtd];
		
		// Populated vetores
		for (int i = 0; i < vetor01.length; i++){
			vetor01[i] = i + 1;
			vetor02[i] = i + 2;
			prod_vetorial[i] = vetor01[i] * vetor02[i];
		}
		
		// Exibindo ambos vetores:
		System.out.print("Vetor1 : ");
		for (int value : vetor01) {
			System.out.print(value + ", ");
			
		}
		System.out.println();
		
		System.out.print("Vetor2 : ");
		for (int k : vetor02) {
			System.out.print(k + ", ");
		}
		System.out.println();
		
		System.out.print("Produto Vetorial : ");
		for (int j : prod_vetorial){
			System.out.print(j + ", ");
		}
		System.out.println();
	}
	
}
