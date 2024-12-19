package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un n�mero entre 1 y 10 (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            } else if (numero < 1 || numero > 10) {
                System.out.println("N�mero incorrecto. Debe estar entre 1 y 10.");
            } else {
                int suma = 0;
                for (int i = numero; i <= numero * 10; i += numero) {
                    System.out.print(i);
                    if (i < numero * 10) {
                        System.out.print(" + ");
                    }
                    suma += i;
                }
                System.out.println(" = " + suma);
            }
        }

        scanner.close();		
		/*
		Scanner scanner = new Scanner(System.in);
		Integer multiplo;
		do {
			System.out.println("Indica el n�mero multiplicador");
			multiplo = scanner.nextInt();
			
			if (multiplo <= 0 || multiplo > 10) {
				System.out.println("El m�ltiplo indicado tiene que ser mayor a 0 y menor o igual a 10");
			}
			else if (multiplo != 0) {
				Integer suma = 0;
				Integer numero=0;
				for (int i = 1; i <= 10; i++) {
					
				    numero = numero +multiplo;
					suma = suma + numero;
					
					if (i == 10) {
						System.out.print(numero + " = ");
					}
					else {
						System.out.print(numero + " + ");
					}
				}
				System.out.println(suma);
			}
			
		}
		while(multiplo != 0);
			
		scanner.close();
		*/
	}
}
