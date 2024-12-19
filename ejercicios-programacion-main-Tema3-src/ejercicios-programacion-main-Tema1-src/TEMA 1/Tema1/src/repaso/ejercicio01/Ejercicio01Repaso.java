package repaso.ejercicio01;

import java.util.Scanner;

public class Ejercicio01Repaso {
	private static final double NUMERO_PI = 3.1416;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el radio de tu círculo");
		Double radio = scanner.nextDouble();
		
		Double longCircunferencia = 2 * NUMERO_PI * radio;
		Double areaCirculo = radio * radio * NUMERO_PI;
		
		System.out.println("El area es " + areaCirculo);
		System.out.println("La longitud es " + longCircunferencia);
		
		scanner.close();
	}
}
