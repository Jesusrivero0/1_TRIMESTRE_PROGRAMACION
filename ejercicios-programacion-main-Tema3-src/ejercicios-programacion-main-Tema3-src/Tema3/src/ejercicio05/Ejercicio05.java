package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

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
		
		
		Integer maximo = numeros[0];
		Integer minimo = numeros[0];
		Integer posMaximo = 0;
		Integer posMinimo = 0;
		Integer suma = 0;
		
		// Recorrer el array para imprimirlo
		//		for (int i = 0; i < numeros.length; i++) {
		//			System.out.print(numeros[i] + " ");
		//		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			System.out.println();
			
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMaximo = i;
			}
			else if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMinimo = i;
			}
			suma = suma + numeros[i];
		}
		Integer media = suma/numeros.length;
		System.out.println("M�ximo: " + maximo + " en posici�n " + posMaximo);
		System.out.println("M�nimo: " + minimo + " en posici�n " + posMinimo);
		System.out.println("Media: " + media);
		
		// Cerramos scanner
		scanner.close();
	}

}
