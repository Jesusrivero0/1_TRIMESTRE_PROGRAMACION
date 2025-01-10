package Ejercicio4;

import java.util.Scanner;

import Ejercicio1.Ejercicio1;
import Ejercicio2.Ejercicio2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero que sea 1 o 2: ");
		Integer numero = scanner.nextInt();
		
		String llamada = getMayMin(" Hola  ", numero);
		
		System.out.println(llamada);
		
		scanner.close();
	}
		public static String getMayMin (String cadena, int numero) {
			
		cadena = cadena.trim();
		if (numero == 1) {
			cadena = Ejercicio1.getMayusculas(cadena);
		}
		else if (numero == 2) {
			cadena = Ejercicio2.getMinusculas(cadena);
		}
		return cadena;
	}

}
