package Interfaces.HerancaMultipla.entities;

import Interfaces.HerancaMultipla.interfaces.Printer;

public class ConcreatPrinter extends Device implements Printer {
	public ConcreatPrinter(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("ConcreatPrinter processing: " + doc);
	}
	@Override
	public void print(String doc){
		System.out.println("Printing: " + doc);
	}
}
