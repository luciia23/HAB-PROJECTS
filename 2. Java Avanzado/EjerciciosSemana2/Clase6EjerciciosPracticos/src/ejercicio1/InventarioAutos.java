package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* 1. **Agregar Autos al Inventario:** Utiliza un método genérico para agregar
* autos al inventario de la concesionaria.
* 
* 2. **Buscar Autos por Marca o Año:** Implementa métodos genéricos que
* permitan buscar autos por marca o año dentro del inventario.
* 
* 3. **Calcular el Valor Total del Inventario:** Desarrolla un método genérico
* que calcule el valor total de todos los autos en el inventario.*/

public class InventarioAutos<T extends Auto> {
	private List<T> listaAutos;

	public InventarioAutos() {
		this.listaAutos = new ArrayList<>();
	}

	public void agregarAutos(T auto) {
		listaAutos.add(auto);
		System.out.println("Se ha añadido el auto: " + auto.getMarca());
	}

	public void buscarAutos(Predicate<Auto> filtro, String filter) {
		List<Auto> lista = listaAutos.stream().filter(filtro).collect(Collectors.toList());
		for (Auto a : lista) {
			System.out.println("Autos por : " + filter);
			System.out.println(a.toString());
		}
	}

	public double calcularValorTotal() {
		return listaAutos.stream().mapToDouble(Auto::getPrecio).sum();
	}
}