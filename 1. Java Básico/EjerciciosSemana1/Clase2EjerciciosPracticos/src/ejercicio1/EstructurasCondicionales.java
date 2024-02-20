package ejercicio1;

import java.util.Scanner;

public class EstructurasCondicionales {
	/*
	 * a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello
	 * necesita un programa que, a partir de que un usuario ingrese su edad,
	 * determine mediante un mensaje en pantalla si la persona puede o no ingresar
	 * al evento. El programa debe mostrar (según cada caso) un mensaje informando
	 * la situación.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;

		System.out.println("Ingrese su edad");
		edad = sc.nextInt();

		if (edad < 18)
			System.out.println("No puedes entrar. No eres mayor de edad");
		else
			System.out.println("Bienvenido al evento");
		sc.close();
	}
}
