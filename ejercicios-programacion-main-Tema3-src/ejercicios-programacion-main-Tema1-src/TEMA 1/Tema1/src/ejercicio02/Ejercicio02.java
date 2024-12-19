package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// 1. Mostrar un mensaje pidiendo el nombre del usuario
		System.out.print("Por favor, introduce tu nombre: ");

		// 2. Esperar a que el usuario escriba su nombre
		String nombre = scanner.nextLine();

		// 3. Mostrar un nuevo mensaje indicando: “Bienvenido (nombre)”
		System.out.println("Bienvenido " + nombre + "!");

		// 4. Mostrar un nuevo mensaje indicando: “¿De dónde eres?”
		System.out.print("¿De dónde eres?: ");

		// 5. Esperar a que el usuario escriba el lugar de donde vive
		String localidad = scanner.nextLine();

		// 6. Mostrar un mensaje preguntando: “¿Qué tal se vive en (localidad)?”
		System.out.print("¿Qué tal se vive en " + localidad + "?: ");

		// 7. Esperar a que el usuario escriba una respuesta
		String respuesta = scanner.nextLine();

		// 8. Mostrar un último mensaje indicando “Gracias. Un saludo”
		System.out.println("Gracias. Un saludo!");

		// Cerrar el scanner
		scanner.close();

	}
}
