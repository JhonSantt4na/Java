package Heranca;

import Heranca.UpcastingDowncasting.SavingsAccount;

public class ClassesFinal {
	// Quando ultilizamos a palavra final na:
	/*
	Classe : Evita que seja herdada
	Usaremos da seguinte forma >>
	public final class SavingsAccount extends Account
	Sendo assim a classe SavingsAccount não podera mais ser herda por nenhuma outra classe
	
	Método : Evita que ele seja Sobreposto
	se usaremos o final no metodo ex:
	public final void withdraw(double amount)
	Ou seja o metodo não podera ser sobreposto
	*/
	
	public class SavingsAccountPlus extends SavingsAccount{
		@Override
		public void withdraw(double amount){
			balance -= amount ;
		}
	}
}
