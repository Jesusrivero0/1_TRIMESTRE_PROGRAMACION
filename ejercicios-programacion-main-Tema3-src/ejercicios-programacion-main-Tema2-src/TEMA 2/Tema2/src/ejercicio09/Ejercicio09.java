package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Pedimos el nombre completo por pantalla
		System.out.println("Dime tu nombre completo");
		String nombreCompleto = scanner.nextLine();

		// Calculamos en qu� posiciones est�n los dos espacios
		Integer indexPrimerEspacio = nombreCompleto.indexOf(" ");
		
	    // Vamos a dividir la cadena hasta el primer espacio. OJO que substring va desde a la posicion inicial a posicion final -1
		String nombre = nombreCompleto.substring(0, indexPrimerEspacio);
		
		String resto = nombreCompleto.substring(indexPrimerEspacio+1);
		
		Integer indexSegundoEspacio = resto.indexOf(" ");
		
		// Ahora dividimos desde el primer espacio hasta el segundo
		String apellido1 = resto.substring(0,indexSegundoEspacio);

		// Ahora dividimos desde el segundo espacio hasta el final
		String apellido2 = resto.substring(indexSegundoEspacio + 1);

		
		// Imprimimos
		System.out.println("Nombre:" + nombre);
		System.out.println("Primer apellido:" + apellido1);
		System.out.println("Segundo apellido:" + apellido2);

		scanner.close();


	}
}
