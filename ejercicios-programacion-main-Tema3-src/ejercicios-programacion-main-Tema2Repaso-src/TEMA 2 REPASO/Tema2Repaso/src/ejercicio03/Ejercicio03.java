package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("*** MEN� ***");
			System.out.println("\t1. Abrir");
			System.out.println("\t2. Guardar");
			System.out.println("\t3. Modificar");
			System.out.println("\t4. Salir");
			opcion = scanner.nextInt();
			// Evaluar la opción elegida
			if (opcion == 1) {
				System.out.println("Has elegido la opción: Abrir");
			} else if (opcion == 2) {
				System.out.println("Has elegido la opción: Guardar");
			} else if (opcion == 3) {
				System.out.println("Has elegido la opción: Modificar");
			} else if (opcion == 4) {
				System.out.println("Bye Bye");
			} else {
				System.out.println("Esa opción de menú no es correcta.");
			}
		} while (opcion != 4);

		scanner.close();
	}
}
