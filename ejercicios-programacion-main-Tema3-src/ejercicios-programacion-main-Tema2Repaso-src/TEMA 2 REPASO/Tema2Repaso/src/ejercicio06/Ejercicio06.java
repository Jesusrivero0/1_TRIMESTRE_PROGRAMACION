package ejercicio06;

public class Ejercicio06 {
	public static void main(String[] args) {

			
		int numero=0;
		int cantidad =0;
		for(int j =1; j<=10;j++) {
			numero = numero+3;
			if(j==10) {
				System.out.print(numero);
			}
			else {
				System.out.print(numero + " + ");
			}
			cantidad+=numero;
		}
		System.out.print(" = " + cantidad);
		
		
		//OTRA FORMA:
		/*
		int suma = 0;

		for (int i = 3; i <= 30; i += 3) {
			System.out.print(i);
			if (i < 30) {
				System.out.print(" + ");
			}
			suma += i;
		}

		System.out.println(" = " + suma);
*/
		
	}
}
