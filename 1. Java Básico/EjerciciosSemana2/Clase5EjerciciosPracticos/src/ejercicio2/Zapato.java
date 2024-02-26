package ejercicio2;

public class Zapato extends Vestimenta {
	private String material;
	private String tipoCierre;

	public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material,
			String tipoCierre) {
		super(codigo, nombre, precio, marca, talla, color);
		this.material = material;
		this.tipoCierre = tipoCierre;
	}

	public Zapato() {

	}

	@Override
	public void mostrarMarca() {
		System.out.println("Estos zapatos es de marca " + marca);
	}

}