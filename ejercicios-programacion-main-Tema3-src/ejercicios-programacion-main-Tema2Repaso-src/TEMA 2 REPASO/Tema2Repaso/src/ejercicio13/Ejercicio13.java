package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	private static final String FIN = "fin";
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String frase;
		String acumulador="";
		
		do {
			 System.out.print("Introduce una frase (escribe 'FIN' para terminar): ");
			frase =  scanner.nextLine();
			
			if(!frase.equalsIgnoreCase(FIN))
				acumulador+=frase + " ";		
		
		}while(!frase.equalsIgnoreCase(FIN));		
		System.out.println("frase completa: " + acumulador);
				
		scanner.close();
		
		
		
		//OTRA FORMA
		/*
		Scanner scanner = new Scanner(System.in);
		String frase;
		String acumulador="";
		
		while (true) {
            System.out.print("Introduce una frase (escribe 'FIN' para terminar): ");
            frase = scanner.nextLine();

            // Verificar si la frase es "FIN", en cualquier forma (may�sculas o min�sculas)
            if (frase.equalsIgnoreCase(FIN)) {
                break; // Salir del bucle
            }

            // Almacenar la frase en la variable acumuladora
            acumulador+=frase + " ";	
        }

		System.out.println("frase completa: " + acumulador);
				
		scanner.close();
		
		*/
	}	
	
}
