package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // 1. Solicitar por consola al usuario cuál es su altura
        System.out.print("Introduce tu altura en metros (por ejemplo, 1,75): ");
        double altura = scanner.nextDouble();
        
        // 2. Solicitar por consola al usuario cuál es su peso
        System.out.print("Introduce tu peso en kilogramos (por ejemplo, 70): ");
        double peso = scanner.nextDouble();
        
        // 3. Calcular el IMC
        double imc = peso / (altura * altura);
        
        // 4. Mostrar el resultado del IMC calculado en la consola
        System.out.printf("Tu IMC es: " + imc);
        
        // Cerrar el scanner
        scanner.close();
	}
}
