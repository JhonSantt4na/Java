package SetMap.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		// Com essa comparação ele retorna que não existe pois o Map
		// Para comparar elementos e chave ele usa o ponteiro de referencia
		// Ai no caso teremos que implementar o HashCode Equals
		// e com isso mesmo sendo outra instancia ele compara
	}
}
