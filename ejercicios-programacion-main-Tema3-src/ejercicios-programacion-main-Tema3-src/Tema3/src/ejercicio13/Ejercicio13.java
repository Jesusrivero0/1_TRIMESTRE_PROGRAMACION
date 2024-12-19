package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		// Pedimos nombre completo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame la palabra");
		String palabra = scanner.nextLine();
		
		String[] letras = palabra.split(""); // esto nos devuelve un array con cada letra
		
		for (int i = letras.length-1; i >= 0; i--) {
			System.out.print(letras[i]);
		}

		scanner.close();
	}
}
