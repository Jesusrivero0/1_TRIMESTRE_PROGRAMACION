package ejercicio14;

import java.util.Scanner;

public class Ejercicio14_FOR {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un n�mero por pantalla:");
		Integer numero = scanner.nextInt();

		
		System.out.println("********* LA TABLA DEL N�MERO " + numero + " **************");
		
		for (int fila =0; fila<=10; fila++)
		{
			System.out.println(numero + " x " + fila + " = " + fila*numero);
			
		}		
		
		scanner.close();
	}
}
