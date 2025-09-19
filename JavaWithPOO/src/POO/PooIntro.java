package POO;

public class PooIntro {
	/**
	 * @Poo_ProgramaçãoOrientadaAObjetos: é um paradigma de programação que procura solucionar um problema
	 * atraves de uma coleção de objetos que colaboram entre si que trocando mensagens uns com os outros
	 *
	 * - Indicado Para resolver problemas complexos que envolve varios tipos de entidades, eventos e interações
	 * - facilita a criação de programas mais extensos;
	 *
	 * - Procedural solucionou parte de duplicação de codigos com procedimentos ou rotinas (Trechos de cod que podem ser chamados e execultados repetivamente)
	 * - Fundamentos da POO :
	 * 		@Encapsulamento
	 * 		por exemplo um gato:
	 *
	 * 			Caracteristicas
	 *      			fome --
	 *      			humor --
	 *      		    energia --
	 * 	        	    miar --
	 * 	       	Ação
	 * 	       			colocar pra dormi --
	 * 	       		    brincar --
	 * 	       		    da comida --
	 *
	 *
	 *		Não podemos mander ele miar, nem media a fome dele, nem humor, nem energia
	 *		porem quando damos comida a fome abaixa, ou adicionamos ele pra dormir a energia sobe, isso altera o estado do gato.
	 *		ou seja uma ação externa alterou uma ação interna
	 *
	 *		ou seja, essas ações e characteristics que não podemos ter acesso, são chamadas de privada porem, os menbros publicos seriam tmb
	 *		da comida, colocar pra dormir.
	 *
	 *		caracteristicas de um objeto - atributos
	 * 		ações de um objeto - metodos
	 *		somente o objeto pode alterar a si proprio
	 *
	 *		@abstração
	 *			atributos
	 *				velocidade
	 *
	 *			ação
	 *				acelerar -- velocidade ++
	 *			 	frear --
	 *
	 *  	ou pissar no pedal de frear ou acelerar ele nao sabe o que se passa por tras do caro, por exemplo injetar a gasolina, ou acionar as velas etc
	 *  	todas as complexidades do objeto foi abstraido para metodos publicos de alto nivel por si so é suficiente para que o carro melhore os seus atributos.
	 *
	 *
	 * 		@Herança
	 *  	se diz a respeito de um tipo de objeto poder herdar as caracteristicas e comportamentos de outros tipos de objetos
	 *  fazendo uma analogia com a capacidade das entidades biologicas de herdar caracteristicas dos seus ancestrais
	 *
	 *	fiat economy : uno, palio, siena, fiorino
	 *  todos os modelos usam essa plataforma ou seja todos são os mesmos
	 *
	 *	ou seja uno, palio, siena são chamados de classes
	 * 		@Classe -> é um template de um objeto indentificando como o objeto deve ser
	 * 		@Objeto -> é a instancia da classe ou seja o proprio objeto que no exemplo seria o carro
	 *
	 *
	 * 		@Polimorfismo
	 * 		muitas formas, quando temos muitas classes relacionadas, ou seja realização de uma mesma ação com
	 * 		varias formas de realizar essa ação.
	 *
	 * 		vamos supor que temos uma classe
	 * 		animal principal com o metodo emitirSom
	 * 	 e ao mesmo tempo temos varias classes que herdam a classe animal que pega esse metodo herdado
	 *	cao no metodo emitirSom ele late
	 *	gato no metodo emitirSom ele mia
	 *	galinha no metodo emitirSom ele faz popopo
	 *  ou seja todos essas classes filhas que herdaram o metodo da classe pai, com o @Override ele sobrescreve o metodo principal
	 *
	 *  e quando agente for criar um animal podemos usar qualquer uma dessas formas. um mesmo comando com varias formas diferente
	 * */
	 
}
