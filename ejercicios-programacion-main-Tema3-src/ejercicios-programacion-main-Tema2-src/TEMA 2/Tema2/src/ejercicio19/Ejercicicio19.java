package ejercicio19;

public class Ejercicicio19 {

	public static void main(String[] args) {

		// PRIMERA FORMA
		for (int linea = 1; linea <= 9; linea++) {
			for (int i = 1; i <= linea; i++) {
				System.out.print(i + " ");
			}
			// Despu�s de cada l�nea
			System.out.println("");
		}

		// OPCION SEGUNDA.
		/*
		String anterior = "";
		for (int linea = 1; linea <= 9; linea++) {
			anterior = anterior + linea + " ";
			System.out.println(anterior);
		}
		*/

	}
}
