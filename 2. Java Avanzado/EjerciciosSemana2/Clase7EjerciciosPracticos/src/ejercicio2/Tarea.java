package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
	private String nombre;
	private List<Tarea> subtareas;

	public Tarea(String nombre) {
		this.nombre = nombre;
		this.subtareas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Tarea> getSubtareas() {
		return subtareas;
	}

	public void agregarSubtarea(Tarea subtarea) {
		subtareas.add(subtarea);
	}

	public void mostrar(int nivel) {
		if (nivel != 0) {
			for (int i = 0; i < nivel; i++) {
				System.out.print("|-- ");
			}
			System.out.println("Tarea: " + nombre);
		} else {
			System.out.println(nombre);
		}
		for (Tarea t : subtareas)
			t.mostrar(nivel + 1);
	}

}
