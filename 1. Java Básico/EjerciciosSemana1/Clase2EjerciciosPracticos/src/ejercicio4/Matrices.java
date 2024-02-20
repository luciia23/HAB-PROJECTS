package ejercicio4;

import java.util.Scanner;

public class Matrices {
	/*
	 * Imagina que estás trabajando en un sistema de reservas de asientos para un
	 * teatro. Crea un programa en Java que represente un mapa de asientos en una
	 * matriz de 5x5 y ten en cuenta lo siguiente:
	 * 
	 * Los asientos pueden estar ocupados (representados por "X") o vacíos
	 * (representados por "O").
	 * 
	 * Permite al usuario ingresar por teclado donde quiere sentarse, indicando su
	 * fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe
	 * marcar como ocupado ese asiento solo en caso de que esté vacío.
	 * 
	 * Si el asiento elegido por el usuario está ocupado, el sistema debe informar
	 * que elija otro diferente.
	 * 
	 * A medida que los asientos se ocupen, el programa debe actualizar el mapa de
	 * asientos y mostrarlo por pantalla luego de cada reserva.
	 * 
	 * ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera
	 * tu programa los asientos ya reservados?
	 * 
	 * El sistema deberá seguir corriendo hasta que el encargado de cargar las
	 * reservas de los asientos determine que ha finalizado.
	 */

	public static void mostrarAsientos(char[][] asientos) {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				System.out.print(asientos[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean asignarAsiento(char[][] asientos, int x, int y) {
		boolean ok = true;

		if (asientos[x][y] == 'X')
			ok = false;
		else
			asientos[x][y] = 'X';

		return ok;
	}

	public static void rellenarAsientos(char[][] asientos, char c) {
		for (int i = 0; i < asientos.length; i++)
			for (int j = 0; j < asientos[i].length; j++)
				asientos[i][j] = c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] asientos = new char[5][5];
		boolean continuar = true;
		String respuesta;
		int x, y;

		rellenarAsientos(asientos, '0');
		while (continuar) {
			System.out.println("Introduce la fila");
			x = sc.nextInt();
			System.out.println("Introduce el asiento");
			y = sc.nextInt();

			if (x < 0 || x >= asientos.length || y < 0 || y >= asientos.length) {
				System.out.println("Error: Los valores deben de estar entre 0 y 5");
				continue;
			}
			if (!asignarAsiento(asientos, x, y))
			{
				System.out.println("El asiento ya está ocupado. Elija otro");
				continue;
			}
			System.out.println("->¡Reserva realizada!");
			mostrarAsientos(asientos);
			System.out.println("->¿Desea realizar otra reserva? (si/no)");
			respuesta = sc.next();
			if (!respuesta.equalsIgnoreCase("si"))
				continuar = false;
		}

		sc.close();
	}
}
