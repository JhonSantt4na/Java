package _09_Interfaces.InterfaceComparable.Problema02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem02 {
	public static void main(String[] args) {
		
		List<Employer> list = new ArrayList<>();
		// Caminho
		String path = "/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Interfaces/InterfaceComparable/Problema02/funcionarios.csv";
		// Leitura do Arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Lendo uma linha do arquivo
			String employerCsv = br.readLine();
			// Enquanto for diferente de null vamos adicionar na lista e pular uma linha
			while (employerCsv != null) {
				// Criando um vetor que separa o nome e o arquivo
				String[] filds = employerCsv.split(",");
				// Pegando o nome e o Salario
				String name = filds[0];
				double salary = Double.parseDouble(filds[1]);
				// adicionando o obj no vector + Pulando linha
				list.add(new Employer( name, salary));
				employerCsv  = br.readLine();
			}
			// Porem o collection so pode usar se for do tipo comparable
			// implementado uma interface comparable implements o comparable
			Collections.sort(list);
			// Percorer a lista exibindo tudo dela
			
			for (Employer emp  : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			// Capturando alguma exeption coso tenha
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
