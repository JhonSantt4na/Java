package Arquivos.Exercicio;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with path file: ");
        String path = sc.nextLine();
        File lendoPath = FileReader(path);
        System.out.println("Como Funciona");

        sc.close();
    }
}
