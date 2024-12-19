package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	public static final Integer MESES=12;
	public static void main(String[] args) {
		
			
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // 1. Mostrar un mensaje preguntando “¿Cuánto te gustaría ganar al año?”
        System.out.print("¿Cuánto te gustaría ganar al año? ");
        
        // 2. Esperar a que el usuario conteste indicando una cantidad y almacenarla en una variable
        double salarioAnual = scanner.nextDouble();
        
        // Calcular el sueldo mensual dividiendo lo indicado por el usuario entre 12
        double sueldoMensual = salarioAnual / MESES;
        
        // 3. Mostrar un nuevo mensaje “Tu sueldo mensual sería de xx euros”
        System.out.println("Tu sueldo mensual sería de " + sueldoMensual + " euros");
        
        // Cerrar el scanner
        scanner.close();
	}
}
