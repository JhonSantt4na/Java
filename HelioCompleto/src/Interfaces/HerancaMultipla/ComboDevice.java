package Interfaces.HerancaMultipla;

import Interfaces.HerancaMultipla.entities.Device;
import Interfaces.HerancaMultipla.interfaces.Printer;
import Interfaces.HerancaMultipla.interfaces.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Combo Printing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Combo scan result";
	}
	// Não existe a sintaxe que permita que a classe extenda mais de uma classe
	// Mas permite implementações de interfaces
	// porem como a interface não herda nada a seus filhos não tem heranca multipla
	
}
