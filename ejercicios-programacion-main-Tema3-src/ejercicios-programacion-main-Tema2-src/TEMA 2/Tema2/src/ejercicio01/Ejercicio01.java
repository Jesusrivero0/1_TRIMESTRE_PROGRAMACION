package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("En qu� a�o naciste?");
		Integer anyo = scanner.nextInt();
		
		if (anyo <= 1900) {
			System.out.println("Eres de la generaci�n perdida");
		}
		else if ( anyo <= 1927) {
			System.out.println("Grandiosa");
		}
		else if (anyo <= 1946) {
			System.out.println("Silenciosa");
		}
		else if (anyo <= 1965) {
			System.out.println("Baby boomers");
		}
		else if (anyo <= 1981) {
			System.out.println("Generaci�n X");
		}
		else if (anyo <= 1996) {
			System.out.println("Generaci�n Y");
		}
		else if (anyo <= 2012) {
			System.out.println("Generaci�n Z");
		}
		else  {
			System.out.println("Generaci�n Alfa");
		}
		
		scanner.close();
	}

}
