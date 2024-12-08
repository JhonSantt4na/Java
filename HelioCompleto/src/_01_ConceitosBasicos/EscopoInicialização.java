package _01_ConceitosBasicos;

public class EscopoInicialização {
  public static void main(String[] args) {
    // Não compila sem iniciar a variavel
    double price = 400.00;
    System.out.println(price);
    double discout; // mesmo assim pode ser que não tenha a inicialização
    discout = 0; // Inicializando ela

    if(price < 200.00){
      discout = price * 0.1;
      // Caso queira que funciona inica ela no else com o valor=0
    }else{
      discout = 0;
    }
    // discout so existe dentro do if
    System.out.println(discout);

  }
}
