package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Solicitar tama�o del array (cantidad de n�meros)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, dime el tama�o del array");
		Integer tam = scanner.nextInt();
		
		// Crear el array con ese tama�o
		Integer[] numeros = new Integer[tam];		
		
		// Recorremos el array y solicitamos un n�mero 
		// al usuario para meterlo en la posici�n i
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el n�mero de la posici�n " + i);
			Integer x = scanner.nextInt();
			numeros[i] = x;					
			
		}
		
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		// Cerramos scanner
		scanner.close();
	}

}
