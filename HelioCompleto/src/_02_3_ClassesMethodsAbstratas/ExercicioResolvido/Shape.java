package _02_3_ClassesMethodsAbstratas.ExercicioResolvido;

public abstract class Shape {
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract double area();
	// com o metodo é obrigado a classe ser abstract
}
