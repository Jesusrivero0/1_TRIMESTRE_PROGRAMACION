package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar precio y unidades al usuario
        System.out.print("Ingrese el precio por unidad: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de unidades: ");
        int unidades = scanner.nextInt();

        
        double descuento=0.0;

        // Calcular el descuento seg�n las unidades
        if (unidades > 100) {
			descuento = 40;
		}
		else if (unidades > 25) {
			descuento = 20;
		}
		else if (unidades > 10) {
			descuento = 10;
		}

        // Calcular el subtotal
        double subtotal = precio * unidades;
        // Calcular el valor del descuento y el total a pagar
        double totalDescuento = subtotal * descuento / 100;
        double total = subtotal - totalDescuento;
		
        // Mostrar resultados
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Descuento aplicado: "+ totalDescuento);
        System.out.println("Total a pagar: " + total);

        scanner.close();
	}
}
