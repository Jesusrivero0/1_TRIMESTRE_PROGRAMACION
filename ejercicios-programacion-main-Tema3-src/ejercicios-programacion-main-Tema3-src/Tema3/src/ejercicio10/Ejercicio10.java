package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Pedir el tamaño de manera continua hasta que no sea menor a 2
		Integer tam = null;
		do {
			System.out.println("Dame el tamaño de la serie");
			tam = scanner.nextInt();
		}while(tam < 2);
		
		// Declaramos array e inicializamos las 2 primeras casillas
		Integer[] fibonacci = new Integer[tam];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		// Recorrer el array y llenar el resto de posiciones5.
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		// Imprimo el contenido del array
		for (int i = 0; i < fibonacci.length; i++) {
			System.out.print(fibonacci[i] + " ");
		}
		
		// Cierro scanner
		scanner.close();
		
		
		
		
	}
}
