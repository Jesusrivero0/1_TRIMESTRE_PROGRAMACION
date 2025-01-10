package Ejercicio7;

import java.util.Scanner;

import Ejercicio6.Calculadora;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("que necesistas hacer: ");
		String respuesta = scanner.nextLine();
		System.out.println("Dime un numero: ");
		Integer num1 = scanner.nextInt();
		System.out.println("Dimer otro numero");
		Integer num2 = scanner.nextInt();

		if (respuesta.equalsIgnoreCase("Suma")) {
			Integer resultadoSuma = Calculadora.sumar(num1, num2);
			System.out.println(resultadoSuma);
		} else if (respuesta.equalsIgnoreCase("Restar")) {
			Integer resultadoResta = Calculadora.restar(num1, num2);
			System.out.println(resultadoResta);
		} else if (respuesta.equalsIgnoreCase("Dividir")) {
			Integer resultadoDividir = Calculadora.dividir(num1, num2);
			System.out.println(resultadoDividir);
		} else if (respuesta.equalsIgnoreCase("Multiplicar")) {
			Integer resultadoMultiplicar = Calculadora.multiplicar(num1, num2);
			System.out.println(resultadoMultiplicar);
		}

	}

}
