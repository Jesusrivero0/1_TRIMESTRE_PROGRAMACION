package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	
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
		
		
		// Ahora haremos otro array con los datos en orden inverso
		Integer[] numerosInvertido = new Integer[numeros.length];
		for (int i = 0, j=numeros.length-1; i < numerosInvertido.length; i++, j--) {
			numerosInvertido[i] = numeros[j];
			// otra opci�n en lugar de usar y crear j es esta:
			//numerosInvertido[i] = numeros[numeros.length-1-i];
		}
		
		// puedo usar el mismo m�todo para imprimir diferentes arrays
		for (int i = 0; i < numerosInvertido.length; i++) {
			System.out.print(numerosInvertido[i] + " ");
		}
		System.out.println(); 		

	}

}
