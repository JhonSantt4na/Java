package Vetores;

public class Main {
	public static void main(String[] args) {
		/**
		 * @Vetores: é um conjunto indexado de dados, que pode ser acessado pelo seu indices
		 * no java:
		 * primeiro elemento é o indices 0
		 * ultimo elemento é o tamanho do vetor - 1;
		 * ex: tiver-se um vetor de 10 elemento é de 0-9
		 * */
		
		// 3 Formas de declarar vetores:
		int[] vetor1;                   // Indica o vetor de inteiro, sem determinar o tamanho e sem ser inicializado
		int[] vetor2 = new int[3];      // Inicialização com um vetor com 3 posições porem todos os seus valores null
		int[] vetor3 = {10, 20, 30};    // Inicializado com um vetor com 3 posições com valores definidos
		
		// Forma de Acessar elementos:
		// Acessando a primeira pos do vetor 1 e adicionado um valor ou substituindo um já existente;
		//vetor1[0] = 1; Erro como o vetor1 não foi inicializado não conseguimos acessar ao seu primeiro elemento;
		vetor2[0] = 1;				// como o vetor2 foi inicializado, mas não tem valor em nenhum elemento vamos adicionar esse valor atribuído
		vetor3[0] = 1;				// como o vetor3 foi inicializado e tem valor já definido vamos substituir o valor por esse que estamos a adicionar
		
		int soma = 0;             //  variable Auxiliar soma, vamos somar todos os valores e adicionar nessa variable
		for (int i = 0; i < vetor3.length; i++) { // vamos adicionando a cada 1 até o int variable de controle atingir o tamanho do vetor, sendo assim vamos acessar todas as pos do vector3
			soma += vetor3[i];    // Cada interação vamos atribuir o valor que a var soma já tem somando com a do
			// vetor3[] na posição que for sendo ativo da vez i=0,i=1,i=2,i=3 em cada vez quer passar
		}
		System.out.println(soma);
		
		/**
		 * @ForEach(ParaCada): Estrutura especial para percorrer elementos do vetores;
		 * - percore cada elemento por vez
		 * - temos que declarar o tipo do elemento conforme o tipo do vetor;
		 * caso contrario o java faz uma conversão explicita
		 * */
		
		int[] vector = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int elemento: vector) {
			sum+=elemento;
		}
		
		System.out.println(sum);
		
		/**
		 * @comandos_que_modificam_uma_estrutura_de_repetição: são comandos que controla o for e forEach
		 *
		 * @break -> interrompe o fluxo na mesma hora e sai do bloco do for.
		 *
		 * @Continue -> continue ele pula o resto do cod e vai para a proxima vez so for
		 * */
		
		System.out.println("Break: ");
		for (int i =0; i< 10; i++){
			if (i == 5){
				break;
			}
			System.out.format("%d, ", i);
		}
		
		System.out.println("\nContinue: ");      // \n -> serve para pular a linha no print sem ser com o format

		for (int i =0; i< 10; i++){
			if (i == 5){
				continue;
			}
			System.out.format("%d, ", i);
		}
	}
}
