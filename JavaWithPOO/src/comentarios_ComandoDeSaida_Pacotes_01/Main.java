package comentarios_ComandoDeSaida_Pacotes_01;

import comentarios_ComandoDeSaida_Pacotes_01.curso.Aluno;

public class Main {
	public static void main(String[] args) {
		/* Comentario em Bloco
		* Java é uma linguagem interativa ou seja execulta linha a linha na ordem que colocamos
		* cada instrução termina com o ;
		*
		* System.out.println() = Imprime na tela + Pula linha      obs:'Imprime o que esta nos parentese'
		* System.out.println() = Imprime na tela
		//System.out.println(      "Hello and welcome!"    );      obs: Ao Adicionar espaços ele ignora
		* System.out.println("      Hello and welcome!     ");     obs: Ao menos que esteja dentro das aspas
		* */
		
		/**
		 * Java Doc Comentario - Muito usado para documentações
		 * Sempre transforma comentarios em documentos
		 *
		 * @author → nome do autor.
		 * @version → versão da classe.
		 * @since → versão do software ou data em que foi criado.
		 * @see → referência a outra classe ou metodo relacionado.
		 *
		 * @param nomeParâmetro → descreve cada parâmetro.
		 * @return → descreve o valor retornado.*
		 * @throws ou @exception → descreve exceções lançadas.
		 * */
		
		// Este e outro metodo de comentario
		System.out.println("Hello, World!");
		
		/**
		 * Hierarquia de Diretorios - So podemos ter o mesmo nome de classe se for em diretorios diferentes
		 * */
		
		//Usando os Dois metodos com mesmo nome, Ja que java nao suporta elias "Apelidos" para importações.
		
		Aluno a1 = new Aluno();
		a1.matricular();
		
		comentarios_ComandoDeSaida_Pacotes_01.escola.Aluno a2 = new comentarios_ComandoDeSaida_Pacotes_01.escola.Aluno();
		a2.matricular();
	
	}
}