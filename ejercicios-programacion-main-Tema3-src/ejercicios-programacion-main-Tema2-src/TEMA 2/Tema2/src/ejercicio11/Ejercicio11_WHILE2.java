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
                System.out.println("Email no válido. Por favor, introduce un email válido.");
            } else if (dotIndex == -1 || dotIndex == atIndex + 1) {
                // No contiene un punto después del '@' o está justo después
                System.out.println("Email no válido. Por favor, introduce un email válido.");
            } else if (email.endsWith(".")) {
                // Termina con un punto
                System.out.println("Email no válido. Por favor, introduce un email válido.");
            } else {
                // Email válido
                System.out.println("El email es válido.");
                break;  // Salir del bucle si el email es válido
            }
        }

        scanner.close();  // Cerrar el escáner
	}

}
