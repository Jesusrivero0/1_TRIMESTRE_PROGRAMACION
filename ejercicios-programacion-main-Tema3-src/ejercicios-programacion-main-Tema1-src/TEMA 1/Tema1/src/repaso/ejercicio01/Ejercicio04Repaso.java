package repaso.ejercicio01;

import java.util.Scanner;

public class Ejercicio04Repaso {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número favorito
        System.out.print("Introduce tu número favorito: ");
        // Leer el número favorito como una cadena para evitar problemas de entrada
        Integer numeroFavorito = scanner.nextInt();
        scanner.nextLine();
        // Solicitar la ciudad favorita
        System.out.print("Introduce tu ciudad favorita: ");
        String ciudadFavorita = scanner.nextLine();

        // Mostrar los resultados
        System.out.println("Tu número favorito es: " + numeroFavorito);
        System.out.println("Tu ciudad favorita es: " + ciudadFavorita);

        // Cerrar el scanner
        scanner.close();
	}
}
