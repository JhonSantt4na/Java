package Interfaces;

public class Intro {
	/*
	* jav 8+ pode tem default methods ou defender methods
	* isso possui implicação conceituais e praticas
	* */
	
	/*
	*  Interface é um tipo que define um conjunto de operações que
	* uma classe deve implementar
	* sendo assim ela estabelece um contrato que a classe deve cumpri
	* */
	public static void main(String[] args) {
		
		// Como se fosse uma classe abstrata, que so contem metodos
		// somente abstrato mais ou menos isso.
		//  ex:  uma figura circulo tem que cumpri o contrato
		interface Shape {
			double area();
			double perimeter();
		}
		
		/*
		* Pra que interfaces ??
		* Para criar sistemas com baixo acoplamento e flexiveis
		* */
		
	}
	
}
