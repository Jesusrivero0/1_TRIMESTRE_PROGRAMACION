package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		// Pedimos nombre completo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame una frase");
		String frase = scanner.nextLine();
		
		String [] array = frase.split(" ");
		Integer numPalabras = array.length;
		System.out.println("Hay " + numPalabras + " palabras");
		
		String[] letras = frase.split("");
		Integer contador = 0;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].equalsIgnoreCase("a")) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " a'es");
		

		scanner.close();
	}
}
