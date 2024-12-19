package ejercicio11;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		// Pedimos nombre completo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu nombre completo");
		String nombreCompleto = scanner.nextLine();
		
		String[] array = nombreCompleto.split(" ");
		
		System.out.println("Nombre: " + array[0]);
		System.out.println("Apellido 1: " + array[1]);
		System.out.println("Apellido 2: " + array[2]);
		
		System.out.println();
		
		//Para recorrerlo con bucles
		//1.Recorrido for
		System.out.println("Recorrido con for:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		//2. Recorrido foreach
		System.out.println("Recorrido con foreach:");
		for (String palabra : array) {
			System.out.println(palabra);
		}
		
		
		scanner.close();
	}
}
