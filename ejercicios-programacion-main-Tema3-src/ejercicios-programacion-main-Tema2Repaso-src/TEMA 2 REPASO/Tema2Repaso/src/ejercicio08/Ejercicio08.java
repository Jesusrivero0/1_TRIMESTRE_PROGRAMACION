package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	private static final String HASTA_LUEGO = "hastaluego";
	private static final String HOLA = "hola";

	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
        String texto;
        
      //1.-  solicitamos texto al usuario		
      		
      		boolean repetir=false;
      		
      		do {		
      		
      		System.out.println("Escribe el mensaje:");
      		texto = scanner.nextLine();
      		
      		//2.- si lo hemos entendido.
      		
      		if( texto.startsWith(HOLA) && texto.endsWith(HASTA_LUEGO))
      		{
      		
      			String mensaje=texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(HASTA_LUEGO));
      			
      			repetir = false;
      			System.out.println("Lo he entendido.  Mensaje: " + mensaje.trim());
      		}
      		else // 3.- no lo hemos entendido
      		{
      			System.out.println("Lo siento, no he entendido el mensaje");
      			repetir = true;
      		}
      		
      		}while(repetir);	
        
        
      			/*
      		
        while (true) {
            System.out.print("Introduce un texto: ");
            texto = scanner.nextLine().trim();

            if (texto.startsWith(HOLA) && texto.endsWith(HASTA_LUEGO)) {
                // Eliminamos "hola" al inicio y "hastaluego" al final, y luego hacemos trim para eliminar espacios
                String mensaje = texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(HASTA_LUEGO)).trim();
                System.out.println("Lo he entendido. Mensaje: " + mensaje);
                break;
            } else {
                System.out.println("No lo he entendido. Por favor, rep�telo.");
            }
        }

       
		
      */
		
      		 scanner.close();
	}

}
