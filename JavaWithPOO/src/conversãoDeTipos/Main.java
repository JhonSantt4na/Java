package conversãoDeTipos;

public class Main {
	public static void main(String[] args) {
		
		/**
		 * @Conversão_implicita :
		 *  internamente ele converte os tipos de acordo com alguns padrões;
		 *
		 * */
		
		// conversão implicit internamente int -> long
		int v1 = 50;
		long v2 = v1;
		System.out.println(v2);
		
		// Quando fazemos uma expressão com vários tipos inteiros
		// o resultado será por padrão do tipo do maior valor dos tipos inteiros
		// também ocorrendo conversão implicit
		byte v3 = 5;
		short v4 = 6;
		int v5 = 23423;
		long v6 = 231452345;
		
		long r1 = v3 + v4 + v5 + v6; // Por isso deve ser long
		System.out.println(r1);
		
		float f1 = 34.56f;
		double d1 = 567.234;
		
		double r2 = f1 * f1; // Nesse caso podemos usar double, pois como ele é de 64bits ele suporta o float que é de 32bits
		System.out.println(r2);
		
		double r3 = f1 + d1; // variable double por ser o que maior comporta valor
		System.out.println(r3);
		
		Double r4 = f1 + d1 + v6; // Entre os pontos flutuantes o double é o maior
		System.out.println(r4);
		
		
		/**
		 * @Conversão_explicitas :
		 *
		 *
		 * */
		
		float vFloat = 5.0f;
		double vDouble = 2.5d;
		byte vByte = 8;
		short vShort = 12;
		int vInt = 41;
		long vLong = 58465;
		
		// short r11 = vLong;	->	erro porque um long não cabe um short
		// Podemos força uma conversão sabendo que pode aver uma perda de dados por tentar armazenar esse valor em uma variavel que não caiba no seu tipo
		// se adicionar o valor que caiba no tipo desejado não teremos problemas de truncamento
		short r11 = (short)vLong;
		System.out.println(vLong);  //	return 58465
		System.out.println(r11); 	//	return -7071
		
		
	}
}