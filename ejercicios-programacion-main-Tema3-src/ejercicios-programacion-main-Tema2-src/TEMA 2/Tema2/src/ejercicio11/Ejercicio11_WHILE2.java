package ejercicio11;

import java.util.Scanner;

public class Ejercicio11_WHILE2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String email;

        while (true) {
            System.out.print("Introduce tu email: ");
            email = scanner.nextLine().trim();  // Eliminar espacios al principio y al final

            // Validar el email
            int atIndex = email.indexOf('@');
            int dotIndex = email.indexOf('.', atIndex);

            if (atIndex == -1) {
                // No contiene '@'
                System.out.println("Email no v�lido. Por favor, introduce un email v�lido.");
            } else if (dotIndex == -1 || dotIndex == atIndex + 1) {
                // No contiene un punto despu�s del '@' o est� justo despu�s
                System.out.println("Email no v�lido. Por favor, introduce un email v�lido.");
            } else if (email.endsWith(".")) {
                // Termina con un punto
                System.out.println("Email no v�lido. Por favor, introduce un email v�lido.");
            } else {
                // Email v�lido
                System.out.println("El email es v�lido.");
                break;  // Salir del bucle si el email es v�lido
            }
        }

        scanner.close();  // Cerrar el esc�ner
	}

}
