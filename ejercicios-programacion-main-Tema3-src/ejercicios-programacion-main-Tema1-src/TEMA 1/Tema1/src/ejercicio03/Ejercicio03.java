package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // 1. Mostrar un mensaje pidiendo la edad del usuario
        System.out.print("Por favor, introduce tu edad: ");
        
        // 2. Esperar a que el usuario escriba su edad y almacenarla en una variable
        int edad = scanner.nextInt();
        
        // 3. Mostrar un nuevo mensaje indicando “Su edad es de xx años”
        System.out.println("Su edad es de " + edad + " años");
        
        // Cerrar el scanner
        scanner.close();
		
	}
}
