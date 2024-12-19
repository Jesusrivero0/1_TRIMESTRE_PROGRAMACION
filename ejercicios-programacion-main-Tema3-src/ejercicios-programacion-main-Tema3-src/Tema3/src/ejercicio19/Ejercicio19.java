package ejercicio19;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] palabras = new String[] {"terremoto", "culinario", "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado", "teclado", "primavera"};
		
		Random random = new Random();
		Integer index = random.nextInt(0,10);
		String palabraSecreta = palabras[index];
				
		String[] original = palabraSecreta.split("");
		String[] tablero = new String[original.length];
		
		tablero[0] = original[0];
		for (int i = 1; i < tablero.length; i++) {
			tablero[i] = "_";
		}
		
		//imprimimos el tablero
		for (int i = 0; i < tablero.length; i++) {
			System.out.print(tablero[i] + " ");
		}
		System.out.println();
		
		// comenzamos el juego
		Integer vidas = 10;
		Boolean iguales;
		do {
			// 1. Pedir letra
			System.out.println("Dame una letra");
			String letra = scanner.nextLine();
			
			Boolean acertado = false;
			// 2. Comprobar si la letra existe en la palabra
			for (int i = 0; i < original.length; i++) {
				if (original[i].equals(letra)) {
					tablero[i] = letra;
					acertado = true;
				}				
			}
			
			// Pregunto si he acertado alguna
			if (acertado) {
				System.out.println("Enhorabuena, esa letra est�. ");
			}
			else {
				vidas--;
				System.out.println("Esa letra no est�. Te quedan " + vidas + " vidas");
			}
			
			// 3. Imprimir tablero
			//imprimirTablero(tablero);
			for (int i = 0; i < tablero.length; i++) {
				System.out.print(tablero[i] + " ");
			}
			System.out.println();
			iguales = true;
			
			//comparamos los dos arrays iguales = compararArrays(tablero, original);
			for (int i = 0; i < original.length; i++) {
				if (!original[i].equals(tablero[i])) {
					//System.out.println("no ha termiando: " + original[i] + ","+ tablero[i]);
					iguales= false;
					break;
				}
			}
			if(iguales)
				System.out.println("ENHORABUENA; ACERTASTE LA PALABRA");	
			
		}
		while(vidas > 0 && !iguales);
		
		if (vidas == 0) {
			System.out.println("Te has quedado sin vidas... m�s suerte la pr�xima vez");
		}
		
		
		scanner.close();
	}

	
}
