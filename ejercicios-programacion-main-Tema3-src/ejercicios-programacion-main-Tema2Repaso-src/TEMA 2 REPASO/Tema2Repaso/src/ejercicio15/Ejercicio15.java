package ejercicio15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15{
	private static final int TOTAL = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numeroAleatorio;
		
		Random random = new Random();		
		numeroAleatorio= random.nextInt(0,10); // numero aleatorio entre  0 y 9
		int intentos = 0;
		Integer numeroUsuario = null;
		
		do {
			
			System.out.print("Adivina el número (entre 0 y 9): ");
			numeroUsuario = scanner.nextInt();
			intentos++;
		}while(numeroAleatorio!=numeroUsuario);
		
		// Calcular la puntuación
        int puntuacion = TOTAL - intentos;

        // Mostrar la puntuación obtenida
        System.out.println("¡Felicidades! Has adivinado el número.");
        System.out.println("Número de intentos: " + intentos);
        System.out.println("Puntuación obtenida: " + puntuacion);
		
		scanner.close();
		
	}


}
