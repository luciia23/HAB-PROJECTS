package ejercicio3;

public class VariablesYOperadores {

	public static double calcularArea(double base, double altura) {
		return ((base * altura) / 2);
	}

	public static void main(String[] args) {
//		Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.

		double base = 2.6;
		double altura = 7.5;

		System.out.printf("El área es: %.2f\n", calcularArea(base, altura));
	}
}
