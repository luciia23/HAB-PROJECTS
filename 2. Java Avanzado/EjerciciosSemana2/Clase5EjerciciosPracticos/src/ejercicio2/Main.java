package ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	/*
	 * Imagina que estás construyendo una aplicación para gestionar eventos en una
	 * agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo,
	 * "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
	 * utilizando Streams y Optionals:
	 * 
	 * Filtra los eventos que están programados para una fecha específica.
	 * 
	 * Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada
	 * categoría.
	 * 
	 * Encuentra el evento más próximo en el tiempo utilizando Optionals.
	 */
	public static void main(String[] args) {
		List<Evento> eventos = Arrays.asList(
				new Evento("Reunión", LocalDate.of(2024, 3, 10), "Trabajo"),
				new Evento("Conferencia", LocalDate.of(2024, 3, 11), "Educación"),
				new Evento("Taller", LocalDate.of(2024, 3, 12), "Educación"),
				new Evento("Presentación", LocalDate.of(2024, 3, 10), "Trabajo"),
				new Evento("Fiesta", LocalDate.of(2024, 3, 11), "Social"));

		//Filtra los eventos que están programados para una fecha específica.
		LocalDate fechaEspecifica = LocalDate.of(2024, 3, 10);
		eventos.stream().filter(e -> e.getFecha().equals(fechaEspecifica))
				.forEach(e -> System.out.println(e.getNombre()));
		
		//Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
		Map<String, Long> mapSet = eventos.stream()
				.collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
		System.out.println(mapSet);

		//Encuentra el evento más próximo en el tiempo utilizando Optionals.
		LocalDate fechaActual =  LocalDate.of(2024, 3, 10);
		eventos.stream().sorted(Comparator.comparing(p -> p.getFecha()))
		.filter(e -> e.getFecha().isAfter(fechaActual))
		.findFirst()
		.ifPresentOrElse(e -> System.out.println("Evento: " + e.getNombre()),
						() -> System.out.println("No hay eventos"));
	}
}
