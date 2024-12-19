package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // 1. Mostrar un mensaje pidiendo el nombre del usuario
        System.out.print("Por favor, introduce tu nombre: ");
        
        // 2. Esperar a que el usuario escriba su nombre y registrarlo en una variable
        String nombre = scanner.nextLine();
        
        // 3. Mostrar un nuevo mensaje pidiendo el apellido del usuario
        System.out.print("Por favor, introduce tu apellido: ");
        
        // 4. Esperar a que el usuario escriba su apellido y registrarlo en otra variable
        String apellido = scanner.nextLine();
        
        // 5. Mostrar un mensaje final indicando el nombre completo
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
        
        // Cerrar el scanner
        scanner.close();
            
	}

}
