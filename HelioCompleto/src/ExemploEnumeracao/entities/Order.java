package ExemploEnumeracao.entities;

import EnumeracaoComposicao.ExemploEnumeracao.Enum.StatusOrder;

import java.util.Date;

public class Order {
  private Integer id;
  private Date moment;
  private StatusOrder statusOn ;
  
  // Constructros
  public Order(){
  }
  
  public Order(Integer id, Date moment, StatusOrder statusOn) {
	this.id = id;
	this.moment = moment;
	this.statusOn = statusOn;
  }
  
  @Override
  public String toString() {
	return "Order{" +
	  "id=" + id +
	  ", moment=" + moment +
	  ", statusOn=" + statusOn +
	  '}';
  }
  
  // Setters && Getters
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
  
  public StatusOrder getStatusOn() {
	return statusOn;
  }
  
  public void setStatusOn(StatusOrder statusOn) {
	this.statusOn = statusOn;
  }
}
