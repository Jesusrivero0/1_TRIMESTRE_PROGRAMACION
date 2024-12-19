package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		String[] palabras = new String[3];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Dame una palabra");
			String palabra = scanner.nextLine();
			palabras[i] = palabra;
		}
		
		String frase = "";
		for (int i = 0; i < palabras.length; i++) {
			frase = frase + palabras[i];
		}
		System.out.println(frase);
		
		scanner.close();
		
	}
}
