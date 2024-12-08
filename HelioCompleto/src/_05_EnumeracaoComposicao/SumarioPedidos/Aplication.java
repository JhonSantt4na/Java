package _05_EnumeracaoComposicao.SumarioPedidos;

import _05_EnumeracaoComposicao.SumarioPedidos.Entities.Client;
import _05_EnumeracaoComposicao.SumarioPedidos.Entities.Order;
import _05_EnumeracaoComposicao.SumarioPedidos.Entities.OrderItem;
import _05_EnumeracaoComposicao.SumarioPedidos.Entities.Product;
import _05_EnumeracaoComposicao.SumarioPedidos.Enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Cliente Data: ");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDateCliente = sdf.parse(sc.next());
		sc.nextLine();
		// Instanciando o Cliente
		Client newClient = new Client(nameClient, emailClient, birthDateCliente);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String statusOrder = sc.nextLine();
		
		// Composição
		Date moment= new Date();
		Order order = new Order(moment, OrderStatus.valueOf(statusOrder), newClient );
		
		System.out.print("How many items to this order ? ");
		int qtyOrder = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtyOrder; i++) {
			System.out.printf("Enter #%d item data: %n", i + 1);
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Quantity: ");
			int qtyProduct = sc.nextInt();
			
			Product product = new Product(nameProduct, priceProduct);
			OrderItem item = new OrderItem(qtyProduct, priceProduct,product);
			order.addItem(item);
			sc.nextLine();
		}
		System.out.println(order.toString());
		sc.close();
	}
}
