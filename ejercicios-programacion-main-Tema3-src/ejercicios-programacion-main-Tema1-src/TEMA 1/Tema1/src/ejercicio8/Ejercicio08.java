package ejercicio8;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número (como texto): ");
		String a = scanner.nextLine();

		System.out.print("Introduce un número decimal: ");
		Double b = scanner.nextDouble();

		System.out.print("Introduce un número entero (como decimal): ");
		Float c = scanner.nextFloat();

		Long x1 = Long.parseLong(a);

		String x2 = b.toString();

		int x3 = b.intValue();

		long x4 = c.longValue();

		// Imprimir los resultados
		System.out.println("Valor de x1 (Long): " + x1);
		System.out.println("Valor de x2 (String): " + x2);
		System.out.println("Valor de x3 (Integer): " + x3);
		System.out.println("Valor de x4 (Long): " + x4);

		// Cerrar el scanner
		scanner.close();

	}

}
