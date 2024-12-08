package _08_Arquivos.Exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Produto> list = new ArrayList<>();
        
        System.out.println("Enter directory path: ");
        String sourceFolderStr = sc.nextLine();
        
        File sourceFolder = new File(sourceFolderStr);
        
        // Verifica se o caminho é um diretório
        if (sourceFolder.isDirectory()) {
            // Filtra arquivos com extensão .csv
            File[] files = sourceFolder.listFiles((dir, name) -> name.endsWith(".csv"));
            
            if (files != null) {
                for (File sourceFile : files) {
                    try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                        String itemCsv = br.readLine();
                        while (itemCsv != null) {
                            String[] fields = itemCsv.split(",");
                            String name = fields[0];
                            double price = Double.parseDouble(fields[1]);
                            int qty = Integer.parseInt(fields[2]);
                            
                            // Adiciona o produto na lista
                            list.add(new Produto(name, price, qty));
                            itemCsv = br.readLine();
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + sourceFile.getName() + " - " + e.getMessage());
                    }
                }
            }
            
            // Cria a pasta de saída "out" se não existir
            File outFolder = new File(sourceFolderStr + "/out");
            boolean success = outFolder.exists() || outFolder.mkdir();
            System.out.println("Folder Created: " + success);
            
            // Define o caminho do arquivo sumary.csv
            String targetFileStr = outFolder + "/sumary.csv";
            
            // Escreve os dados no arquivo sumary.csv
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto item : list) {
                    bw.write(item.getName() + " , " + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println("Arquivo criado: " + targetFileStr);
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("O caminho especificado não é um diretório.");
        }
        
        sc.close();
    }
}
