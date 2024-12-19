package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		System.out.println("¿Qué nota estas buscando?");
		Integer nota = scanner.nextInt();
		scanner.close();
		
		//Buscar una nota
		Integer posicion=0;
		boolean encontrada=false;
		for(int i = 0; i< listaNotas.length; i++)
		{
			if(listaNotas[i]==nota)
			{
				posicion = i;
				encontrada = true;
				break;				
			}
			
		}
		if(encontrada)
			System.out.println("\nLa nota buscada existe y está en la posición " + posicion);
		else
			System.out.println("\nLa nota buscada no existe");
		
	}

}
