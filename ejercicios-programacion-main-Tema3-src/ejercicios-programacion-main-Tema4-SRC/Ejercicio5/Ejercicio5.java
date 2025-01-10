package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce un numero");
		Integer numero1 = scanner.nextInt();
		System.out.println("Introduce otro numero");
		Integer numero2 = scanner.nextInt();
		
		Integer resultado = sumar (numero1, numero2);
		
		System.out.println("Resultado es " + resultado);
	}
	public static Integer sumar(Integer num1, Integer num2) {
		Integer resultado = num1 + num2;
		return resultado;
	}
	}


