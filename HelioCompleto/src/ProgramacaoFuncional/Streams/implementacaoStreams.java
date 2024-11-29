package ProgramacaoFuncional.Streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class implementacaoStreams {
	// É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
	
	//Fonte de dados:
	// coleção, array, função de iteração, recurso de Entrada/Saida
	
	//Stream é uma solução para processar sequências de dados de forma:
	
	//• Declarativa (iteração interna: escondida do programador)
	//• Parallel-friendly (imutável -> thread safe) facilidade de usar paralelismo e concorencia com streams
	//• Sem efeitos colaterais
	//• Sob demanda (lazy evaluation) evolução tardia.
	
	//• Acesso sequencial (não há índices)
	//• Single-use: só pode ser "usada" uma vez ( gera execção )
	
	//• Pipeline = Linha de montagem: operações em streams retornam novas streams.
	// Então é possível criar uma cadeia de operações (fluxo de processamento).
	
	// Operações intermediárias e terminais
	
	//• O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
	
	//• Operação intermediária:
		//• Produz uma nova streams (encadeamento)
		//• Só executa quando uma operação terminal é invocada (lazy evaluation)
	// Operações intermediárias
	//• filter
	//• map
	//• flatmap
	//• peek
	//• distinct
	//• sorted
	//• skip
	//• limit (*) =
	
	// * short-circuit pois corta a operação quando a condição é satisfeita
	
	
	//• Operação terminal:
		//• Produz um objeto não-stream (coleção ou outro)
		//• Determina o fim do processamento da stream
	// Operações terminais
	//• forEach
	//• forEachOrdered
	//• toArray
	//• reduce
	//• collect
	//• min
	//• max
	//• count
	//• anyMatch (*)
	//• allMatch (*)
	//• noneMatch (*)
	//• findFirst (*)
	//• findAny (*)
	//* short-circuit
	
	// Criar uma stream
	//• Basta chamar o metodo stream() ou parallelStream() a partir
	//de qualquer objeto Collection.
	//• Outras formas de se criar uma stream incluem:
	//• Stream.of
	//• Stream.ofNullable
	//• Stream.iterate
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}
