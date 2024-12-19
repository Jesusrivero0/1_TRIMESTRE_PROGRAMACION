package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe una palabra o una frase: ");
		String palabra = scanner.nextLine();

		for (int i = palabra.length(); i > 0; i--) { // comienzo por el final de la palabra y vamos decrementando el
														// contador
			System.out.print(palabra.substring(i - 1, i));
		}

		scanner.close();

	}

}
