package _10_1_Generics.TipoCuringaDelimitados.Exemplo;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0,2.0));
		myShapes.add(new Circle(2.0));
		System.out.println("Total area: " + totalArea(myShapes));
		
		
		// Lista somente de circulos
		List<Circle> myCircles = new ArrayList<>();
		myShapes.add(new Circle(2.0));
		myShapes.add(new Circle(2.0));
		
		//System.out.println("Total Area Circulos: " + totalArea(myCircles));
		// Retornara um erro pois o nosso methodo so funciona com a classe Shape
		// e não com as subclasses dela a não ser que emplemente ela e todos as outras dela
		
		// Adicionando a implementção:
		// Substituimos isso :
		// public static double totalArea(List<Shape> list) {
		// public static double totalArea(List< ? extends Shape> list) {
		
		// Porem não vamos poder adicionar elementos na lista pois o interpretador
		// não sabe qual classe esta sendo usada
	}
	
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return  sum;
	}
	
	
	
}
