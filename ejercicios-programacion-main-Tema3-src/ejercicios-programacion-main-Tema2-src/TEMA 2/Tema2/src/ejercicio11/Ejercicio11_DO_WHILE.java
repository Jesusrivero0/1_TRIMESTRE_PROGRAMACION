package ejercicio11;

import java.util.Scanner;

public class Ejercicio11_DO_WHILE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email;
		Boolean emailValido=true;
		do {
			System.out.println("Dame un email");
			email = scanner.nextLine();
			
			// 1. Contiene @ ??
			// 2. Contiene solo una @??
			// 3. Contiene @. ??
			// 4. Termina en . ??
			// 5. Tiene un . después de @ ??
				// a) Obtener subcadena (desde @ hasta el final)
					// a.1) Obtener índice de @
					// a.2) Obtener subcadena del índice obtenido +1
				// b) Mirar si la subcadena contiene un .
			Integer indiceArroba = email.indexOf("@");
			String subcadena = email.substring(indiceArroba + 1);
			
			if (!email.contains("@")){
				emailValido = false;
				System.out.println("El email tiene que tener una @");
			}
			else if(subcadena.contains("@"))
			{
				emailValido = false;
				System.out.println("El email sólo puede contener una @");
			}			
			else if (email.contains("@.")){
				emailValido = false;
				System.out.println("El email no puede contener @.");
			}
			else if (email.endsWith(".")) {
				emailValido = false;
				System.out.println("El email no puede terminar en .");
			}
			else if (!subcadena.contains(".")) {
				emailValido = false;
				System.out.println("El email no tiene un . después de la @");
			}
		}
		while(!emailValido);
		
		System.out.println("Email correcto");
		scanner.close();
	}

}
