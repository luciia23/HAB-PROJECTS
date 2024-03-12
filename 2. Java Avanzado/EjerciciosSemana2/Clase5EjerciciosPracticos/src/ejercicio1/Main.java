package ejercicio1;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	/*
	 * Crea una aplicación que maneje información sobre empleados. Cada empleado
	 * tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador",
	 * "Analista", "Gerente"). Implementa las siguientes operaciones utilizando
	 * Streams y Optionals:
	 * 
	 * - Filtra los empleados cuyo salario sea mayor a cierto valor específico.
	 * 
	 * - Agrupa los empleados por categoría y calcula el salario promedio para cada
	 * categoría.
	 * 
	 * - Encuentra al empleado con el salario más alto utilizando Optionals.
	 */
	public static void main(String[] args) {
		List<Empleado> empleados = List.of(
				new Empleado("Juan", 3000, "Desarrollador"),
				new Empleado("María", 2500, "Analista"),
				new Empleado("Pedro", 4000, "Gerente"),
				new Empleado("Luis", 3500, "Desarrollador"),
				new Empleado("Ana", 2800, "Analista"));

		//Filtra los empleados cuyo salario sea mayor a cierto valor específico
		double salarioMinimo = 1500;
		System.out.println("Empleados con mayor salario que " + salarioMinimo + ": ");
		empleados.stream().filter(e -> e.getSalario() > salarioMinimo).forEach(System.out::println);
		
		//Agrupa los empleados por categoría y calcula el salario promedio para cada categoría
		Map<String, Double> mapSet = empleados.stream()
				.collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));
		System.out.println("Salario promedio por categoria" + mapSet);
		
		
		//Encuentra el empleado con el salario más alto utilizando Optionals
		Optional<Double> salarioMax = empleados.stream().map(Empleado::getSalario).max(Double::compareTo);
		
		salarioMax.ifPresentOrElse(valor -> {
			Empleado empMax = empleados.stream().filter(e -> e.getSalario() == valor).findFirst().orElse(null);
			System.out.println("El empleado con salario máximo es: " + empMax.getNombre());
		}, () -> System.out.println("Está vacío"));
	}
}
