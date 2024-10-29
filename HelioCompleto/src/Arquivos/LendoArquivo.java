package Arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {
    /* Classes :
        File - representação abstrata de um arquivo e seu caminho
        Scanner - Leitor de Texto
        IOException(Herda de Exception)
    * */
    public static void main(String[] args) {
        // Instanciamos um objeto tipo File
        // e passamos o caminho e o arquivo pra ele
        File file = new File("/home/jhondev/IdeaProjects/Java/HelioCompleto/src/Arquivos/input.txt");
        // Com isso o file. tem varios methodos pra se usar ex:
        Scanner sc = null;
        // Instanciando o Scaner apartir do arquivo
        // porem ou fazer isso vamos tentar abri o arquivo e se der uma exception sera do tipo IOException
        // Ou seja vamos usar o Try
        try{
            sc=new Scanner(file);
            // vamos verificar se tem mais linhas caso sim vamos exibir
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        // Poderia fechar no try mas caso der erro no processo o try sera cortado e o scanner nãos era cortado
        // Usaremo o Finaly testando se ele foi instanciado
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
