package ProgramacaoFuncional.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class implementacaoStreams {
	// É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
	
	//Fonte de dados:
	// coleção, array, função de iteração, recurso de Entrada/Saida
	
	//Stream é uma solução para processar sequências de dados de forma:
	
	//• Declarativa (iteração interna: escondida do programador)
	//• Parallel-friendly (imutável -> thread safe) facilidade de usar paralelismo e concorencia com o uso de streams
	//• Sem efeitos colaterais
	//• Sob demanda (lazy evaluation) evolução tardia. Os dados so seram consumidos qunado for necessario
	
	//• Acesso sequencial (não há índices)
	//• Single-use: só pode ser "usada" uma vez ( usar mais de 1x gera execção )
	
	//• Pipeline
	// Linha de montagem: operações em streams retornam novas streams.
	// Então é possível criar uma cadeia de operações (fluxo de processamento).
	
	// Operações Agregadas intermediárias e terminais
	
	//• O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
	
	//• Operação intermediária:
		//• Produz uma nova streams (encadeamento)
		//• Só executa quando uma operação terminal é invocada (lazy evaluation)
	
	// Operações intermediárias
	//• filter, map, flatmap, peek, distinct, sorted, skip, limit (*) =
	
	// * short-circuit  = corta a operação quando a condição é satisfeita
	
	
	//• Operação terminal:
		//• Produz um objeto não-stream (coleção ou outro)
		//• Determina o fim do processamento da stream
	
	// Operações terminais
	//• forEach, forEachOrdered, toArray, reduce, collect, min, max ,count,
	// anyMatch (*), allMatch (*), noneMatch (*), findFirst (*), findAny (*)
	
	//com * são operações short-circuit
	
	// Criar uma stream
	
	//• Basta chamar o metodo stream() ou parallelStream() a partir
	//de qualquer objeto Collection.
	
	//• Outras formas de se criar uma stream incluem:
	//• Stream.of, Stream.ofNullable, Stream.iterate
	
	public static void main(String[] args) {
		// Criamos um array com elementos de Inteiros
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		// Criamos uma Stream apartir de uma coleção
		Stream<Integer> st0 = list.stream();
		
		// Usando o map para interar com os elementos
		Stream<Integer> st1 = list.stream().map(x -> x*10);
		
		// Exibindo na tela usamos o toArray
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Criando uma Stream de String
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Streams.of Usado para criar um Stream com items dentro
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Criando uma Stream usando a Função de iteração
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2 ); // Cria uma Stream com o elemento 0 e uma interação adicionando +2 pra sempre
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // Usamos o limit para limitar em 10 elementos e depois transformamos para array para ser exibido
		
		// Gerando Stream Sequencia de Fibbonaci
		Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L} , p -> new Long[] { p[1] ,  p[0] + p[1] } ).map(p -> p[0]);
		// Map para pegar cada par para a pos 0
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}
