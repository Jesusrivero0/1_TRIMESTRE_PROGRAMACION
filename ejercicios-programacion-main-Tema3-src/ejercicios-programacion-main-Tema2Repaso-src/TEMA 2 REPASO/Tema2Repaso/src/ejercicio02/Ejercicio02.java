package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar tres nombres de ciudades al usuario
		System.out.print("Introduce el primer nombre de ciudad: ");
		String ciudad1 = scanner.nextLine().trim();

		System.out.print("Introduce el segundo nombre de ciudad: ");
		String ciudad2 = scanner.nextLine().trim();

		System.out.print("Introduce el tercer nombre de ciudad: ");
		String ciudad3 = scanner.nextLine().trim();

		// calculamos la longitud de cada ciudad
		Integer long1 = ciudad1.length();  
		Integer long2 = ciudad2.length();  
		Integer long3 = ciudad3.length();  

		
		if (long1 >= long2 && long2 >= long3) // Ej: 10 5 2
		{
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
		} else if (long1 >= long3 && long3 >= long2) // Ej: 10 2 5
		{

			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
		} else if (long2 >= long1 && long1 >= long3)// Ej: 5 10 2
		{
			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
		} else if (long3 >= long1 && long1 >= long2)// EJ: 5 2 10
		{
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		}else if (long2 >= long3 && long3 >= long1)// EJ: 2 10 5
		{
			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
		} 
		else // EJ: 2 5 10
		{
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);
		}
		scanner.close();

		
		// 2 OTRA FORMA
		/*
		String primero, segundo, tercero;
		if (ciudad1.length() <= ciudad2.length() && ciudad1.length() <= ciudad3.length()) {
			primero = ciudad1;
			if (ciudad2.length() <= ciudad3.length()) {
				segundo = ciudad2;
				tercero = ciudad3;
			} else {
				segundo = ciudad3;
				tercero = ciudad2;
			}
		} else if (ciudad2.length() <= ciudad1.length() && ciudad2.length() <= ciudad3.length()) {
			primero = ciudad2;
			if (ciudad1.length() <= ciudad3.length()) {
				segundo = ciudad1;
				tercero = ciudad3;
			} else {
				segundo = ciudad3;
				tercero = ciudad1;
			}
		} else {
			primero = ciudad3;
			if (ciudad1.length() <= ciudad2.length()) {
				segundo = ciudad1;
				tercero = ciudad2;
			} else {
				segundo = ciudad2;
				tercero = ciudad1;
			}
		}

		// Mostrar las ciudades ordenadas
		System.out.println("\nCiudades ordenadas por longitud:");
		System.out.println(primero);
		System.out.println(segundo);
		System.out.println(tercero);

		// Cerrar el esc�ner
		scanner.close();
*/
	}

}
