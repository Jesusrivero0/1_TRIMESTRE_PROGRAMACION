package ejercicio09;


import java.util.Scanner;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe código HTML");
		String html = scanner.nextLine();
		
		System.out.println("Texto extraído:");
		String[] caracteres = html.split("");
		Boolean etiquetaAbierta = false;
		Boolean textoEscrito = false;
		
		for (String caracter : caracteres) {
			if (caracter.equals("<")) {
				if (textoEscrito) {// Ejercicio 8si ya he escrito texto, imprimo salto de linea
					System.out.println();
				}
				textoEscrito = false;
				etiquetaAbierta = true;
			}
			else if (caracter.equals(">")) {
				etiquetaAbierta = false;
			} 
			else if (!etiquetaAbierta) { //si la etiqueta ya se ha cerrado, es texto a mostrar
				System.out.print(caracter);
				textoEscrito = true;
			}
		}
		
		
		scanner.close();

	}
}
