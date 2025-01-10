package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

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
			cadena = cadena.toUpperCase();
		}
		else if (numero == 2) {
			cadena = cadena.toLowerCase();
		}
		return cadena;
	}
}

