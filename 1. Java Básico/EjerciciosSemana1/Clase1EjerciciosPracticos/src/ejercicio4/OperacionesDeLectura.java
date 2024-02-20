package ejercicio4;

import java.util.Scanner;

public class OperacionesDeLectura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();

		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicación: " + (num1 * num2));
		if (num2 == 0)
			System.out.println("No se puede dividir entre 0");
		else
			System.out.println("División: " + (double) (num1 / num2));
		sc.close();
	}
}
