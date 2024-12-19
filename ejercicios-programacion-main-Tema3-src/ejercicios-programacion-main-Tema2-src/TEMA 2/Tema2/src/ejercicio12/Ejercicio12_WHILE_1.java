package ejercicio12;

import java.util.Scanner;

public class Ejercicio12_WHILE_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. Pedir usuario
		// 2. Quitarle espacios al inicio y al final
		// 3. Convertir a mayúscula todo
		// 4. Preguntar si tiene longitud < 10 o contiene espacios entonces
		//		repetir desde 1.
		
		String usuario="";
		Integer longitud;
		Boolean contieneEspacios;
		
		Boolean usuarioCorrecto= false;
		
		while(!usuarioCorrecto)
		{
			// 1. Pedir usuario
			System.out.println("Dame un usuario");
			usuario = scanner.nextLine();
			
			usuarioCorrecto=true;
			
			// 2. Quitar espacios al inicio y fin
			usuario = usuario.trim();
			
			// 3. Convertir a mayúscula
			usuario = usuario.toUpperCase();
			
			longitud = usuario.length();
			if (longitud < 10) {
				System.out.println("La longitud es menor a 10");
				usuarioCorrecto=false;
			}
			
			contieneEspacios = usuario.contains(" ");			
			if (contieneEspacios) {
				System.out.println("No puede contener espacios");
				usuarioCorrecto=false;
			}			
		}		
		
		System.out.println("Todo OK. Tu username es " + usuario);
		
	}
}
