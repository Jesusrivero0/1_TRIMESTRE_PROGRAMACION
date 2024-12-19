package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Integer num;
		do {
			System.out.println("Dame un número mayor a 0");
			num = scanner.nextInt();
		}while (num <= 0);
		
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		scanner.close();		
	}

	
}
