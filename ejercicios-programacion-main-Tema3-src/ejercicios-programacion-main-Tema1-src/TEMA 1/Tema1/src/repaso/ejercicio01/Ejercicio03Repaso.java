package repaso.ejercicio01;

import java.util.Scanner;

public class Ejercicio03Repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer número entero: ");
		String cadena1 = scanner.nextLine();
		System.out.print("Introduce el segundo número entero: ");
		String cadena2 = scanner.nextLine();
		Long numero1 = Long.parseLong(cadena1);
		Long numero2 = Long.parseLong(cadena2);
		Long multiplicacion = numero1 * numero2;

		System.out.println("Resultado = " + multiplicacion);
		scanner.close();
	}

}
