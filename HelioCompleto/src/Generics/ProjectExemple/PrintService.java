package Generics.ProjectExemple;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	// <T> pode ser qualuqer tipo
	
	private  List<T> list = new ArrayList<>();
	
	/*public  void addValue(Integer value){
		list.add(value);
	}
	
	public Integer first(){
		if (list.isEmpty()){
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print(){
		System.out.print("[ ");
		if (!list.isEmpty()){
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(" , " + list.get(i));
		}
		System.out.println(" ]");
	}*/
	// usando o object = o programa aceita qualquer tipo pq tudo no java é object
	// type safety = se quisermos guarda o valor em uma variavel, não vamos conseguir
	// pois o object teremos que fazer um casting para o tipo da variavel
	// com isso temos a insegurança de tipos = chamado de type safety
	// alem da performace por criar alguns castings fazendo boxing e unboxing.
	
	//A Melhor solução é usar o Generic pois assim podemos garantir o tape safety e reuso
	
	
	public  void addValue(T value){
		list.add(value);
	}
	
	public T first(){
		if (list.isEmpty()){
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print(){
		System.out.print("[ ");
		if (!list.isEmpty()){
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(" , " + list.get(i));
		}
		System.out.println(" ]");
	}
	
}
