package ejercicio07;


import java.util.Scanner;

public class Ejercicio07 {
	private static final double PRECIO_PALABRA = 0.24;
	private static final String STOP = "stop";
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un telegrama por favor");
		Scanner scanner = new Scanner(System.in);
		String telegrama = scanner.nextLine();
		
		
		String palabras[] = telegrama.split(" ");
		
		Integer cont=0;
		for(int i = 0; i< palabras.length; i++)
		{
			if(!palabras[i].equalsIgnoreCase(STOP))
			{
				cont++;
			}			
		}
			
		Double precio = cont * PRECIO_PALABRA;
		System.out.println("El precio es: " + precio);
		scanner.close();
	}
}
//SIN NOVEDADES EN EL FRENTE STOP VUELVO MAÑANA TARDE NOCHE STOP TENED PREPARADO EL PUCHERO STOP