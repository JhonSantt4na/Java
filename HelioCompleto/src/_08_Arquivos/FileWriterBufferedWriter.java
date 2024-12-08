package _08_Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    /* FileWrite: (Stream de escrita de caracteres em arquivos)
    para instanciarmos podemos usar:
    Cria/Recriar > new FileWriter(Caminho)
    Acrescentar a arquivo existente : new FileWrite(Caminho, true)

    BufferedWrite
    * */

    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good Night"};
        String path = "/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Arquivos/out.txt";

        // Para Ultilizar o mesmo arquivo existente
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
