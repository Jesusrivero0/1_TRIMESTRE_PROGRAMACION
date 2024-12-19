package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {

			System.out.println("Pulsa ENTER para continuar");
			scanner.nextLine();

			System.out.println(i);
		}

		System.out.println("¡Fin del programa!");
		scanner.close();
	}

}
