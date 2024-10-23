package TratamentoErro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finaly {
	public static void main(String[] args) {
		File file = new File("/home/devsantt4na/insert_pipe.sh");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally Block Executed");
		}
	}
}
