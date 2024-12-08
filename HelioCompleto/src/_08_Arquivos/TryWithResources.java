package _08_Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    // é um bloco try qye declara um ou mais recursos, e garante
    // que esses recursos serão fechados ao final do bloco > disponivel JAVA 7+
    public static void main(String[] args) {

        String path = "/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Arquivos/input.txt";
        // Não precisamos mas instanciar da forma antiga e sim dessa forma
        // Diretamente no try instanciamos os dois juntos
        try(BufferedReader br = new BufferedReader( new FileReader(path))){
            // Lendo uma linha porem se tiver no final retorna um null

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
