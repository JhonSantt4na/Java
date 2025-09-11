package LinhaDeComando;

public class ExercicioLinhaDeComando {
	/**
	 * Faça um programa em java que aceite 3 argumentos de linha de comando, correspondentes, respectivamente
	 * a um número inteiro, um operador matemático básico (+-*'/') e um segundo número inteiro.
	 * O programa deve retornar o resultado da operação matemática formada pelos argumentos;
	 * */
	
	public static void main(String[] args) {
		if (args.length == 3){
			int valor1 = 0, valor2 = 0, resultado = 0;
			char operador = '+';
			try {
				valor1 = Integer.parseInt(args[0]);
				operador = args[1].charAt(0);
				valor2 = Integer.parseInt(args[2]);
			}catch (NumberFormatException e) {
				System.err.println("Argumentos devem ser um inteiro, um caractere e outro inteiro");
				System.exit(1);
			}
			switch (operador){
				case '+':
					resultado = valor1 + valor2;
					break;
				case '-':
					resultado = valor1 - valor2;
					break;
				case 'x': // pois o * é reservado
					resultado = valor1 * valor2;
					break;
				case '/':
					resultado = valor1 / valor2;
					break;
				default:
					System.err.format("O Operador %c não foi reconhecido. %n", operador);
					System.exit(2);
			}
			System.out.format("Resultado = %d%n", resultado);
		}else {
			System.err.println("Este programa requer 3 argumentos.");
			System.exit(3); // Resultado do erro indica qual foi o erro e facilita identificar onde aconteceu.
		}
	}
	
}
