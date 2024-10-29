package Arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileBuffered {
    // FileReader(stream de leitura de Caracteres a partir de arquivo)
    // Stream = sequencia
    // ou seja sempre que precisar de um arquivo vamos indo acessando pelo nossa sequencia

    // BufferedReader(Mais Rapido)
    // Sera instanciado apartir do filereader ultilizando buffer de memoria sendo assim mais rapido

    public static void main(String[] args) {

        String path = "/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Arquivos/input.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            // Lendo uma linha porem se tiver no final retorna um null

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try{ // Pois pode ocorrer um erro no fechamento tmb
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
