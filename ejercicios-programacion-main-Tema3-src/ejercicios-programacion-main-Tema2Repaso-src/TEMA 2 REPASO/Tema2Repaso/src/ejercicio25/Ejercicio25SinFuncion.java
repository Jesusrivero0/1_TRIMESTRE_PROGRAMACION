package ejercicio25;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25SinFuncion {

	// Declaramos constante para estas palabras que usaremos en varios lugares y no cambian nunca
	private static final String PIEDRA = "piedra";
	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. Obtenemos la jugada del usuario por teclado. Lo hacemos llamando a un m�todo que lo soluciones
		
		Boolean opcionCorrecta = true;
		String opcionUsuario;
		
		do { // hacemo do/while para seguir pidiendo al usuario la jugada hasta que no la escriba correctamente 
			
			System.out.println("Piedra, papel, tijeras... un, dos, tres... ya!!");
			opcionUsuario = scanner.nextLine();
			// Miramos si lo que ha escrito el usuario es una de las opciones aceptadas
			if (opcionUsuario.equalsIgnoreCase(PIEDRA)
				|| opcionUsuario.equalsIgnoreCase(PAPEL) 
				|| opcionUsuario.equalsIgnoreCase(TIJERAS)) {
				opcionCorrecta = true;
			}
			else { // Si no lo es, ponemos opcionCorrecta a false para que el bucle se repita
				opcionCorrecta = false;
				System.out.println("Tu opci�n no es correcta. Vuelve a escribir mejor.");
			}
		}while(!opcionCorrecta);
		
		
		
		// 2. Obtenemos la jugada de la m�quina de forma aleatoria. Lo hacemos en un m�todo aparte
		
		String jugadaMaquina = "";
		Random random = new Random();
		// Esto genera un aleatorio entre 0 y 2 (0, 1, 2)
		Integer aleatorio = random.nextInt(3);
		// Preguntamos por el aleatorio para asignarle a cada n�mero un valor (piedra/papel/tijera)
		
		if(aleatorio==0) {
			jugadaMaquina = PIEDRA; 
		}
		else if(aleatorio==1) {
			jugadaMaquina = PAPEL;
		}
		if(aleatorio==2) { 
			jugadaMaquina = TIJERAS;			
		}
		System.out.println("Yo saco " + jugadaMaquina);
		
		
		// 3. Ya tenemos la jugada de la m�quina y del usuario. Ahora comparamos ambas para saber qui�n gana/pierde
		if (opcionUsuario.equalsIgnoreCase(jugadaMaquina)) {
			System.out.println("Hemos empatado"); // si son iguales, es que han empatado
		}
		else if ( (opcionUsuario.equalsIgnoreCase(PAPEL) && jugadaMaquina.equalsIgnoreCase(PIEDRA)) 
				|| (opcionUsuario.equalsIgnoreCase(TIJERAS) && jugadaMaquina.equalsIgnoreCase(PAPEL))
				|| (opcionUsuario.equalsIgnoreCase(PIEDRA) && jugadaMaquina.equalsIgnoreCase(TIJERAS))) {
			// estos ser�an todos los posibles casos en el que el jugado gana. Los preguntamos todos con un OR
			System.out.println("T� ganas!!");
		}
		else {
			// si llegamos aqu�, ser� porque el jugador pierde
			System.out.println("T� pierdes!!");
		}
		
		// cerramos scanner
		scanner.close();
				
	}

	
}
