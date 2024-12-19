package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		
		// Solicitar tama�o del array (cantidad de n�meros)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cu�ntos n�meros me vas a dar??");
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
		
		// Cerramos scanner
		scanner.close();
		
		
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		
		// Ahora le damos la vuelta al array
		for (int i = 0, j=numeros.length-1; i < j; i++, j--) {
			Integer auxiliar = numeros[i];
			numeros[i] = numeros[j];
			numeros[j] = auxiliar;
			// otra opci�n en lugar de usar y crear j es esta:
			//numeros[i] = numeros[numeros.length-1-i];
		}
		
		// Recorrer el array para imprimirlo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		

	}

	
}
