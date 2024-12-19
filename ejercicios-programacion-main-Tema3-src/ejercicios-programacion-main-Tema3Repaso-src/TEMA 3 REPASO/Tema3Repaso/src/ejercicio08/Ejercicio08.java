package ejercicio08;


import java.util.Scanner;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe c�digo HTML");
		String html = scanner.nextLine();
		
		System.out.println("Texto extra�do:");
		String[] caracteres = html.split("");
		Boolean etiquetaAbierta = false;
		Boolean textoEscrito = false;
		
		for (String caracter : caracteres) {
			if (caracter.equals("<")) {				
				etiquetaAbierta = true;
			}
			else if (caracter.equals(">")) {
				etiquetaAbierta = false;
			} 
			else if (!etiquetaAbierta) { //si la etiqueta ya se ha cerrado, es texto a mostrar
				System.out.print(caracter);				
			}
		}
		
		
		scanner.close();

	}
}
