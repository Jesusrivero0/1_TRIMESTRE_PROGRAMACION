package ejercicio14;


import java.util.Scanner;

public class Ejercicio14 {


	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String palabra = "";
		do {
			System.out.println("Dame una palabras de al menos 8 caracteres");
			palabra = scanner.nextLine();
		}
		while(palabra.length() < 8);
	
		palabra = palabra.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("t", "7");
		System.out.println("Contraseña generada: " + palabra);
		
		//tambien:
		//palabra = palabra.replace('a', '4').replace('e', '3').replace('i', '1').replace("o", "0").replace("t", "7");
		System.out.println("Contraseña generada: " + palabra);

		scanner.close();
	}
}
