package ejercicio3;

import java.util.Scanner;

public class Vectores {

	/*
	 * Una web de meteorología necesita de un programa que, al ingresar las 7
	 * temperaturas máximas de la última semana, calcule la temperatura máxima
	 * promedio que hubo.
	 * 
	 * Para ello, deberá manejar un vector donde en cada posición se almacene la
	 * correspondiente temperatura máxima de cada día. Una vez almacenadas las
	 * temperaturas, deberá calcular el promedio de las mismas recorriendo el vector
	 * y mostrando el resultado por pantalla.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] tempMaximas = new double[7];
		double	suma = 0;
		
		for(int i = 0; i < tempMaximas.length; i++) {
			System.out.println("Introduce una temperatura máxima");
			tempMaximas[i] = sc.nextDouble();
			suma += tempMaximas[i];
		}
		
		System.out.printf("El promedio es %2.f\n", (suma / tempMaximas.length));
		
		sc.close();
	}
}
