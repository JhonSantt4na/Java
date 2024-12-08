package _10_2_HashCodeEquals;

import java.util.Objects;

public class HashCodeEqualPersonalizados {
	public static class  Client {
		private String name;
		private String email;
		
		// Precisamos criar uma implementação do Equals e HashCode
		// construtor aut
		
		// Sabendo que existe varias implementações:
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Client client = (Client) o;
			return Objects.equals(name, client.name);
		}
		
		@Override
		public int hashCode() {
			return Objects.hashCode(name);
		}
		
		// Constructor
		public Client(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
	}
	
	public static void main(String[] args) {
		Client c1 = new Client("Jhon", "John@html.c");
		Client c2 = new Client("Maria", "Maria@html.c");
		
		Client c3 = new Client("Jhon", "Jhon@html.c");
		
		System.out.println(c1.hashCode()); // 2308029
		System.out.println(c2.hashCode()); // 74113750
		
		// Igual o primeiro
		System.out.println(c3.hashCode()); // 2308029
		
		// Comparando c1 com c2
		System.out.println(c1.equals(c2)); // false
		
		// Comparando c1 com c3
		System.out.println(c1.equals(c3)); // true
		
		// porem o nome não é um cliterio bom pois pode ter pessoas
		// com nomes iguais. normalmente precisamos ver bem qual sera o cliterio de comparação
		
		System.out.println(c1 == c3); // false
		// pq o  " == " ele compara as referencias de memorias
		//  cmo são alocados no reap 2 objts diferentes o " == "
		// consta como falso
		
		// Para comparar a referencia usamos o : ==
		// Para comparar o conteudo usamos o :  equals
		
		// porem o compilador dara um tratamento especial a instanciação
		// de formas literais exemplo:
		
		String s1 = "Maria";
		String s2 = "Maria";
		System.out.println(s1 == s2); // return true
		
		// pois não foi instanciado nenhum obj agr se for assim :
		// String s1 = new String("Maria");
		// Ai sim sera diferentes
	 
		
		
		
	}
	
}
