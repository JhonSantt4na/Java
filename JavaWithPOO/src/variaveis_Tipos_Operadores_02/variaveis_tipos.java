package variaveis_Tipos_Operadores_02;

public class variaveis_tipos {
	public static void main(String[] args) {
		/**
		 * @Variavel é uma representação em memória de alguma dado que queiramos armazenar no ‘app’.
		 * Essa variavel ela tem que ser declarada por algum tipo, pois java é fortemente tipada
		 * "Ou seja, em tempo de codificação indicamos qual o tipo de dados aquela variavel vai armazenar"
		 *
		 * @Declaração:
		 * Tipo nomeDaVariavel = valor a ser armazenado;
		 *
		 * @PossiveisNomesDeVariaveis: So podem conter letras e numeros, mas não pode começar com números,
		 * mas podemos começar com "_". Não é recomendado/podemos adicionar acentos.
		 *
		 * @Conversões_usadas_para_declarações_de_nomes:
		 *
 		 * @camelCase = letra minúscula no início, depois palavras com maiúsculas
		 * Usado para:
		 * 		- variáveis
		 * 		- parâmetros
		 * 		- métodos
		 * ex:	String nomeCompleto;
		 *
		 * @PascalCase (ou UpperCamelCase) — cada palavra começa com letra maiúscula
		 * Usado para:
		 * 		- nomes de classes
		 * 		- nomes de interfaces
		 * 		- nomes de enums
		 * ex:	public class ClienteService { ... }
		 *
		 * @UPPER_CASE (com underscores _)
		 * Usado para:
		 * 		- constantes
		 * 		- valores estáticos finais (static final)
		 * ex:  public static final double PI = 3.14159;
		 * 		private static final String NOME_ARQUIVO_LOG = "log.txt";
		 *
		 * @Nomes_de_arquivos_Java O nome do arquivo .java deve ser exatamente
		 * igual ao nome da classe pública que ele contém.
		 */
		
		
		final int naoPodeSerMudado = 100;  // Ao Usar a palavra final transforma a variavel em uma constante, não podemos alterar o seu valor
		//nãoPodeSerMudado = 2; //Erro...
		
		
		int numero; // Podemos declarar uma variavel assim "não inicializada", porem so pode ser usada após inicializar ela com um valor
		
		numero = 1; // inicializando ela posteriormente.
		System.out.println(numero);
		
		/**
		 * @Tipos_de_Dados existe 4 categorias de tipos de dados
		 *
		 * Ao Usar letras maiusculas pegaremos a classe do tipo de dados ex: Integer, Long, Short etc..
		 * @Inteiros
		 * 		Na ordem de tamanho:
		 *
		 * 		byte v1 = 60;		Valor Padrão: 0		(Suporta até 8bites)
		 * 		short v2 = 60;		Valor Padrão: 0		(Suporta até 16bites)
		 * 		int v3 = 50;		Valor Padrão: 0		(Suporta até 32bites)
		 * 		long v4 = -8;		Valor Padrão: 0L	(Suporta até 64bites)
		 *
		 * Cada um tem um valor maximo que cada um pode suportar.
		 * */
		
		System.out.println("Identification os valores maximo e minimos dos tipos:");
		System.out.println("byte: " +  Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);       // -128 a 127
		System.out.println("short: " +  Short.MIN_VALUE + " a " + Short.MAX_VALUE);    // -32768 a 32767
		System.out.println("int: " +  Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);  // -2147483648 a 2147483647
		System.out.println("long: " +  Long.MIN_VALUE + " a " + Long.MAX_VALUE);       // -9223372036854775808 a 9223372036854775807
		
		
		/**
		 * @Pontoflutuante numeros com parte fracionada ou com parte decimal
		 * 		Na ordem de tamanho:
		 *
		 * 		float f1 = 54.84f;		Valor Padrão: 0.0f		(Suporta até 32bites)
		 * 		double d1 = 54.43;		Valor Padrão: 0			(Suporta até 64bites)
		 *
		 * Cada um tem um valor maximo que cada um pode suportar.
		 * */
		
		
		float f1 = 54.84f;   // Precisamos adicionar o 'f' para indicar que é float
		double d1 = 54.43;
		
		
		System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);        //1.4E-45 a 3.4028235E38
		System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);  //4.9E-324 a 1.7976931348623157E308
		
		
		/**
		 * @Caracteres armazena um unico character ‘unicode’
		 * sempre com aspas simples '';
		 * 		char c1 = 'a';			Valor Padrão:\u0000		(Suporta até 16bites)
		 * */
		
		char letra = 'A';
		char letraAcentuada = '\u00DA'; //Ú
		
		System.out.println(letra);
		System.out.println(letraAcentuada);
		
		
		/**
		 * @Logicos valores binarios (True/false) ou (0/1)
		 * normalmente usados em estrutusa condicionais
		 *
		 * 		boolean c1 = true;			Valor Padrão:false
		 * */
		
		boolean concederDesconto = true;
		
		System.out.println("Vai conceder desconto ? " + concederDesconto);
		
		
		
		
		// Exemplo prático
		
		int v1 = 100;
		int v2 = v1; 	// -> recebeu a referencia do valor de v1 uma copia, em lugares diferente da memoria;
		v1 = 200;
		
		System.out.println(v1); // return 200
		System.out.println(v2); // return 100
		
		// Isso acontece porque atribuição de valores primitivos ocorrem por valor e não por referência
	}
	
	
	
	
	
}