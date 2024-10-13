package EnumeracaoComposicao.DepartamentExe1;

import EnumeracaoComposicao.DepartamentExe1.entidades.ContratoHora;
import EnumeracaoComposicao.DepartamentExe1.entidades.Department;
import EnumeracaoComposicao.DepartamentExe1.entidades.Trabalhos;
import EnumeracaoComposicao.DepartamentExe1.newEnum.EnumNovo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class app {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departamentoNome = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		
		System.out.print("Name: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelP = sc.nextLine();
		System.out.print("Salario Base: ");
		double salaBase = sc.nextDouble();
		
		// Instanciando o Trabalhador
		Trabalhos trabalho = new Trabalhos(trabalhadorNome, EnumNovo.valueOf(nivelP), salaBase, new Department(departamentoNome));
		
		System.out.print("How many contracts to this worker? ");
		int qtddContratos = sc.nextInt();
		
		for (int i = 0; i < qtddContratos; i++) {
			System.out.printf("Enter contract #%d data: %n", i + 1 );
			
			System.out.print("Date (DD/MM/YYYY):");
			String dataContrato = sc.next();
			System.out.print("Value per hour: ");
			double valorporHORA = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int horaaas = sc.nextInt();
		
			// Instanciando 01 Contrato
			ContratoHora contrato = new ContratoHora(dateFormat.parse(dataContrato), valorporHORA, horaaas);
			trabalho.adicionandoContratos(contrato); // Adicionado 1 contrato por vez na Lista de Contratos
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String mesEano = sc.next();
		
		// Separando Manualmente;
		int mes = Integer.parseInt(mesEano.substring(0,2)); // Recortando do inicio ate o indice 2
		int ano = Integer.parseInt(mesEano.substring(3)); // Recortando tudo do 3 pra o final
		
		System.out.println("Name: "+ trabalho.getName());
		System.out.println("Departament: "+ trabalho.getDepartment().getName());
		System.out.println("Salario de " + mesEano + ": " + String.format(Locale.US, "%.2f", trabalho.resul(ano, mes)));
		
		sc.close();
	}
}
