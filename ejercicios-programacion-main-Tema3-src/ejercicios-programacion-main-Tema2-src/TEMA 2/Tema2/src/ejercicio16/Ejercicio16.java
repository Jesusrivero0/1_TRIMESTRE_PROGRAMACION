package ejercicio16;

public class Ejercicio16 {
	public static void main(String[] args) {
		Integer resultadoSuma = 0;
		
		for(Integer contador = 1; contador <= 10000; contador++) {
			resultadoSuma += contador; // resultadoSuma = resultadoSuma + contador;
		}
		System.out.println("Suma total: " + resultadoSuma);
		System.out.println(resultadoSuma);
	}
}
