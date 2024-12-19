package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		Integer a = scanner.nextInt();
		System.out.println("Dame el segundo numero");
		Integer b = scanner.nextInt();
		Integer opcion;

		do {
			// 1. Mostrar menu
			System.out.println("*** MEN� ***");
			System.out.println(" 1. Sumar");
			System.out.println(" 2. Restar");
			System.out.println(" 3. Multiplicar");
			System.out.println(" 4. Dividir");
			System.out.println(" 0. Salir");
			System.out.println();

			// 2. Calcular en funci�n del men�
			System.out.println("�Qu� opci�n eliges?");
			opcion = scanner.nextInt();
			if (opcion == 1) {
				System.out.println("Resultado " + (a + b));
			} else if (opcion == 2) {
				System.out.println("Resultado " + (a - b));
			} else if (opcion == 3) {
				System.out.println("Resultado " + (a * b));
			} else if (opcion == 4) {
				if (b == 0) {
					System.out.println("No es posible dividir entre 0");
				} else {
					System.out.println("Resultado " + (a / b));
				}
			} else {
				System.out.println("Opción inválida. Por favor, elija una opción válida.");
			}
		} while (opcion != 0);

		System.out.println("Hasta luego!");
		scanner.close();
	}
}