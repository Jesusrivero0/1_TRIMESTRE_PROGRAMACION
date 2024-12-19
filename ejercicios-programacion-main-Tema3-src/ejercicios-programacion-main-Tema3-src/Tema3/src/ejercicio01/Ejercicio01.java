package ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		
		Integer[] listaPares = new Integer[15];
		
		// Llenamos el array con los pares del 1 al 30
		Integer contador = 2;
		for (int i = 0; i < listaPares.length; i++) {
			listaPares[i] = contador;
			contador = contador + 2;
		}
		
		// Opción igual a la anterior metiendo variable contador en el for
//		for (int i = 0, contador = 2; i < listaPares.length; i++, contador+=2) {
//			listaPares[i] = contador;
//		}
		
		// Opción alternativa recorriendo los pares del 2 al 30 y calculando la posición del array
//		for (int i = 2; i <= 30; i+=2) {
//			Integer posicion = (i/2) - 1;
//			listaPares[posicion] = i;
//		}
		
		// Opción alternativa recorriendo el array y calculando el valor a partir de la posición o índice
//		for (int i = 0; i < listaPares.length; i++) {
//			listaPares[i] = (i+1)*2;
//		}
		
		System.out.println("*********************CON BUCLE FOR***********************************");
		// Imprimo el contenido del array
		for (int i = 0; i < listaPares.length; i++) {
			System.out.print(listaPares[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("*********************CON BUCLE EACHFOR***********************************");
		for (Integer num : listaPares) {
			System.out.print(num +  " ");
		}
		
	}

}
