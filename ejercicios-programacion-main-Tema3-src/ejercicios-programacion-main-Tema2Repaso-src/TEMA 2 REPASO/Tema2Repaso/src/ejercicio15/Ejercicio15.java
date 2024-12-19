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
			
			System.out.print("Adivina el n�mero (entre 0 y 9): ");
			numeroUsuario = scanner.nextInt();
			intentos++;
		}while(numeroAleatorio!=numeroUsuario);
		
		// Calcular la puntuaci�n
        int puntuacion = TOTAL - intentos;

        // Mostrar la puntuaci�n obtenida
        System.out.println("�Felicidades! Has adivinado el n�mero.");
        System.out.println("N�mero de intentos: " + intentos);
        System.out.println("Puntuaci�n obtenida: " + puntuacion);
		
		scanner.close();
		
	}


}
