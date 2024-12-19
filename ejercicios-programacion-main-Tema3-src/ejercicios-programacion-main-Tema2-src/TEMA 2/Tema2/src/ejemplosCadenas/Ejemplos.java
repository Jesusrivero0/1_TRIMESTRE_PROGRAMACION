package ejemplosCadenas;

public class Ejemplos {

	
	public static void main(String[] args) {
	
		String cadena = "El perro de San Roque ";
		
		System.out.println("La cadena tiene: " + cadena.length() + " caracteres");

		String sinEspaciosInicioFin = cadena.trim();
		System.out.println("La cadena sin espacios al inicio ni final : " + sinEspaciosInicioFin);
		
		System.out.println("La cadena tiene ahora : " + sinEspaciosInicioFin.length() + " caracteres");
				
		System.out.println("La cadena en may�sculas: " + cadena.toUpperCase());
		
		System.out.println("La cadena en min�sculas: " + cadena.toLowerCase());
		
		String repetidaTresVeces = cadena.repeat(3);
		System.out.println("La cadena repetida tres veces: " + repetidaTresVeces);
		
		String desdeLaPEnAdelante = cadena.substring(3); // ojo, empieza por cero
		System.out.println(desdeLaPEnAdelante);
		
		String desdeLaLHastaLaErre = cadena.substring(1,16); // desde la l hasta la R
		System.out.println(desdeLaLHastaLaErre);
		
		String cambiandoEresPorT = cadena.replaceAll("r", "t");  // reemplazamos
		System.out.println("Cambiamos la r por t:" + cambiandoEresPorT);
		
		Integer longitud = cadena.length();  // longitud
		System.out.println("La longitud de la cadena: " + longitud);
		
		Integer posicionDeLaPrimerae = cadena.indexOf("e");  // primera posicion de la e
		System.out.println("La primera posici�n de la e: " + posicionDeLaPrimerae);
		
		Integer posicionDeLaUltimae = cadena.lastIndexOf("e"); // ultima posicion de la e
		System.out.println("La �ltima posici�n de la e: " + posicionDeLaUltimae);
		
		Integer posicionDeLaPrimerarDesdeLaI = cadena.indexOf("e", 8);    //La primera posicion de la e desde la posicion 8
		System.out.println("La primera posici�n de la e desde la posici�n 8: " +  posicionDeLaPrimerarDesdeLaI);
		
		Boolean contienesan = cadena.contains("san");
		System.out.println("�Contiene san? " +  contienesan);
		
		Boolean contieneSan = cadena.contains("San");
		System.out.println("�Contiene San? " +  contieneSan);
		
		
		String ej = "ejemplo";		
		Boolean sonIguales = ej.equals("Ejemplo");		
		System.out.println("�son iguales? " +  sonIguales);
		
		Boolean sonIgualesIgnorandoMinMay = ej.equalsIgnoreCase("Ejemplo");
		System.out.println("�son iguales? " + sonIgualesIgnorandoMinMay);
		
		
		// Diferencia entre isEmpty() y isBlank()
		//caso 1.		
		System.out.println("�La cadena esta vacia?: " + cadena.isEmpty()); //cuando tienen valor la funcionalidad es la misma.		
		System.out.println("�La cadena es nula?: " + cadena.isBlank());
		
		//caso 2. Cadena con espacios
				
		String blanco=" ";		
		System.out.println("�La cadena esta vacia?" + blanco.isEmpty());  // si est� vacia.
		System.out.println("�La cadena esta vacia?" + blanco.isBlank()); // solo tiene espacios en blanco
		
		
		//comparaciones con cadenas
		System.out.println("*********** comparaciones **************");
		//caso 1.
		
		String m1="M";  //cod ascii M: 77
		String m2="m";  //cod ascii m: 109		
		
		// Las letras mayúsculas tienen un valor Unicode menor que las minúsculas, por lo que "Manzana".compareTo("manzana") devolverá un número negativo.
		System.out.println("�Es mayor m1?: " + m1.compareTo(m2)); //-32. Como es menor que 0, no es mayor. (resta codigos asci)
		if(m1.compareTo(m2)>0)
			System.out.println("La cadena " + m1 + " es mayor que " + m2);
		else if(m1.compareTo(m2)<0)
			System.out.println("La cadena " + m1 + " es menor que " + m2);
		else
			System.out.println("La cadena " + m1 + " es igual que " + m2);
		
		System.out.println("*****************************************"); 
		
		//caso 2
		m1="palo";  //cod ascii o: 111
		m2="pala";  //cod ascii a: 97
		
		System.out.println("�Es mayor palo?: " + m1.compareTo(m2)); //14. Como es mayor que 0, s� es mayor. (resta codigos asci)
		if(m1.compareTo(m2)>0)
			System.out.println("La cadena " + m1 + " es mayor que " + m2);
		else if(m1.compareTo(m2)<0)
			System.out.println("La cadena " + m1 + " es menor que " + m2);
		else
			System.out.println("La cadena " + m1 + " es igual que " + m2);
		
		// comparamos m2 con m1
		System.out.println("�Es mayor pala?: " + m2.compareTo(m1)); // -14. Como es menor que 0, no es mayor, es menor. (resta codigos asci)
		
		if(m2.compareTo(m1)>0)
			System.out.println("La cadena " + m2 + " es mayor que " + m1);
		else if(m2.compareTo(m1)<0)
			System.out.println("La cadena " + m2 + " es menor que " + m1);
		else
			System.out.println("La cadena " + m2 + " es igual que " + m1);
		
		
		
		String palabra = "PROGRAMACION";
		
		System.out.println("El primer caracter es: " + palabra.charAt(0));
		System.out.println("El caracter de la posicion 4: " + palabra.charAt(4));
		
		
	}
}
