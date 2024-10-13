package EnumeracaoComposicao.DepartamentExe1.entidades;

import java.util.Date;

public class ContratoHora {
	private Date dataa;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoHora() {
	}
	
	public ContratoHora(Date dataa, Double valorPorHora, Integer horas) {
		this.dataa = dataa;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	public Date getDataa() {
		return dataa;
	}
	
	public void setDataa(Date dataa) {
		this.dataa = dataa;
	}
	
	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Integer getHoras() {
		return horas;
	}
	
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	// Delegação : Proproi classe resolve os seus pipinos
	public double totalValue(){
		return valorPorHora * horas;
	}
}
