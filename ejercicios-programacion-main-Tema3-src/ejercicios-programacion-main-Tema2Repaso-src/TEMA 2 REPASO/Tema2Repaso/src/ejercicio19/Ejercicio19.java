package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    private static final double PESETAS_POR_EURO = 166.386;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double euros;
		Double pesetas;

		int opcion;
	    do {
            // Mostrar el men�
            System.out.println("\n--- Conversor de Moneda ---");
            System.out.println("1 - Pasar de Pesetas a Euros");
            System.out.println("2 - Pasar de Euros a Pesetas");
            System.out.println("3 - Salir");
            System.out.print("Selecciona una opci�n: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                    // Conversi�n de Pesetas a Euros
                    System.out.print("Introduce la cantidad en pesetas: ");
                    pesetas = scanner.nextDouble();
                    euros = pesetas / PESETAS_POR_EURO;
                    System.out.println("son " + euros + " euros");
                   
            } else if (opcion == 2) {
                    // Conversi�n de Euros a Pesetas
                    System.out.print("Introduce la cantidad en euros: ");
                    euros = scanner.nextDouble();
                    pesetas = euros * PESETAS_POR_EURO;
                    System.out.println("son " + pesetas + " pesetas");
                   

            } else if (opcion == 3) {
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                 

            } else {
                    System.out.println("Opci�n no v�lida. Por favor, selecciona una opci�n del men�.");
            }

        } while (opcion != 3);

        scanner.close();

	}

}