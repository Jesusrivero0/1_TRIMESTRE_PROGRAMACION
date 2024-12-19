package ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		// N�mero de alumnos que tienen menos de un 5
		
		Integer cont =0;
		
		for(int i = 0; i< listaNotas.length; i++)
		{
			if(listaNotas[i]<5)
				cont++;			
		}
		
		System.out.println("\nTotal alumnos suspensos: " + cont);
		//con foreach
		cont=0;
		for (Integer in : listaNotas) {
			if(in<5)
				cont++;
		}
				
		
		System.out.println("\nTotal alumnos suspensos: " + cont);
	}

}
