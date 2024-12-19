package ejercicio12;

import java.util.Scanner;

public class Ejercicio12_DO_WHILE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. Pedir usuario
		// 2. Quitarle espacios al inicio y al final
		// 3. Convertir a mayúscula todo
		// 4. Preguntar si tiene longitud < 10 o contiene espacios entonces
		//		repetir desde 1.
		
		String usuario;
		Integer longitud;
		Boolean contieneEspacios;
		do {
			// 1. Pedir usuario
			System.out.println("Dame un usuario");
			usuario = scanner.nextLine();
			
			// 2. Quitar espacios al inicio y fin
			usuario = usuario.trim();
			
			// 3. Convertir a mayúscula
			usuario = usuario.toUpperCase();
			
			longitud = usuario.length();
			contieneEspacios = usuario.contains(" ");
			if (longitud < 10) {
				System.out.println("La longitud es menor a 10");
			}
			if (contieneEspacios) {
				System.out.println("No puede contener espacios");
			}
			
		}
		while(longitud<10 || contieneEspacios);
		
		System.out.println("Todo OK. Tu username es " + usuario);
		
	}
}
