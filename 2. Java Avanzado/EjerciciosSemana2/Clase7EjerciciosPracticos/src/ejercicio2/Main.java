package ejercicio2;

import java.util.Scanner;

public class Main {
	/*
	 * Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la
	 * recursividad para crear una estructura jerárquica de tareas. Cada tarea puede
	 * tener subtareas asociadas, y estas subtareas también pueden tener sus propias
	 * subtareas, creando así una estructura de "árbol de tareas".
	 * 
	 * El programa debe permitir al usuario agregar tareas principales y subtareas
	 * de manera recursiva. Además, debe ofrecer la capacidad de visualizar la
	 * estructura completa de tareas con sus respectivas subtareas.
	 */
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del proyecto:");
		String nombreProyecto = scanner.next();
		Tarea proyecto = new Tarea(nombreProyecto);
		scanner.nextLine();

		agregarTarea(proyecto);

		System.out.println("\nEstructura del proyecto:");
		proyecto.mostrar(0);
		scanner.close();

	}

	private static void agregarTarea(Tarea tareaPadre) {
		while (true) {
			System.out.println(
					"Ingrese el nombre de la tarea (o 'fin' para terminar esta sección):" + tareaPadre.getNombre());
			String nombreTarea = scanner.nextLine();
			if (nombreTarea.equalsIgnoreCase("fin")) {
				break;
			}

			Tarea nuevaTarea = new Tarea(nombreTarea);
			tareaPadre.agregarSubtarea(nuevaTarea);

			System.out.println("¿Desea agregar subtareas a '" + nombreTarea + "'? (s/n):");
			String respuesta = scanner.nextLine();
			if (respuesta.equalsIgnoreCase("s")) {
				agregarTarea(nuevaTarea);
			}
		}
	}
}
