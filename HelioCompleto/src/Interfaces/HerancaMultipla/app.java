package Interfaces.HerancaMultipla;

import Interfaces.HerancaMultipla.entities.ConcreatScanner;
import Interfaces.HerancaMultipla.entities.ConcreatPrinter;

public class app {
	public static void main(String[] args) {
		ConcreatPrinter p = new ConcreatPrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreatScanner s = new ConcreatScanner("2023");
		s.processDoc("My Email");
		System.out.println("Scan Result : " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2024");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
