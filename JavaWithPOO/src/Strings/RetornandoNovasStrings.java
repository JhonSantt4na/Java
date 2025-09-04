package Strings;

public class RetornandoNovasStrings {
	
	/**
	 * == : Compara as referências não o conteudo de memória
	 *
	 * Equals() = Usar sempre que for comparar valores, conteudo
	 * ele está disponivel para qualquer objeto do tipo string.
	 * equalsIgnoreCase() = Não diferencia maiúsculas e minuscules
	 *
	 *
	 * */
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "abc";
		String s3 = "ABD";
		String s4 = new String("ABC");
		
		//Comparando Conteudo do s1 e s2
		System.out.println(s1.equals(s2)); //False
		System.out.println(s2.equals(s1)); //False
		
		//Comparando Conteudo Ignorando Maiúsculas e minuscules do s1 e s2
		System.out.println(s1.equalsIgnoreCase(s2)); //True
		System.out.println(s2.equalsIgnoreCase(s1)); //True
		
		//Comparando Conteudo do s1 e s3
		System.out.println(s1.equals(s3)); //False
		System.out.println(s3.equals(s1)); //False
		
		//Comparando Conteudo do s1 e s4 e com IgnoreCase
		System.out.println(s1.equals(s4));           //True
		System.out.println(s4.equalsIgnoreCase(s1)); //True
		
		/**
		 * compareTo() = tambem muito usado para fazer comparações de tipo string
		 * usa comparação lexicográfica e retorna -X, 0, X,
		 * ou seja, comparação conforme a ordem alfabética
		 * - Usa a Tabela ASCII de character para comparar esses valores
		 * - compareToIgnoreCase() : Não difere maiúsculas e minúsculas
		 * */
		
		// se for igual ele retorna 0
		String s7 = "ABC";
		String s8 = "ABC";
		System.out.println(s7.compareTo(s8));  // return 0
		
		// 'A C B' comparado a 'A B C' ele compara os primeiros diferentes no caso C com o B já que as primeiras são iguais
		String s9 = "ACB";
		System.out.println(s9.compareTo(s8));  // return 1
		
		// 'A B C' comparado a 'A B C D E' ele compara a qtd de characters retorno será +2
		String s10 = "ABCDE";
		System.out.println(s10.compareTo(s8)); // return 2
		
		
		/**
		 * Métodos para manipulação de String
		 *
		 * - Métodos que retornam um novo objeto do tipo String
		 * @.concat() -> Concatena uma nova string no final da string atual
		 * @.replace()_.replaceAll() -> Substitui uma sub string por outra sub string
		 * @.toLowerCase() -> retorna todas as letras em minuscules
		 * @.toUpperCase() -> retorna todas as letras em maiúsculas
		 * */
		
		String p1 = "POO com Java ";
		System.out.println(p1.concat("no Intellij")); //Alteração so valida aq porque não adicionei na variable
		
		String p2 = p1.replace("Java", "Python");
		System.out.println(p2);
		
		System.out.println(p1.toLowerCase());
		System.out.println(p1.toUpperCase());
		
		/**
		 * @.trim() -> remove os espaços vazio das laterais
		 * @.split()_and_.trim() -> divide a string em outras ‘strings’ considerando um divisor qualquer
		 * @.charAt() -> Retorna um character na posição escolhida
		 * @substring() -> Retorna parte de uma String
		 * @String.valueOf(object) -> Metodo Static da classe String que converte qualquer objeto para tipo string com o metodo to String no objeto
		 * */
		
		// .trim()
		String s22 = "   POO com Java    ";
		System.out.println(s22.trim());
		
		// .split e trim()
		String[] ps = s22.trim().split(" "); // Separando por espaço vazio
		System.out.println(ps[0] + ps[1] + ps[2]); //"{ POO, com, Java}"
		
		// .charAt()
		char c1 = s22.trim().charAt(0);   // Retorna o P
		System.out.println(c1);
		
		// .substring(pos inicial, pos final)
		System.out.println(s22.trim().substring(0,3));  // Retorna POO
		
		// @String.valueOf(object)
		int num = 12;
		System.out.println(String.valueOf(num));
	}
}
