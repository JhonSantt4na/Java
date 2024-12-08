package _03_Memoria_Vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
  public static void main(String[] args) {
     // Declaração  de uma lista de Inteiro
    //List<Integer> list; // List<int> list; Erro

    // Vamos instanciar o nossa lista
    List<String> list = new ArrayList<>();
    //List<Integer> list = new ArrayList<Integer>(); Valor dentro do arraylist<é opcional>

    // Adicionando na lista
    list.add("Maria");
    list.add("Joao");
    list.add("Souza");

    // Adicionando na pos 2
    // Usamos a sobrecarga com a pos e dpois o elemento
    list.add(2, "Marcos");

    // Tamanho da list
    System.out.println(list.size());

    //remover item
    list.remove("Joao"); // Nesse exmplo vai compara os itens da lista com
    // essa nova String se tiver igual remove.
    //list.removeFirst(); // removemos o primeiro
    //list.removeLast(); // removemos o ultimo

    // Remoção com predicado
    //list.removeIf(x -> x.charAt(0) == 'M');   // Remove quem comerça com M
    // Predicado algo que retorna v ou f
    // Posição de um elemento
    System.out.println("Index of Souza: "+ list.indexOf("Souza")); // Quando n acha retorna -1
    list.getFirst(); // Pega o primeiro
    list.getLast(); // Pega o ultimo
    list.addFirst("Bob"); // adicionar primeiro
    list.addLast("Maicon");// adicionar ultimo
    //list.clear();Limpa a lista
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); // Pegar quem tiver somente essa letra
    // converte pra strem
    // strem aceita operações lambda
    // faz a operação lambda
    // volta ele paara list

    System.out.println("+================+");
    System.out.println(result);

    // Pegar o primeiro elemento com letra x
    System.out.println("+================+");
    String name = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
    // vai pegar o primeiro item da list que atenda ao predicado
    // findFirst retorna um objt usamos o orElse(null) se não existir retorna null
    System.out.println(name);
    System.out.println("+================+");

    for(String x : list){ // int ou integer funciona aqui
      System.out.println(x);

    }
  }
}
