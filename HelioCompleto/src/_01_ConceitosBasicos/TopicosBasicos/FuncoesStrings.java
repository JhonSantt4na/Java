package _01_ConceitosBasicos.TopicosBasicos;

public class FuncoesStrings {
  public static void main(String[] args) {

    String original = "abcd FGHIJ ABC abc DEFG   ";

    // Formatar: toLowerCase(), toUpperCase(), trim()
    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-"); // mantem a original mais apaga os espaços laterais

    // Recortar: substring(inicio), substring(inicio,fim)
    String s04 = original.substring(2);
    String s05 = original.substring(2,9);

    System.out.println("substring(ini): -" + s04 + "-");
    System.out.println("substring(ini fim): -" + s05 + "-");

    // Substituir: Replace(char, char), Replace(string, string)
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xyz");

    System.out.println("Replace(trocaChar): -" + s06 + "-");
    System.out.println("Replace(trocaString): -" + s07 + "-");

    // Buscar: indexOf, LastIndexOf
    int s08 = original.indexOf("bc");
    int s09 = original.lastIndexOf("bc");

    System.out.println("indexof(pos.primeiro): -" + s08 + "-");
    System.out.println("LastIndexof(pos.ultimo): -" + s09 + "-");

    // str.split("") Separa a String
    String s = "potato apple lemon";

    String[] vect = s.split(" "); // Separa tudo pelo espaco vazio e adiciona o vector
    String word1 = vect[0]; // vetor na pos 1 "potato"
    String word2 = vect[1]; // vetor na pos 2 "apple"
    String word3 = vect[2]; // vetor na pos 3 "lemon"

    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);
  }
}
