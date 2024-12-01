package ProgramacaoFuncional.Streams.Exercicio01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class intro {
	// Fazer um programa para ler um conjunto de produtos a partir de um
	//arquivo em formato .csv (suponha que exista pelo menos um produto).
	//Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
	//nomes, em ordem decrescente, dos produtos que possuem preço
	//inferior ao preço médio.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader( new FileReader(path))){
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null){
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			// Processamento
			
			// Soma dos Preços + Media
			double avg = list.stream()
				.map(p -> p.getPrice()) // Pegando somente os preços
				.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Everage price : " + String.format("%.2f", avg));
			
			// Pegando os nomes com os produtos com preços abaixo da media, em ordem decressente
				// Comparator:
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> name = list.stream()  // Criamos uma lista de nomes
				.filter(p -> p.getPrice() < avg)  // Filtrando apenas os preços menor que a media
				.map(p -> p.getName()) // destes menor pegando os nome
				.sorted(comp.reversed()) // usando o sorted para ordenar e o seu methodo reversed para pegar em ordem decressente
				.collect(Collectors.toList()); // Transformando Collection em lista
			
			name.forEach(System.out :: println); // usando o forEach para interar pela lista de nomes executando o conssumer println
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
