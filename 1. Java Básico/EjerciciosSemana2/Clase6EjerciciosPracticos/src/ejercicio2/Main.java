package ejercicio2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<>();

		productos.add(new Producto(1, "Teléfono", "Samsung", "Electrónico", 300, 499.9, 20));
		productos.add(new Producto(2, "Laptop", "HP", "Computadora", 600, 999.1, 15));
		productos.add(new Producto(3, "Auriculares", "Sony", "Accesorio", 52.1, 80, 50));
		productos.add(new Producto(4, "Cargador", "Apple", "Accesorio", 20, 39.2, 100));
		productos.add(new Producto(5, "Tablet", "Lenovo", "Electrónico", 200, 300.9, 10));
		productos.add(new Producto(6, "Televisor", "LG", "Electrónico", 402.4, 600, 25));
		productos.add(new Producto(7, "Impresora", "Epson", "Electrónico", 152.9, 250, 5));
		productos.add(new Producto(8, "Mouse", "Logitech", "Accesorio", 10, 20.04, 30));
		productos.add(new Producto(9, "Teclado", "Microsoft", "Accesorio", 15, 25.5, 40));
		productos.add(new Producto(10, "Monitor", "AOC", "Electrónico", 100.1, 200.6, 12));

		Producto pMayorVenta = productos.get(0);
		Producto pMayorCosto = productos.get(0);
		Producto pMayorCantidad = productos.get(0);
		for (Producto p : productos) {
			if (p.getPrecioVenta() > pMayorVenta.getPrecioVenta())
				pMayorVenta = p;
			if (p.getPrecioCosto() > pMayorCosto.getPrecioCosto())
				pMayorCosto = p;
		}
		System.out.println("El producto con mayor precio de venta es: " + pMayorVenta.getNombre());
		System.out.println("El producto con mayor precio de costo es: " + pMayorCosto.getNombre());
		
		System.out.println("Se ha borrado el producto en la posición 5: " + productos.remove(5).getNombre());

		for (Producto p : productos) {
			if (p.getCantidadStock() > pMayorCantidad.getCantidadStock())
				pMayorCantidad = p;
		}
		System.out.println("El producto con mayor cantidad en stock es: " + pMayorCantidad.getNombre());
		if (pMayorCantidad.getCantidadStock() >= 3) {
			pMayorCantidad.setCantidadStock(pMayorCantidad.getCantidadStock() - 3);
		} else
			System.out.println("El producto con mayor cantidad no tiene más de 3 productos en stock");

	}
}