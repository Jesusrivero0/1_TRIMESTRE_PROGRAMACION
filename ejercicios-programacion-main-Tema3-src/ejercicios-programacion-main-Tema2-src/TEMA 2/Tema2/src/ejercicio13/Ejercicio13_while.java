package ejercicio13;

import java.util.Scanner;

public class Ejercicio13_while {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar el texto al usuario
		System.out.print("Introduce el texto: ");
		String texto = scanner.nextLine();

		
		// Dividir el texto en trozos de tama�o 5 y mostrar cada trozo
		int longitudTexto = texto.length();
		int i = 0;
		while (i < longitudTexto) {
			// Definir el �ndice final del trozo
			int fin = i + 5;

			// Si el �ndice final supera la longitud del texto, ajustar al final del texto
			if (fin > longitudTexto) {
				fin = longitudTexto;
			}

			// Extraer y mostrar el trozo
			String trozo = texto.substring(i, fin);
			System.out.println(trozo);

			// Avanzar al siguiente trozo
			i += 5;
		}

		scanner.close(); // Cerrar el esc�ner
		// Ejemplo de cadena exacta de 5 en 5: una cadena muy larga
		// Ejemplo de cadena no exacta: una cadena muy larga larguisima
		// Ejemplo: Buenos d�as, mi nombre es Blau Blau.

	}

}
