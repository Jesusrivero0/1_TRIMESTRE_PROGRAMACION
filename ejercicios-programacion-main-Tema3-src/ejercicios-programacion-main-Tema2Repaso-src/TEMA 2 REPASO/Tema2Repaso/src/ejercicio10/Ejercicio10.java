package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	private static final String PUNTO = ".";
	private static final String BARRAS = "://";

	public static void main(String[] args) {
	          		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba una url: ");
		String url = scanner.nextLine();		
			
		int indiceProtocolo= url.indexOf(BARRAS);  // guarda el indice donde comienza ://
		
		int indicePPunto= url.indexOf(PUNTO);  // Guarda el indice del primer punto
		
		int indiceUPunto= url.lastIndexOf(PUNTO); //Guarda el indice del segundo punto		
		
		if(indiceProtocolo!= -1 && indicePPunto != -1 && indiceUPunto!=indicePPunto)  //�Y si solo hay un punto?
		{			
			System.out.println(url.substring(0,indiceProtocolo +3));
			System.out.println(url.substring(indiceProtocolo +3, indicePPunto));
			System.out.println(url.substring(indicePPunto +1 , indiceUPunto));
			System.out.println(url.substring(indiceUPunto +1));
			
		}
		else
			System.out.println("La cadena no cumple el formato correcto");		
		
		scanner.close();
		
		
		//2 forma
		/*  Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una direcci�n web en el formato   PROTOCOLO://PARTE1.PARTE2.PARTE3: ");
        String url = scanner.nextLine().trim();

        // Verificar que la URL contiene '://'
        int protocoloEndIndex = url.indexOf(BARRAS);
        if (protocoloEndIndex == -1) {
            System.out.println("Formato de URL incorrecto 1.");
            scanner.close();
            return;
        }

        // Obtener el protocolo
        String protocolo = url.substring(0, protocoloEndIndex + 3);
        String resto = url.substring(protocoloEndIndex + 3);

        // Dividir el resto en partes usando el punto como separador
       
        String[] partes = resto.split(PUNTO);
     
        if (partes.length <= 2) {
            System.out.println("Formato de URL incorrecto. Es necesario dos puntos");
            scanner.close();
            return;
        }

        // Imprimir el protocolo
        System.out.println(protocolo);

        // Imprimir cada parte
        for (String parte : partes) {
            System.out.println(parte);
        }

        scanner.close();*/
	}
	
}
