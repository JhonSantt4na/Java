package LinhaDeComando;

public class LinhaDeComando {
	/**
	 * é muito ultilizado para tarefas de sistemas usamos passando diferetes argumentos para ele
	 * O proprio compilador do java ele é um programa console que aceita diferentes argumentos sendo o mais basico deles o proprio nome do arquivo a ser compilado
	 * */
	
	/**
	 * Quando execultamos um programa em java o metodo main é um metodo de entrada no programa
	 * ele possui um parametro chamado args que é um vetor de Strings e esse parametro é automaticamente
	 * imentado pelo runtime do java com os argumentos de linha de comando que são passados durante a execução do programa
	 * */
	
//	public static void main(String[] args) {
//		for(String s : args){
//			System.out.println(s);
//		}
//	}
	
	/**
	 * Formas de execultar: usar o launch.json no vscode
	 * pode ser acessado na pasta do vscode
	 * criamos uma nova entrada chamada "args": "args1 args2 args3 args4 args5"
	 * ou vai em rum edit configuration e adiciona os parametros no intelijj
	 * */
	
	// Se for numero ele precisa ser convertido para funcionar
	
	public static void main(String[] args) {
		if (args.length > 0){
			int[] intArgs = new int[args.length];
			for (int i = 0; i < intArgs.length; i++) {
				try {
					intArgs[i] = Integer.parseInt(args[i]);
					System.out.format("Argumento inteiro %d = %d%n", i, intArgs[i]);
				}catch (NumberFormatException e){
					System.err.println("Argumento" + args[i] + " deve ser um inteiro.");
					System.exit(1); // Basta comentar para conveter os demais e nao parar
					// Abandona a exec do programa com um codigo de erro;
					// Codigo 1 erro de conversao de string para número: poderiamos passar qualquer um.
				}
			}
		}
	}
	
	// O que acontece se um dos arquivos nao poder ser convertido para inteiro ele gera uma exception
	
	
}
