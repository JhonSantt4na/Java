package _11_1_ProgramacaoFuncional.CalculoLambda;

public class Intr {
	// Paradigmas de programação :
	//• Imperativo (C, Pascal, Fortran, Cobol)
	//• Orientado a objetos (C++, Object Pascal, Java (< 8), C# (< 3))
	//• Funcional (Haskell, Closure, Clean, Erlang)
	//• Lógico (Prolog)
	//• Multiparadigma (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
	
	// Paradigma funcional de programação
	//Baseado no formalismo matemático Cálculo Lambda (Church 1930)
	
	//Imperativa 					            										//                Funcional
						//Como se descreve algo a ser computado (*)
	// comandos ("como deve ser feitp" - imperativa)     // expressões ("o quê deve ser feito" - declarativa)
	
						//Funções possuem transparência referencial (ausência de efeitos colaterais)
						// Função que retorna os mesmo dados para tipos diferentes funções que depende de valor externo não tem transparencia referencial
	// fraco														// forte
	
						//Objetos imutáveis (*)
	// raro														// comum
	
						//Funções são objetos de primeira ordem
						// Passar uma função dentro do argumento de outra função no java usase o " :: "
	// não															// sim
	
						//Expressividade / código conciso
						// Chamando as Funções de primeira classes ou methodos que ajuda exemplo .reduce()
	// baixa														// alta
	
						//Tipagem dinâmica / inferência de tipos
						// Quando o compilador entende o tipo e não precisa colcocar
	// raro														// comum
	
	//O que são "expressões lambda"?
	//Em programação funcional, expressão lambda corresponde a uma
	//função anônima de primeira classe.
	
	// Exemplo: Função que não tem nome mas so mostra o que sera retornado
			//list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
	
	//Cálculo Lambda = formalismo matemático base da programação funcional
	//Expressão lambda = função anônima de primeira classe
}
