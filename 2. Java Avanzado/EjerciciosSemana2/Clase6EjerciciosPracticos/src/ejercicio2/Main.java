package ejercicio2;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		RegistroMascotas registro = new RegistroMascotas();

		registro.agregarMascota(registro.generarDatosAleatorios());
		registro.agregarMascota(registro.generarDatosAleatorios());
		registro.agregarMascota(registro.generarDatosAleatorios());
		registro.agregarMascota(registro.generarDatosAleatorios());
		
		// Buscar mascotas por nombre
		List<Mascota<?>> mascotasPorNombre = registro.buscar("Max", "nombre");
		//List<Mascota<?>> mascotasPorNombre = registro.busqueda("Max");
		System.out.println("Mascotas encontradas por nombre:");
		mascotasPorNombre.forEach(m -> System.out.println(m.getNombre() + " - " + m.getEspecie()));
		
		// Buscar mascotas por especie
		List<Mascota<?>> mascotasPorEspecie = registro.buscar("Gato", "especie");
		//List<Mascota<?>> mascotasPorEspecie = registro.busqueda("Gato");
		System.out.println("Mascotas encontradas por especie:");
		mascotasPorEspecie.forEach(m -> System.out.println(m.getNombre() + " - " + m.getEspecie()));
		
		// Cantidad total de mascotas
        System.out.println("Cantidad total de mascotas registradas: " + registro.cantidadTotalMascotas());
	}
}
