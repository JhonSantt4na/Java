package EnumeracaoComposicao.PedidosSumario;

import EnumeracaoComposicao.PedidosSumario.entities.Client;
import EnumeracaoComposicao.PedidosSumario.entities.Order;
import EnumeracaoComposicao.PedidosSumario.entities.enums.OrderStatus;

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
	
		System.out.println("Enter cliente data: ");
		
		System.out.print("Name: ");
		String name  = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		
		//Cliente
		Client client = new Client(name, email, sdf.parse(birthDate));
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.next();
		OrderStatus sts = OrderStatus.valueOf(status);
		
		
		System.out.print("How many items to this order?");
		int qtyItems = sc.nextInt();
		for (int i = 0; i < qtyItems; i++) {
			System.out.printf("Enter #%d item data: %n", i + 1);
			sc.nextLine();
			
			System.out.print("Product name: ");
			String nameItem = sc.nextLine();
			
			System.out.print("Product price: R$ ");
			double priceItem = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Quantity: ");
			int qtyItem = sc.nextInt();
			
			Date moment = new Date();
			Order order = new Order(moment, sts);
		}
		
		sc.close();
	}
}
