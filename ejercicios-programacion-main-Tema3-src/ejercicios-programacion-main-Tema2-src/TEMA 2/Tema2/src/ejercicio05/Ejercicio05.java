package ejercicio05;

public class Ejercicio05 {
	

	public static void main(String[] args) {
		
				
		int resultadoSuma = 0; // acumular� las sumas parciales
		int contador = 1;
		while(contador <= 10000) {	 // Iteramos 10.000 veces	
			resultadoSuma += contador; // resultadoSuma = resultadoSuma + contador;
			contador++; // contador = contador + 1;
		}
						
		System.out.println("La suma de todos los n�meros desde el 1 al 10000 es: " + resultadoSuma);
		
		/* Otra forma:
		 * Bucle para sumar todos los n�meros del 1 al 10000
        for (int i = 1; i <= 10000; i++) {
            suma += i;
        }

         Mostrar la suma total
        System.out.println("La suma de los n�meros del 1 al 10,000 es: " + suma);
		 */
	}		

}
