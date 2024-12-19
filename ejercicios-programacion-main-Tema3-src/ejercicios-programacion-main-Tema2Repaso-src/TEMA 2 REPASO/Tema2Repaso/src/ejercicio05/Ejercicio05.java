package ejercicio05;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			if (i==20) { // cuando sea el último número, el 20, no ponemos el subrayado detrás
				System.out.print(i);
			}
			else {
				System.out.print(i + "_");  // ponemos el número con el subrayado
			}
		}
		
		
		//OTRA FORMA. Escribimos hasta el número 19_ y al final escribimos el último número
		/*
		int i;
		for (i = 1; i <= 19; i++) {
			System.out.print(i + "_");
		}
		System.out.print(i);
		*/
	}

}

