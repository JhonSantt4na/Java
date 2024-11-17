package HashCodeEquals;

public class HashCode {
	// Metodo que retorna um numero inteiro representando um codigo
	// gerado a partir das informações do objeto
	public static void main(String[] args) {
		String a = "Maria";
		String b = "João";
		
		// return um numero inteiro gerado aleatoriamente porem unico para essa string
		System.out.println(a.hashCode());  //545646
		System.out.println(b.hashCode());  //787945
		
		// Caso seja a mesma string gerara o mesmo codigo
		
		//obs : como o numero inteiro é limitado, pode acontecer de gerar o mesmo codigo para
		// strings diferentes. muito dificil de acontecer
		
		// Regra de Ouro do HashCode :
		// Se o hashCode de dois obj for diferente, entao os dois obj são dif ou tem alguma coisa errada
		
		// Isso nunca acontece: o mesmo obj gera codigos diff
		// "Jhonn" Gera 121545
		// "Jhonn" Gera 456465
		
		// se o codigo de dois objt for igual, muito provavelmente os obj são iguais
		// porem " Pode Haver Colisão "
	
	}
}
