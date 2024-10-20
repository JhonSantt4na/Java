package HerancaPolimofismo.Exercicios.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> listProducts = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int qty = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qty; i++) {
			System.out.printf("Product #%d data: %n", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String data = sc.next();
				sc.nextLine();
				
				Product used = new UsedProduct(name, price, sdf.parse(data));
				listProducts.add(used);
			} else if (typeProduct == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				
				Product imported = new ImportedProduct(name, price, fee);
				listProducts.add(imported);
			} else {
				Product common = new Product(name, price);
				listProducts.add(common);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product pdct : listProducts) {
			System.out.println(pdct.priceTag());
		}
		
		sc.close();
	}
}
