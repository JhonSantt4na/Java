package _08_Arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Folder Path: ");
        String strPath = sc.nextLine();

        // File pode ser caminho de arquivo ou de pasta
        File path = new File(strPath);
        // Lista somente quem for pasta
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder: folders){
            System.out.println(folder);
        }

        // AGR somente os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file: files){
            System.out.println(file);
        }

        // criando Pasta
        boolean success = new File(strPath + "//PastaCriada").mkdir();
        System.out.println("Directory Created with Successfully: " + success);

        sc.close();
    }
}
