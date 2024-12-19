package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	
	 // Definir constantes
    public static final int AÑO_ACTUAL = 2024;
	
	public static void main(String[] args) {
		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // 1. Mostrar un mensaje pidiendo el año de nacimiento del usuario usando la constante
        System.out.print("Por favor, introduce tu año de nacimiento: ");
        
        // 2. Esperar a que el usuario conteste y almacenar el año en una variable
        int anyo = scanner.nextInt();
        
        // Calcular la edad del usuario usando la constante del año actual
        int edad = AÑO_ACTUAL - anyo;
        
        // 3. Mostrar un nuevo mensaje indicando la edad del usuario
        System.out.println("Tu edad es: " + edad + " años");
        
        // Cerrar el scanner
        scanner.close();
	}
}
