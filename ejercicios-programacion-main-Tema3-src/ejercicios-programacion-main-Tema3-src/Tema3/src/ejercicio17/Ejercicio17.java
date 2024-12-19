package ejercicio17;


public class Ejercicio17 {
	
	public static void main(String[] args) {
	
	
		
		/*Crea un array de n�meros decimales que tenga este contenido: 5.4, 3.1, 9.0, 4.7
		Imprime el contenido del array utilizando un bucle foreach
		Luego, calcula la suma de todo el array utilizando tambi�n un bucle foreach
		*/
		
		Double[] arrayNumeros= new Double[] {5.4, 3.1, 9.0, 4.7};
		
		System.out.println("Imprimo el array");
		for (Double numero : arrayNumeros) {
			System.out.print(numero + "\t");
		}
		
		Double contador=0.0;
		for (Double numero : arrayNumeros) {
			contador+=numero;
			
		}
		System.out.println();
		System.out.println("La suma del array es: " + contador);
		
		
		
	}
	
}
