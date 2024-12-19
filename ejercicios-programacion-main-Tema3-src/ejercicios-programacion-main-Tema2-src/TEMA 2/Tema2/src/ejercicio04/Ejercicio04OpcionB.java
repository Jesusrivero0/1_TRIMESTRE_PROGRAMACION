package ejercicio04;

import java.util.Scanner;

public class Ejercicio04OpcionB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 1;
		Integer suma = 0;
		
		
		while(numero != 0) {
			System.out.println("Dame un numero");
			numero = scanner.nextInt();
			suma = suma + numero; // suma += numero;
		}
		
		System.out.println("Resultado = " + suma);
		
		scanner.close();
		
	}
}
