package Interfaces.InterfaceComparable.Problema02;

// Implementa o Comparable<Classe> para o funcionamento do Colection.sort
// Precisamos implementar o methodo compareTo na nossa classe empolyer
// sendo q o  methodo serve para comparar um obj com outro
// CompareTo serve como um contrato mostranco como vamos comparar os nosso objetos

public class Employer implements Comparable<Employer> {
	private  String  name;
	private Double salary;
	
	public Employer(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	// Retorn int pos as letras são 0 ate o final do alfabeto sendo 0 os obj sao iguais
	public int compareTo(Employer other) {
		//return name.compareTo(other.getName());
		
		// Caso Queria comparar com o salario usamo o seguinte:
		//return salary.compareTo(other.getSalary());
		
		// em caso de ordem decressente :
		return -salary.compareTo(other.getSalary());
	}
}
