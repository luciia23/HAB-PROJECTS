package ejercicio1;

public class Main {
	public static void main(String[] args) {
		InventarioAutos<Auto> inventario = new InventarioAutos<Auto>();

		inventario.agregarAutos(new Auto("Toyota", "Corolla", 2021, 25000));
		inventario.agregarAutos(new Auto("Honda", "Civic", 2020, 22000));
		inventario.agregarAutos(new Auto("Toyota", "Camry", 2019, 28000));

		// Buscar autos por marca
		inventario.buscarAutos(a -> a.getMarca().equalsIgnoreCase("toyota"), "Autos Toyota");
		// Buscar autos por año
		inventario.buscarAutos(a -> a.getAnio() == 2020, "Autos 2020");

		// Calcular el valor total
		System.out.println("Valor total inventario: " + inventario.calcularValorTotal());
	}
}
