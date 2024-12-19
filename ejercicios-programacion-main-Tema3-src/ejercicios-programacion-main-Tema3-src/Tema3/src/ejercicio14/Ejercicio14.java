package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		// Pedimos nombre completo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame la frase");
		String frase = scanner.nextLine();
		
		frase = frase.toLowerCase();
		String[] palabras = frase.split(" ");
		
		for (int i = 1; i < palabras.length; i++) {
			
			String primeraLetra = palabras[i].substring(0, 1); //primera letra
			String sinPrimeraLetra = palabras[i].substring(1); //resto de la cadena
			
			String primeraLetraMay = primeraLetra.toUpperCase();			
			String resultadoFinal = primeraLetraMay + sinPrimeraLetra;
			
			palabras[i] = resultadoFinal;
		}
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i]);
		}

		scanner.close();
	}
	
}




