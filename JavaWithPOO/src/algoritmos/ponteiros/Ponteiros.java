package algoritmos.ponteiros;

import java.util.Arrays;

public class Ponteiros {
	/**
	 * @2Points -> Tecnica de usar 2 ponteiros de indice.
	 * No Array ordenado;
	 * passo1 - 1° ponteiro aponta para o primeiro elemento
	 * passo2 - 2° ponteoro aponta para o ultimo elemento
	 * passo3 - fazemos o array[i] + array[j] == target
	 * passo4 - quando o valor somado for maior que o target agente decrementa o j
	 * passo5 - quando o valor somado for menor que o target agente incrementa o i
	 * passo6 - quando a soma for == a target agente retorna;
	 *
	 * @Pq? para evitar que agente faça 2 for, usamos analise asintosica
	 * ou seja eliminando a comparação entre hardware ou seja um pc mac teria
	 * mais performace que um dell por exemplo com o mesmo algoritimo;
	 * nesse caso : quando temos 2 for seria n * n, mas no linear seria apenas n;
	 *
	 * */
	
	/**
	 * @Anunciado -> Dada uma matriz de números inteiros indexados de 1
	 * já classificada em ordem não diminuível, encontre dois números
	 * tal que eles somam um número de destino específico.
	 * Que esses dois números sejam números[index1] e números[index2]
	 * onde 1 ? índice1 ? index2 ? numbers.length.
	 *
	 * Retorne os índices dos dois números, índice1 e índice2,
	 * adicionado por um como um array inteiro [índice1, índice2] de comprimento 2.
	 * Os testes são gerados de tal forma que existe exatamente uma solução.
	 * Você pode não usar o mesmo elemento duas vezes.
	 *
	 * Sua solução deve usar apenas espaço extra constante.
	 *
	
	 * @Exemplo_1:
	 * Entrada: números ? [2,7,11,15], target ? 9
	 * Saída: [1,2]
	 * Explicação: A soma de 2 e 7 é 9. Portanto, índice1 x 1, índice 2 ? 2. Nós retornamos [1, 2].
	 *
	 * @Exemplo_2:
	 * Entrada: números ? [2,3,4], alvo ? 6
	 * Saída: [1,3]
	 * Explicação: A soma de 2 e 4 é 6. Por conseguinte, o índice1 ? 1, índice2 ? 3. Nós retornamos [1, 3].
	 *
	 * @Exemplo_3:
	 * Entrada: números ? [-1,0], target ? -1
	 * Saída: [1,2]
	 * Explicação: A soma de -1 e 0 é -1. Portanto, índice1 x 1, índice 2 ? 2. Nós retornamos [1, 2].
	 *
	 *
	 *
	 * @Restrições:
	 *     2 ? números.com.com. ? 3 ? 104
	 *     -1000 $ números[i] ? 1000
	 *     Os números são classificados em ordem não diminuível.
	 *     -1000 ? alvo ? 1000
	 *     Os testes são gerados de tal forma que existe exatamente uma solução.
	 * */
	
	public static void main(String[] args) {
		// Teste 1
		int[] arr1 = {2, 7, 11, 15};
		int target1 = 9;
		int[] result1 = twoSum(arr1, target1);
		System.out.println("Teste 1: " + Arrays.toString(result1)); // Esperado: [1, 2]
		
		// Teste 2
		int[] arr2 = {1, 2, 3, 4, 6};
		int target2 = 10;
		int[] result2 = twoSum(arr2, target2);
		System.out.println("Teste 2: " + Arrays.toString(result2)); // Esperado: [4, 5]
		
		// Teste 3
		int[] arr3 = {5, 25, 75};
		int target3 = 100;
		int[] result3 = twoSum(arr3, target3);
		System.out.println("Teste 3: " + Arrays.toString(result3)); // Esperado: [2, 3]
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		
		while(i < j){
			int soma = numbers[i] + numbers[j];
			
			if (soma > target){
				j--;
			}else if (soma < target){
				i++;
			} else {
				return new int[] {i + 1, j + 1};
			}
		}
		
		return new int[0];
	}
}
