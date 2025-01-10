package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String llamada = getMinusculas (" Pepe ");
		System.out.println(llamada);
		
	}

	public static String getMinusculas (String minusculas) {
		return minusculas.trim().toLowerCase();
	}
}
