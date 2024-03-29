package ejercicio1;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenter {
	
	/*
	 * A pesar de que se itera sobre una lista de 5 clientes, solo se pueden atender
	 * hasta 3 llamadas simultáneamente, ya que solo hay 3 agentes disponibles en el
	 * pool de hilos.
	 * 
	 * Si yo creo un ThreadPool de 10 (hilos disponibles),
	 * y tengo 5 Clientes, solo se crearán 5 agentes
	 */
	
	public static void main(String[] args) {
		// Se crea un ExecutorService para administrar la ejecución concurrente de
		// tareas.
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 agentes
		// Se crean los clientes que realizarán llamadas.
		List<Cliente> clientes = List.of(new Cliente("Juan"), new Cliente("Lucía"), new Cliente("Ana"),
				new Cliente("Paco"), new Cliente("María"));

		// Se itera sobre la lista de clientes para asignar tareas a los agentes.
		for (int i = 0; i < clientes.size(); i++) {
			// Se ejecuta una tarea de Agente para atender la llamada de un cliente.
			executor.execute(new Agente(clientes.get(i)));
		}
		// Se finaliza la ejecución del ExecutorService después de atender todas las
		// llamadas.
		executor.shutdown();
	}
}
