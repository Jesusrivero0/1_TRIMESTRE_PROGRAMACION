package ejercicio18;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main(String[] args) {
	
	
		
		/*Solicita una palabra al usuario y a continuaci�n deletr�ala (imprime cada letra por separado).
		  Utiliza para ello un Split y un bucle foreach
		*/
				
		System.out.println("Introduce una palabra por favor");
		Scanner scanner = new Scanner(System.in);
		String palabra = scanner.nextLine();
		
		String arrayLetras[]=palabra.split("");
		
		for (String letra : arrayLetras) {
			System.out.print(letra + "\t");
		}
		
		
		
	}
	
}
