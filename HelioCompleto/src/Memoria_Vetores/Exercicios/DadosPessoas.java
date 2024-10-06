package Memoria_Vetores.Exercicios;

import Memoria_Vetores.Entidades.DadosP;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int qty = sc.nextInt();
    sc.nextLine();  // Consumir a quebra de linha

    // Criar um array de objetos DadosP
    DadosP[] persona = new DadosP[qty];

    // Loop para receber os dados de cada pessoa
    for (int i = 0; i < persona.length; i++) {
      System.out.printf("Altura da %da pessoa: ", i + 1);
      double altura = sc.nextDouble();
      System.out.printf("Gênero da %da pessoa (M/F): ", i + 1);
      char genero = sc.next().toUpperCase().charAt(0);  // Forçar para maiúsculo

      // Armazenar os dados no array
      persona[i] = new DadosP(altura, genero);
    }

    // Inicializar variáveis para os cálculos
    double menorAltura = persona[0].getAltura();
    double maiorAltura = persona[0].getAltura();
    int numHomens = 0;
    double somaAlturaMulheres = 0.0;
    int numMulheres = 0;

    // Loop para calcular maior/menor altura, número de homens e soma da altura das mulheres
    for (int i = 0; i < persona.length; i++) {
      // Verificar maior e menor altura
      if (persona[i].getAltura() > maiorAltura) {
        maiorAltura = persona[i].getAltura();
      }
      if (persona[i].getAltura() < menorAltura) {
        menorAltura = persona[i].getAltura();
      }

      // Contar homens e acumular altura das mulheres
      if (persona[i].getGenero() == 'M') {
        numHomens++;
      } else if (persona[i].getGenero() == 'F') {
        somaAlturaMulheres += persona[i].getAltura();
        numMulheres++;
      }
    }

    // Calcular a média de altura das mulheres (se houver alguma mulher)
    double mediaAlturaMulheres = (numMulheres > 0) ? somaAlturaMulheres / numMulheres : 0.0;

    // Exibir os resultados
    System.out.printf("Menor altura = %.2f%n", menorAltura);
    System.out.printf("Maior altura = %.2f%n", maiorAltura);
    if (numMulheres > 0) {
      System.out.printf("Média de altura das mulheres = %.2f%n", mediaAlturaMulheres);
    } else {
      System.out.println("Não há mulheres no grupo.");
    }
    System.out.println("Número de homens = " + numHomens);

    sc.close();
  }
}
