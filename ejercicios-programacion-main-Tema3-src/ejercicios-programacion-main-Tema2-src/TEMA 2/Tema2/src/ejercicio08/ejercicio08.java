package ejercicio08;

import java.util.Scanner;

public class ejercicio08 {
	
	public static void main(String[] args) {
		/*
		
		Scanner scanner = new Scanner(System.in);
		
		String pal1, pal2;
		
		do {
		
		System.out.println("Introduzca la primera palabra: ");
		
		pal1 = scanner.nextLine();  // capturamos el primer n�mero por pantalla
		pal1 = pal1.trim(); // le quitamos espacios en blanco por delante  y por detr�s
		System.out.println("Introduzca la segunda palabra: ");
		
		pal2 = scanner.nextLine();  // capturamos el segundo n�mero por pantalla
		pal2 = pal2.trim(); // le quitamos espacios en blanco por delante  y por detr�s
		if(!pal1.equalsIgnoreCase(pal2))			 // En el caso de que sean distintas(sin tener en cuenta las may o min, mostramos un mensaje por pantalla
			System.out.println("Las palabras " + pal1 + " y " + pal2 + " son distintas");
				
		}while(!pal1.equalsIgnoreCase(pal2)); // mientras que las dos palabras sean distintas, se vuelve a ejecutar el do.
		
		System.out.println("Las palabras " + pal1 + " y " + pal2 + " son iguales");
		scanner.close();
		*/
		
		//Otra forma:

		Scanner scanner = new Scanner(System.in);
        String cadena1, cadena2;

        while (true) {
            // Solicitar dos cadenas al usuario
            System.out.print("Introduce la primera cadena: ");
            cadena1 = scanner.nextLine().trim();  // Leer la cadena y eliminar espacios al principio y al final
            
            System.out.print("Introduce la segunda cadena: ");
            cadena2 = scanner.nextLine().trim();  // Leer la cadena y eliminar espacios al principio y al final

            // Comparar las cadenas ignorando may�sculas y min�sculas
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("Las cadenas son iguales. �Saludos!");
                break;  // Salir del bucle si las cadenas son iguales
            } else {
                System.out.println("Las cadenas no son iguales. Por favor, int�ntalo de nuevo.");
            }
        }

        scanner.close();  // Cerrar el esc�ner    			
	}

}


