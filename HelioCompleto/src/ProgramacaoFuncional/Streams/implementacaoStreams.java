package ProgramacaoFuncional.Streams;

import java.sql.SQLOutput;

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
}
