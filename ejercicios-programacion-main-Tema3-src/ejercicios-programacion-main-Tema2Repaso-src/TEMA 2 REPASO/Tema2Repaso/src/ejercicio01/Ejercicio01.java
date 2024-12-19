package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static final Integer ANYO=2030; 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Cual es tu nombre?");		
		String nombre = scanner.nextLine();		
		
		System.out.println("En que año naciste?");		
		Integer anyo = scanner.nextInt();
		
		Integer edad = ANYO - anyo;
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendras " + edad + " años.");
		
		scanner.close();
	}
}
