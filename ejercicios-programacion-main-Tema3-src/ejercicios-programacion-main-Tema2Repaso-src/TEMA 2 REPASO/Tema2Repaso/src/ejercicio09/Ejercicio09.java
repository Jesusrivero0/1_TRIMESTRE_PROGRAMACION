package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	private static final String ADIOS = "adios";
	private static final String HASTA_LUEGO = "hasta luego";
	private static final String HOLA = "hola";

	public static void main(String[] args) {
		
		//1.-  solicitamos texto al usuario		
				Scanner scanner = new Scanner(System.in);
				
				boolean repetir=false;
				
				do {		
				
				System.out.println("Escribe el mensaje:");
				String texto = scanner.nextLine();
				
				//2.- si lo hemos entendido.
				
				if(texto.startsWith(HOLA) && texto.endsWith(HASTA_LUEGO))
				{
				
					String mensaje=texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(HASTA_LUEGO));
					System.out.println("Lo he entendido.  Mensaje: " + mensaje.trim());
					repetir = true;
					
				}
				else if(texto.startsWith(HOLA) && texto.endsWith(ADIOS))
				{
					String mensaje=texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(ADIOS));
					System.out.println("Lo he entendido.  Mensaje: " + mensaje.trim());
					repetir = false;
				}
				else // 3.- no lo hemos entendido
				{
					System.out.println("Lo siento, no he entendido el mensaje");
					repetir = true;
				}
				
				}while(repetir);	
				
				scanner.close();
		
				/*
		Scanner scanner = new Scanner(System.in);
        String texto;

        while (true) {
            System.out.print("Introduce un texto: ");
            texto = scanner.nextLine().trim();

            if (texto.startsWith(HOLA) && texto.endsWith(HASTA_LUEGO)) {
                // Eliminamos "hola" al inicio y "hastaluego" al final, y luego hacemos trim para eliminar espacios
            	String mensaje = texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(HASTA_LUEGO)).trim();
                System.out.println("Lo he entendido. Mensaje: " + mensaje);
                // Volvemos a pedir otro texto
            } else if (texto.startsWith(HOLA) && texto.endsWith(ADIOS)) {
                // Eliminamos "hola" al inicio y "adi�s" al final, y luego hacemos trim para eliminar espacios
            	String mensaje=texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf(ADIOS));
    			System.out.println("Lo he entendido. Mensaje: " + mensaje);
                System.out.println("Hasta luego!");
                break;
            } else {
                System.out.println("No lo he entendido. Por favor, repitelo.");
            }
        }

        scanner.close();
		
		*/
	
	}

}
