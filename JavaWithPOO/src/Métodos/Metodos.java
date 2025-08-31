package Métodos;

public class Metodos {
	/**
	 * @Métodos: são um dos principais blocos de construções de um programa.
	 * Razes la no paradigma de programação procedural onde eram chamados de (procedimentos, subprogramas ou rotinas)
	 * >> Obedeçem ao procedimento de Entrada, processamento e Saida;
	 * >> Segue as mesmas regras para nomes de variáveis:
	 * 			- aceita letras e numerous e o char _
	 * 			- Não pode iniciar com números
	 *
	 * >> Sempre inicializado fora do bloco main
	 * >> Muito importante para o reuso.
	 *
	 *
	 * */
	
	public static void main(String[] args) {
		
		int[] vetor1 = { 13, 25, 43, 78, 33};
		int[] vetor2 = { 54, 82, 26, 51, 26};
		double res = obterMediaValor(vetor1);
		double res2 = obterMediaValor(vetor2);
		System.out.println(res);
		System.out.println(res2);
		
	}
	
	/**
	 * Modificador_de_acesso retorno nome_do_metodo (tipo do parametro e nome) { abertura do bloco de codigos
	 *			corpo do metodo ou bloco de código
	 * } fechamento do bloco de códigos
	 *
	 * */
	
	/**
	 * @Modificador_de_acesso: quem pode acessar esse metodo, qual classe/pacotes
	 *
	 * @static: Auto instantiable
	 *
	 * @Tipo_De_Retorno: o que o nosso metodo vai retornar podendo ser: (tipo primitivo, vetores, etc.)
	 *
	 * @Nome_do_metodo: use sempre um nome que se auto se Explique começando sempre com verbo de ação ou o que faz ex: calcularImpostos, gerarRelatório, isPrimo, isValid, isAccessible, etc.
	 *  e lembrando que precisa resolver apenas 1 problema.
	 *
	 * @Parametros_de_Entradas; pode ser sem parameters, ou com um parameter do tipo que agente informar.
	 *
	 * @Corpo_Do_Metodo: Onde o processamento do nosso metodo será feito, ou seja, onde vamos analisar se o parameter enviado
	 * é valido, ou se é primo, etc. ou no caso de não ter parameters de entrada será um código que faça alguma Ação no código
	 * */
	
	public static double obterMediaValor(int[] vetor) {
		int somaVetor2 = 0;
		for(int i = 0; i< vetor.length; i++){
			somaVetor2 += vetor[i];
		}
		double resultado = (float) somaVetor2 / vetor.length;
		return resultado;
	}
	
	public static int[] obterVetorInvertido(int[] vetor) {
		int[] vetorInvetido = new int[vetor.length];
		int iVetorInvetido = 0;
		for (int i = vetor.length -1 ; i >= 0 ; i--) {
			vetorInvetido[iVetorInvetido] = vetor[i];
			iVetorInvetido++;
		}
		return vetorInvetido;
	}
}
