package Ejercicio9;

public class ArrayUtils {

	public static void imprimirArray(String[] palabra) {
		for (String dato : palabra) {
			System.out.println(dato);
		}
	}

	public static String obtenerPalabra(String[] palabra, Integer n) {

		String respuesta = palabra[n];
		
		if (n >= palabra.length || n < 0) {
			return("");
		}
		return respuesta;
	}
}
