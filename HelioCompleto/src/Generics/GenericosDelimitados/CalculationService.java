package Generics.GenericosDelimitados;

import java.util.List;

public class CalculationService {
	// compareTo(max) temos que definir ele pra compareTo para resolver
	// vamos expecificar que o tipo t é do tipo Comparable. com isso o methodo
	// ira trabalhar com qualquer tipo t des de que esse item seja subclasse de qualuqer comparable
	
	// no caso para ser completo teriamos que adicioarmos o Super T ex::
	// public static <T extends Comparable< ? super T>> T max(List<T> list) {
	// Ou seja tipo comparavel t ou qualquer super classe t
	//no nosso exemplo posse ser o produto ou qualquer classe acima
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
