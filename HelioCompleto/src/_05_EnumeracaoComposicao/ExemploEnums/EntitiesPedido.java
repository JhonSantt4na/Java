package _05_EnumeracaoComposicao.ExemploEnums;

import java.util.Date;

public class EntitiesPedido {
	private Integer id;
	private Date moment;
	private EnumsExemplo status;
	
	public String toString() {
		return "EntitiesPedido{" +
			"id=" + id +
			", moment=" + moment +
			", status=" + status +
			'}';
	}
	
	public EntitiesPedido() {
	}
	
	public EntitiesPedido(Integer id, Date moment, EnumsExemplo status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public EnumsExemplo getStatus() {
		return status;
	}
	
	public void setStatus(EnumsExemplo status) {
		this.status = status;
	}
}
