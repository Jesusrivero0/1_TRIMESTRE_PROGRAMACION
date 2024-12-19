package ejercicio04;

import java.util.Scanner;

public class Ejercicio04OpcionA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		Integer suma = 0;

		do {
			System.out.println("Dame un numero");
			numero = scanner.nextInt();
			suma = suma + numero; // suma += numero;
		} while (numero != 0);

		System.out.println("Resultado = " + suma);

		scanner.close();

	}
}
