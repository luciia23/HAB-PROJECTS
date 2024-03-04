package ejercicio2;

public class Main {

	public static void validarProducto(Producto p) throws InventarioException {
		if (p.getNombre() == null || p.getNombre().isEmpty())
			throw new InventarioException("El nombre del producto no puede estar vacío");
		if (p.getPrecio() <= 0)
			throw new InventarioException("El precio del producto tiene que ser mayor que 0");
		if (p.getNumStock() < 0)
			throw new InventarioException("La cantidad del producto no puede ser negativa");
	}

	public static void main(String[] args) {
		Producto p = new Producto("", 10.3, 5);
		Producto p1 = new Producto("Camiseta", -10.3, 5);
		Producto p2 = new Producto("Camiseta", 10.3, -5);
		try {
			validarProducto(p);
			validarProducto(p1);
			validarProducto(p2);
		} catch (InventarioException e) {
			System.out.println("EXCEPCIÓN: " + e.getMessage());
		}

	}
}
