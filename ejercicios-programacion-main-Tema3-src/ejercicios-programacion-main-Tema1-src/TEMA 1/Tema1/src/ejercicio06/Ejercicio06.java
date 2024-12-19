package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	private static final double PORCENTAJE_IVA = 0.21;

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// 1. Solicitar por consola al usuario cuál es el precio sin IVA del artículo
		System.out.print("Por favor, introduce el precio sin IVA del artículo: ");

		// 2. Recoger el dato ingresado por el usuario (precio sin IVA)
		double precioSinIVA = scanner.nextDouble();

		// Calcular el IVA (21%)
		double iva = precioSinIVA * PORCENTAJE_IVA;

		// Calcular el precio final sumando el IVA al precio sin IVA
		Double precioConIVA = precioSinIVA + iva;

		// 3. Mostrar el IVA calculado y el precio final en la consola
        System.out.println("El IVA calculado es: " + iva + " euros");
        System.out.println("El precio final del artículo es: " + precioConIVA + " euros");
        
        // Cerrar el scanner
        scanner.close();
	}
}
