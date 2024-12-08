package _05_EnumeracaoComposicao.DepartamentExe1.entidades;

import _05_EnumeracaoComposicao.DepartamentExe1.newEnum.EnumNovo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhos {
	private String name;
	private EnumNovo leVel;
	private Double salarioBase;
	
	// Associações
	private Department department;
	List<ContratoHora> conTratos = new ArrayList<>(); // " Iniciando Null ou Vazio "
	
	public Trabalhos(){
	}
	
	// Nunca Criar Construtor com Listas. Inicia Vazia e adiciona itens com metodos
	public Trabalhos(String name, EnumNovo leVel, Double salarioBase, Department department) {
		this.name = name;
		this.leVel = leVel;
		this.salarioBase = salarioBase;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EnumNovo getLeVel() {
		return leVel;
	}
	
	public void setLeVel(EnumNovo leVel) {
		this.leVel = leVel;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<ContratoHora> getConTratos() {
		return conTratos;
	}
	// Remover o Setter responsavel por mudar a List.
	
	// Metodos responsavel por fazer a associação do contrato
	public void adicionandoContratos (ContratoHora conTrato){
		conTratos.add(conTrato);
	}
	
	public void removendoContratos (ContratoHora conTrato){
		conTratos.remove(conTrato);
	}
	
	public double resul(int year, int month){
		double somaa = salarioBase;
		
		// Criando um calendario : Garda a data;
		Calendar calle = Calendar.getInstance();
		
		for(ContratoHora c : conTratos){
			calle.setTime(c.getDataa());
			int c_yearr = calle.get(Calendar.YEAR);
			int c_monthh = 1 + calle.get(Calendar.MONTH);
			
			if(year == c_yearr && month == c_monthh){
				somaa += c.totalValue();
			}
		}
		return somaa;
	}
}
