package repaso.ejercicio01;

import java.util.Scanner;

public class Ejercicio02Repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el primer número entero grande: ");
		int numero1 = scanner.nextInt();
		System.out.print("Introduce el segundo número entero grande: ");
		int numero2 = scanner.nextInt();
		int multiplicacion = numero1*numero2;
		System.out.println("Resultado = " + multiplicacion);
		
		//2.147.483.648		
		
		System.out.println("Dame un número grande");
		Long numeroA = scanner.nextLong();
		System.out.println("Dame otro número grande");
		Long numeroB = scanner.nextLong();
		Long multiplicacionB = numeroA*numeroB;
		System.out.println("Resultado = " + multiplicacionB);
		scanner.close();
	}

}
