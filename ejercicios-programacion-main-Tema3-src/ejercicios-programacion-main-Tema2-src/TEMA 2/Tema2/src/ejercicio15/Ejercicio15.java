package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número por pantalla: ");
		Integer numero = scanner.nextInt();

		
		Integer multiplicacion;
		
		for (Integer multiplicador = 0; multiplicador <= 10; multiplicador++) {
			multiplicacion = numero * multiplicador;
			System.out.println(numero + " x " + multiplicador + " = " + multiplicacion);
		}
		
		scanner.close();
	}
}
