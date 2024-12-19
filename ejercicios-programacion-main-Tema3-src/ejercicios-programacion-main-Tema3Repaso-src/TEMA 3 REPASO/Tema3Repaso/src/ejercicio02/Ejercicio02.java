package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		//Nota media de los aprobados
		Integer cont =0;
		Integer notas=0;
		for(int i = 0; i< listaNotas.length; i++)
		{
			if(listaNotas[i]>=5)
			{
				cont++;
				notas += listaNotas[i];
			}
		}
		System.out.println("\nNota media de aprobados: " + notas/cont);
		
	}
}
