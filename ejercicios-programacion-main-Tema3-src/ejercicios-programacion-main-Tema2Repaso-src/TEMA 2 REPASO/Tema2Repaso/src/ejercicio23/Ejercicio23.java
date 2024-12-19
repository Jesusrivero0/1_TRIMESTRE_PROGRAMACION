package ejercicio23;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		do {
			System.out.println("Dame un n�mero mayor a 0");
			numero = scanner.nextInt();
		} while (numero <= 0);

		Random random = new Random();
		// Variables para contar cu�ntas veces sale cada n�mero (del 1 al 6)
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador6 = 0;

		// Lanzar el dado N veces y contar cu�ntas veces sale cada n�mero
		System.out.println("Lanzando el dado " + numero + " veces...");
		for (int i = 1; i <= numero; i++) {
			int resultado = random.nextInt(1, 7); // Genera un n�mero entre 1 y 6
			System.out.println("Lanzamiento " + i + ": " + resultado);

			// Incrementar el contador correspondiente seg�n el n�mero obtenido
			if (resultado == 1) {

				contador1++;
			} else if (resultado == 2) {
				contador2++;
			} else if (resultado == 3) {

				contador3++;
			} else if (resultado == 4) {

				contador4++;
			} else if (resultado == 5) {
				contador5++;
			} else if (resultado == 6) {
				contador6++;
			}

		}

		// Mostrar cu�ntas veces ha salido cada n�mero
		System.out.println("\nResultados de los lanzamientos:");
		System.out.println("El n�mero 1 ha salido " + contador1 + " veces.");
		System.out.println("El n�mero 2 ha salido " + contador2 + " veces.");
		System.out.println("El n�mero 3 ha salido " + contador3 + " veces.");
		System.out.println("El n�mero 4 ha salido " + contador4 + " veces.");
		System.out.println("El n�mero 5 ha salido " + contador5 + " veces.");
		System.out.println("El n�mero 6 ha salido " + contador6 + " veces.");

		scanner.close();
	}

}
