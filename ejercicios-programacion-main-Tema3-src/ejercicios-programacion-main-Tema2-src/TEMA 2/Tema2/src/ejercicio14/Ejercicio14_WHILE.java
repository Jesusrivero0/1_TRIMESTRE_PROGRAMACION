package ejercicio14;

import java.util.Scanner;

public class Ejercicio14_WHILE {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número por pantalla:");
		Integer numero = scanner.nextInt();

		Integer multiplicador = 0;
		Integer multiplicacion;
		
		System.out.println("********* LA TABLA DEL NÚMERO " + numero + " **************");
		
		while (multiplicador <= 10) {
			multiplicacion = numero * multiplicador;
			System.out.println(numero + " x " + multiplicador + " = " + multiplicacion);
			multiplicador++; // multiplicador = multiplicador + 1;
		}
		
		
		scanner.close();
	}
}
