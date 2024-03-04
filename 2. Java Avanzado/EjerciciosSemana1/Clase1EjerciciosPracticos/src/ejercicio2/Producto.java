package ejercicio2;

public class Producto {
	private String nombre;
	private Double precio;
	private int numStock;

	public Producto(String nombre, Double precio, int numStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.numStock = numStock;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public int getNumStock() {
		return numStock;
	}

}
