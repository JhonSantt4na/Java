package _03_Memoria_Vetores;

public class ForEach {
  public static void main(String[] args) {
    int[] vect = new int[] {10, 20, 30, 40};

    for (int numeros : vect) { // Percorre toda a coleção vect
      System.out.println(numeros); // numeros no ex são os elementos individual
    }
  }
}
