package ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Vehiculo> vehiculos = Arrays.asList(new Vehiculo("Ford", "Fiesta", 1000),
				new Vehiculo("Ford", "Focus", 1200), new Vehiculo("Ford", "Explorer", 2500),
				new Vehiculo("Fiat", "Uno", 500), new Vehiculo("Fiat", "Cronos", 1000),
				new Vehiculo("Fiat", "Torino", 1250), new Vehiculo("Chevrolet", "Aveo", 1250),
				new Vehiculo("Chevrolet", "Spin", 2500), new Vehiculo("Toyota", "Corolla", 1200),
				new Vehiculo("Toyota", "Fortuner", 3000), new Vehiculo("Renault", "Logan", 950));

		// Lista ordenada por precio
		System.out.println("Ordenada por precio");
		vehiculos.stream().sorted(Comparator.comparing(Vehiculo::getCosto)).forEach(System.out::println);

		System.out.println("--------------");

		// Ordenar por marca y luego por precio
		System.out.println("Ordenada por marca y luego por precio");
		vehiculos.stream().sorted(Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getCosto))
				.forEach(System.out::println);

		/*
		 * Se desea extraer una lista de vehículos con precio no mayor a 1000, luego
		 * otra con precios mayor o igual 1000 y por último, obtén el promedio total de
		 * precios de toda la lista de vehículos.
		 */
		//
		System.out.println("Menor a 1000");
		vehiculos.stream().filter(v -> v.getCosto() < 1000).forEach(System.out::println);
		
		System.out.println("Mayor o igual a 1000");
		vehiculos.stream().filter(v -> v.getCosto() >= 1000).forEach(System.out::println);
		
		System.out.printf("Promedio de precios: %.2f", vehiculos.stream().mapToDouble(Vehiculo::getCosto).average().orElse(0.0));
	}
}
