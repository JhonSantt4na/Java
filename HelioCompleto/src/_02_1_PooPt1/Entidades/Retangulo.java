package _02_1_PooPt1.Entidades;

public class Retangulo {
  public double width;
  public double height;

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return 2.0 * (width + height);
  }

  public double diagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
  }
}
