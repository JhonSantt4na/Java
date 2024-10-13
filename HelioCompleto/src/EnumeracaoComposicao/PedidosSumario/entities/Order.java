package EnumeracaoComposicao.PedidosSumario.entities;

import EnumeracaoComposicao.PedidosSumario.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	// Composição
	List<OrderItem> orderItemList = new ArrayList<>();
	
	// Constructor
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	// Getters && Setters
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	
	// Metodos
	public void addItem(OrderItem item){
		orderItemList.add(item);
	}
	
	public void removeItem(OrderItem item){
		orderItemList.remove(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY");
		sb.append("Order moment:" + getMoment());
		sb.append("Order Status : " + getStatus());
		sb.append("Client: " );
		sb.append("Order Items");
		
		
		return sb.toString();
	}
}
