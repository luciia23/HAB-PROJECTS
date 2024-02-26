package ejercicio2;

public class Vestimenta {
	protected int codigo;
	protected String nombre;
	protected double precio;
	protected String marca;
	protected String talla;
	protected String color;

	public Vestimenta() {
	}

	public Vestimenta(int codigo, String nombre, double precio,  String marca, String talla, String color) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.talla = talla;
		this.color = color;
	}

	public void mostrarMarca() {
		System.out.println("Esta vestimenta es de marca: " + marca);
	}

}