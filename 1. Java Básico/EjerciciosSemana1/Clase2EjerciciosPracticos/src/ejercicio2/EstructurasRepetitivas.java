package ejercicio2;

import java.util.Scanner;

public class EstructurasRepetitivas {
	/*
	 * a) Imagina que eres un cajero en un supermercado. Crea un programa en Java
	 * que permita ingresar el precio de varios productos comprados por un cliente.
	 * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo
	 * precios hasta que el usuario decida finalizar. Luego, muestra el total de la
	 * compra que debe abonar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double suma = 0;
		double resp = 0;
		boolean continuar = true;

		while (continuar) {
			System.out.println("Introduce el precio del producto. Si no quiere continuar introduce 0");
			resp += sc.nextDouble();
			if (resp == 0)
				continuar = false;
			else
				suma += resp;
		}

		System.out.println("La suma de los productos es: " + suma);

		sc.close();
	}
}
