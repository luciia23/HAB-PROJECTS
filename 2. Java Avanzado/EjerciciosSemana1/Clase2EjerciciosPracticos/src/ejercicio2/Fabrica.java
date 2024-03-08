package ejercicio2;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fabrica {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 trabajadores
		
		List<Trabajador> trabajadores = List.of(
				new Trabajador("Laura", "Ensamblar productos"),
				new Trabajador("Marcos", "Controles de calidad"),
				new Trabajador("Elena", "Embalar productos"));
		for (int i = 0; i < trabajadores.size(); i++) {
			executor.execute(trabajadores.get(i));
		}
		
		executor.shutdown();
	}
}
