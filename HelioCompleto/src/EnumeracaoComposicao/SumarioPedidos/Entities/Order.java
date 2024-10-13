package EnumeracaoComposicao.SumarioPedidos.Entities;

import EnumeracaoComposicao.StringBuilder.enttd.Comentarios;
import EnumeracaoComposicao.SumarioPedidos.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	//Associations
	List<OrderItem> items = new ArrayList<>();
	Client client = new Client();
	// Contructors
	
	public Order() {
	}
	// Not add List in Constructors
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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
	
	public List<OrderItem> getItems() {
		return items;
	}
	// remove setter List
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	// Methods
	public void addItem(OrderItem item){
		items.add(item);
	}
	
	public void removeItem(OrderItem item){
		items.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		for (OrderItem oi : items) {
			soma += oi.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("ORDER SUMARIO \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + getStatus() + "\n");
		sb.append("Client: " + getClient().getName() + " (" + sdf1.format(getClient().getBirthDate()) +")" +
			" - " + getClient().getEmail() + "\n");
		sb.append("Order Items: \n");
		for (OrderItem oItem: items) {
			sb.append(oItem.product.getName() + ", " +
				"$" + oItem.getPrice() + ", " + "Quantity: " + oItem.getQuantity() +
				" Subtotal: " + oItem.subTotal() + "\n");
		}
		sb.append("Total: " + total());
		return sb.toString();
	}
}
