package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declarar el array
		Integer[] cuadrados = new Integer[6]; // tama�o del array
		
		// Pedir n�mero x
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduce un n�mero:");
		Integer numero = scanner.nextInt();
		
		// Llenar el array con los cuadrados de x y los 5 sucesivos
		for (int i = 0; i < cuadrados.length; i++) {
			cuadrados[i] = numero*numero;
			numero++;
		}
		
		// Imprimir contenido del array
		for (int i = 0; i < cuadrados.length; i++) {
			System.out.print(cuadrados[i] + " ");
		}
		
		scanner.close();
		
	}
}
