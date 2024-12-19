package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		//Declaramos las variables fuera del do, para que en la condicion del while puedan ser accesibles.
		int num1;
		int num2;  //int num1, num2;

		
		do {
		
		System.out.println("Introduzca un primer n�mero: ");
		
		num1 = scanner.nextInt();  // capturamos el primer n�mero por pantalla
		
		System.out.println("Introduzca otro n�mero: ");
		
		num2 = scanner.nextInt();  // capturamos el segundo n�mero por pantalla
		
		if(num1!=num2)// En el caso de que sean distintos, mostramos un mensaje por pantalla
			System.out.println("Los n�meros " + num1 + " y " + num2 + " son distintos");
				
		}while(num1!=num2); // mientras que los dos n�meros sean distintos, se vuelve a ejecutar el do.
		
		System.out.println("Hasta luego! Los n�meros " + num1 + " y " + num2 + " son iguales.");
		scanner.close();
		*/
		
		//otra forma:
		Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
		
		while (true) {
            // Solicitar dos n�meros al usuario
            System.out.print("Introduce el primer n�mero: ");
            numero1 = scanner.nextInt();
            
            System.out.print("Introduce el segundo n�mero: ");
            numero2 = scanner.nextInt();

            // Comparar los n�meros
            if (numero1 == numero2) {
                System.out.println("Los n�meros son iguales. �Saludos!");
                break;  // Salir del bucle si los n�meros son iguales
            } else {
                System.out.println("Los n�meros no son iguales. Por favor, int�ntalo de nuevo.");
            }
        }
		 scanner.close();  // Cerrar el esc�ner
		
		
	}

}


