package ejercicio3;

import java.util.Scanner;

public class Main {

	private static int[] vectorNum = new int[5];

	public static void almacenarDato(int i, int dato) {
		try {
			vectorNum[i] = dato;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Dato almacenado!");
	}

	public static void accederDato(int i) {
		try {
			int dato = vectorNum[i];
			System.out.println("Dato en el índice " + i + ": " + dato);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce un índice");
			int index = Integer.parseInt(sc.nextLine());

			System.out.println("Introduce un dato (entero)");
			int dato = Integer.parseInt(sc.nextLine());

			almacenarDato(index, dato);

			System.out.println("Introduce un índice para acceder a los datos almacenados");
			index = Integer.parseInt(sc.nextLine());
			accederDato(index);
		} catch (NumberFormatException e) {
			System.out.println("Error: Debes introducir un número entero válido.");
		} finally {
			sc.close();
		}
	}
}
