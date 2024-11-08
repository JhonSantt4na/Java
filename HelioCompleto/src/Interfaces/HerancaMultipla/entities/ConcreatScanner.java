package Interfaces.HerancaMultipla.entities;

import Interfaces.HerancaMultipla.interfaces.Scanner;

public class ConcreatScanner extends Device implements Scanner {
	public ConcreatScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("ConcreatScanner Processing:  " + doc);
	}
	
	@Override
	public String scan ( ){
		return "Scanning Content" ;
	}
}
