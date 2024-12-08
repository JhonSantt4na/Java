package _11_1_ProgramacaoFuncional.Streams.Exercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class app {
	// Fazer um programa para ler os dados (nome, email e salário)
	// de funcionários a partir de um arquivo em formato .csv.
	
	// Em seguida mostrar, em ordem alfabética, o email dos
	// funcionários cujo salário seja superior a um dado valor
	// fornecido pelo usuário.
	// Mostrar também a soma dos salários dos funcionários cujo
	// nome começa com a letra 'M'.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null){
				String[] fields = line.split(",");
				list.add(new Employee (fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salaryBase = sc.nextDouble();
			
			// Processamento
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> name = list.stream()
				.filter(s -> s.getSalary() > salaryBase)
				.map(e -> e.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
			
			name.forEach(System.out :: println);
			double sum = list.stream()
				.filter(x -> x.getName().charAt(0) == 'M')
				.map(x -> x.getSalary())
				.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M':  " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
