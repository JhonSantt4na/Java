package LogicaCondicional;

public class Main {
	public static void main(String[] args) {
		
		int v1 = 6;
		int v2 = 6;
		
		System.out.println(v1 + " > " + v2 + " :: " + (v1 > v2));
		System.out.println(v1 + " >= " + v2 + " :: " + (v1 >= v2));
		System.out.println(v1 + " < " + v2 + " :: " + (v1 < v2));
		System.out.println(v1 + " <= " + v2 + " :: " + (v1 <= v2));
		System.out.println(v1 + " == " + v2 + " :: " + (v1 == v2));
		System.out.println(v1 + " != " + v2 + " :: " + (v1 != v2));
		System.out.println();
		System.out.printf("%d >  %d :: %b%n", v1, v2, v1 > v2);
		System.out.printf("%d >= %d :: %b%n", v1, v2, v1 >= v2);
		System.out.printf("%d <  %d :: %b%n", v1, v2, v1 < v2);
		System.out.printf("%d <= %d :: %b%n", v1, v2, v1 <= v2);
		System.out.printf("%d == %d :: %b%n", v1, v2, v1 == v2);
		System.out.printf("%d != %d :: %b%n", v1, v2, v1 != v2);
		System.out.println();
		
		/**
		 * @Condição_Ternaria
		 * (Condição)? :
		 *
		 * */
		
		int v3 = 10;
		int v4 = 0;
		//int r = v3 / v4; // Erro de Divisão por 0
		int r = (v4 > 0) ? v3 / v4 : 0;
		System.out.format("Resultado: %d%n", r);
		
		
	}
}