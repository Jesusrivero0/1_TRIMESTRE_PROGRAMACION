package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String llamada = getMayusculas(" Hola ");
		System.out.println(llamada);
	}
	public static String getMayusculas (String parametros) {
		return parametros.trim().toUpperCase();
	}
}
