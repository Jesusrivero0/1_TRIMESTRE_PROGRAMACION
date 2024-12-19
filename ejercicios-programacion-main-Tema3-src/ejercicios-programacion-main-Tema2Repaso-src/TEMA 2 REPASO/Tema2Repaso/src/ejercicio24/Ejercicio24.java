package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {


	public static void main(String[] args) {
		Integer numero = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Dame un número mayor a 0");
			numero = scanner.nextInt();
		} while(numero <= 0);
				
		
		Integer suma = 0;
		for (int i = 1; i <= numero; i++) {
			if (i%2==1) { // es impar, i % 2 != 0				
				suma = suma + i; // suma +=i;
			}
		}
		scanner.close();
		System.out.println("La suma de los números impares del 1 al "+ numero + " es " + suma);				
	}	
}
