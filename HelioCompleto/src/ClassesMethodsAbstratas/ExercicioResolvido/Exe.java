package ClassesMethodsAbstratas.ExercicioResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int qty = sc.nextInt();
		
		for (int i = 1; i <= qty; i++) {
			System.out.println("Shape #"+i+" data: ");
			System.out.print("Retangle or Circle (r/c)? ");
			char sh = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (sh == 'r'){
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				// Metodo1 de instanciar antes
				Shape retangle = new Rectangle(color,width, height);
				list.add(retangle);
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				// Metodo2 de instanciar na hra da adição
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape shape: list){
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}
