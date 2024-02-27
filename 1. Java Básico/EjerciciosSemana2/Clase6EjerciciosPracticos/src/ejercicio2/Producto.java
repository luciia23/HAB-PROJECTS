package ejercicio2;

public class Producto {
	private int codigo;
	private String nombre;
	private String marca;
	private String tipo;
	private double precioCosto;
	private double precioVenta;
	private int cantidadStock;

	public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta,
			int cantidadStock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.cantidadStock = cantidadStock;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

}