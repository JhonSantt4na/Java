package _11_1_ProgramacaoFuncional.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipeline {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x->x *10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Somando todos os items da lista
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newlist = list.stream() // criando uma stream pela a list inicial
			.filter(x -> x%2 == 0) // Filtrou os numeros pares
			.map(x -> x * 10) // Multiplicou eles por 10
			.collect(Collectors.toList()); // Transformou uma coleção em lista novamente
		
		System.out.println(Arrays.toString(newlist.toArray()));
	}
}
