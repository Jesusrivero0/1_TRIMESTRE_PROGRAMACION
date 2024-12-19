package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar el precio sin IVA
		System.out.print("Introduce el precio sin IVA: ");
		double precioSinIVA = scanner.nextDouble();

		// Solicitar el tipo de IVA
		System.out.println("Introduce el tipo de IVA:");
		System.out.println("1. Normal (21%)");
		System.out.println("2. Reducido (10%)");
		System.out.println("3. Superreducido (4%)");
		System.out.println("4. Exento (0%)");
		int tipoIVA = scanner.nextInt();

		// Declarar la variable para el IVA
		double porcentajeIVA;

		// Determinar el porcentaje de IVA basado en la selección usando if-else
		if (tipoIVA == 1) {
			porcentajeIVA = 21;
		} else if (tipoIVA == 2) {
			porcentajeIVA = 10;
		} else if (tipoIVA == 3) {
			porcentajeIVA = 4;
		} else if (tipoIVA == 4) {
			porcentajeIVA = 0;
		} else {
			System.out.println("Tipo de IVA no válido.");
			return; // Salir del programa si el tipo de IVA es incorrecto
		}

		// Calcular el IVA y el precio total
		double iva = precioSinIVA * (porcentajeIVA / 100);
		double precioTotal = precioSinIVA + iva;

		// Mostrar los resultados
		System.out.println("Precio sin IVA: " + precioSinIVA);
		System.out.println("Tipo de IVA: " + porcentajeIVA + "%");
		System.out.println("IVA: " + iva);
		System.out.println("Precio total con IVA: " + precioTotal);

		scanner.close(); // Cerrar el escáner

	}

}
