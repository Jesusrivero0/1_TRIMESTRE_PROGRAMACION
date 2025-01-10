package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce un numero");
		Integer numero1 = scanner.nextInt();
		System.out.println("Introduce otro numero");
		Integer numero2 = scanner.nextInt();
		
		Integer resultado = Calculadora.dividir(numero1, numero2);
		
		System.out.println(resultado);
	}
}
