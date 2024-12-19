package ejercicio05;

public class Ejercicio05 {
	

	public static void main(String[] args) {
		
				
		int resultadoSuma = 0; // acumulará las sumas parciales
		int contador = 1;
		while(contador <= 10000) {	 // Iteramos 10.000 veces	
			resultadoSuma += contador; // resultadoSuma = resultadoSuma + contador;
			contador++; // contador = contador + 1;
		}
						
		System.out.println("La suma de todos los números desde el 1 al 10000 es: " + resultadoSuma);
		
		/* Otra forma:
		 * Bucle para sumar todos los números del 1 al 10000
        for (int i = 1; i <= 10000; i++) {
            suma += i;
        }

         Mostrar la suma total
        System.out.println("La suma de los números del 1 al 10,000 es: " + suma);
		 */
	}		

}
