package Generics.TipoCuringaDelimitados.PrincípioGetPut;

import java.util.ArrayList;
import java.util.List;

public class Ex {
	//Vamos fazer um metodo que copia os elementos de uma lista para uma
	//outra lista que pode ser mais genérica que a primeira.
	
	//List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	//List<Double> myDoubles = Arrays.asList(3.14, 6.28);
	//List<Object> myObjs = new ArrayList<Object>();
	
	//copy(myInts, myObjs);
	//copy(myDoubles, myObjs);
	
	public static void main(String[] args) {
		// Princípio get/put - covariância
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		//list.add(20); // erro de compilacao não podemos alterar
		
		//get - OK
		//put - ERROR
		
		
		 // Princípio get/put - contravariância
		
		List<Object> myObjs = new ArrayList<Object>();
		
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs; // qualquer do tipo number ou objetos do supetipo de number
		myNums.add(10);
		myNums.add(3.14);
		
		//Number y = myNums.get(0); // erro de compilacao
		
		// get - ERROR
		// put - OK
	}
	}
