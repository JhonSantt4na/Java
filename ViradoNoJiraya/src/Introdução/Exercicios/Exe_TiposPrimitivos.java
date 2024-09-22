/*
 - Criar Variaveis para os Campos da Frase e imprimir a seguinte frase:
" Eu <nome>, morando no endereco <endereco>
confirmo que recebir o salario de <salario>, na data <data>.
*/
package Introdução.Exercicios;

public class Exe_TiposPrimitivos {
  public static void main(String[] args) {
    String name = "Jorge";
    String address = "Residencial";
    float salary = 3500.00f;
    String data = "20/09/2024";

    System.out.printf("I %s , Live in address : %s. %n", name, address);
    System.out.printf("I confirm that I have received the salary: R$ %.2f in data: %s.", salary,data);
  }
}
