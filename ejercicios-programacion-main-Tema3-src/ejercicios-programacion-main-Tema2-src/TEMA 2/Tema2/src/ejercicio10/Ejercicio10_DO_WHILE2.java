package ejercicio10;

import java.util.Scanner;

public class Ejercicio10_DO_WHILE2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String cadena1;
        String cadena2;

        // Solicitar la primera cadena hasta que no esté vacía o sólo tenga espacios
        do {
            System.out.print("Introduce la primera cadena: ");
            cadena1 = scanner.nextLine();  
        } while (cadena1.isBlank());

        // Solicitar la segunda cadena hasta que no esté vacía o sólo tenga espacios
        do {
            System.out.print("Introduce la segunda cadena: ");
            cadena2 = scanner.nextLine(); 
        } while (cadena2.isBlank());

        // Imprimir las cadenas en orden alfabético
        if (cadena1.compareTo(cadena2) <= 0) {
            System.out.println("Orden alfabético:");
            System.out.println(cadena1);
            System.out.println(cadena2);
        } else {
            System.out.println("Orden alfabético:");
            System.out.println(cadena2);
            System.out.println(cadena1);
        }

        scanner.close();  // Cerrar el escáner
	}	
}
