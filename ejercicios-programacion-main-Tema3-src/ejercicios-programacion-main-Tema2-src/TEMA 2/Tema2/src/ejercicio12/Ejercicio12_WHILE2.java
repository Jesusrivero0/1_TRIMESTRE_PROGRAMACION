package ejercicio12;

import java.util.Scanner;

public class Ejercicio12_WHILE2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String username;

        while (true) {
            System.out.print("Introduce el username: ");
            username = scanner.nextLine().trim();  // Eliminar espacios al principio y al final

            // Convertir a mayúsculas
            username = username.toUpperCase();

            // Validar el username
            if (username.length() < 10) {
                System.out.println("Error: El username debe tener al menos 10 caracteres.");
            } else if (username.contains(" ")) {
                System.out.println("Error: El username no puede contener espacios en blanco.");
            } else {
                // Username válido
                System.out.println("El username final es: " + username);
                break;  // Salir del bucle si el username es válido
            }
        }

        scanner.close();  // Cerrar el escáner
	}
}
