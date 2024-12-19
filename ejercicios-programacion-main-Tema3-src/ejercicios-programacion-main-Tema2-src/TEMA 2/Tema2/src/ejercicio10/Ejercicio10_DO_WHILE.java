package ejercicio10;

import java.util.Scanner;

public class Ejercicio10_DO_WHILE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre1, nombre2;
		do {
			
			
			System.out.println("Dame un nombre");
			nombre1 = scanner.nextLine();
			System.out.println("Dame otro nombre");
			nombre2 = scanner.nextLine();
			
			
			//NOTA: isBlank() DEVUELVE true Si el string está vacío o solo contiene espacios en blanco
			//NOTA: isEmpty() DEVULVE true si la longitud de la cadena =0
			
			/* EJEMPLO:
			 * 
			 * SI nombre1 ="" Y nombre2="   "
			 * nombre1.isEmpty() --> true
			 * nombre1.isBlank() --> true
			 * nombre2.isEmpty() --> false
			 * nombre2.isBlank() --> true
			 */
			
			/*System.out.println("¿XX"+nombre1+"XX es vacio?: "+ nombre1.isEmpty());
			System.out.println("¿XX"+nombre1+"XX tiene solo blancos?: "+ nombre1.isBlank());
			
			System.out.println("¿XX"+nombre2+"XX es vacio?: "+ nombre2.isEmpty());
			System.out.println("¿XX"+nombre2+"XX tiene solo blancos?: "+ nombre2.isBlank());
			*/
			
			
		}
		while (nombre1.isBlank() || nombre2.isBlank());
		
		
		//NOTA: codigo asci a:97, asci p:112 , A:65, P:80	 ana < pepe,   A < a
		int comparacion = nombre1.compareTo(nombre2); 
		if (comparacion <= 0) { //nombre1 tiene letras anteriores a nombre 2 en el alfabeto.
			System.out.println("Orden correcto: " + nombre1 + " - " + nombre2);
		}
		else {//nombre1 tiene letras posteriores a nombre2 en el alfabeto.
			System.out.println("Orden correcto: " + nombre2 + " - " + nombre1);
		}
		
		scanner.close();
	}
	
}
