package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu altura");
		Double altura = scanner.nextDouble();
		System.out.println("Dime tu peso");
		Double peso = scanner.nextDouble();
		
		Double imc = peso / (altura*altura);
		System.out.println("Tu indice de masa corporal es " + imc);
		
		if (imc <= 18.5) {
			System.out.println("Est� m�s delgado de lo normal");
		}
		else if (imc <= 24.9) {
			System.out.println("Est� normal");
		}
		else if (imc <= 29.9) {
			System.out.println("Peso superior al normal");
		}
		else {
			System.out.println("Obesidad");
		}
		
		
		scanner.close();
	}
}
