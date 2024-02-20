package ejercicio2;

public class TiposDeDatos {
	public static void main(String[] args) {
		/*
		 * a) Crea un programa que declare una variable para cada uno de los siguientes
		 * tipos de datos: int, double, boolean y String . Asigna un valor a cada
		 * variable y muestra su contenido en la consola.
		 */

		int entero = 10;
		double decimal = 23.10;
		boolean booleano = true;
		String cadena = "Contenido";

		System.out.println("El número es:" + entero);
		System.out.println("El decimal es: " + decimal);
		System.out.println("El booleano es: " + booleano);
		System.out.println("La cadena es: " + cadena);

		/*
		 * b) Asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en
		 * un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce
		 * algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar
		 * el por qué de cada caso.
		 */

		// Errores:
		// En cada caso hay errores de compilación, ya que no se puede meter valores no
		// correspondientes a los tipos de variable
		// int entero = "Hola";
		// int entero3 = true;
		// boolean booleano2 = "verdadero";
		// boolean booleano3 = 10.6;
		// String string = 3.20;

		// Sin errores:
		// En este caso, double admite valores enteros (conversión implícita de int a
		// double)
		double decimal2 = 10;
		// Al igual que si metemos numeros seguido de comillas dobles (""), no sería un
		// error
		String string = 2.1 + "";
	}
}
