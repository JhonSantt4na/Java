package _08_Arquivos;

import java.io.File;
import java.util.Scanner;

public class InfoCaminhoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a File path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Pegando o nome
        System.out.println("getName: " + path.getName());
        // Pegando Somente o Caminho
        System.out.println("getParent: " + path.getParent());
        // Caminho todo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
