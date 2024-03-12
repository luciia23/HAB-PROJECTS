package ejercicio1;

public class Auto {
	private String marca;
	private String modelo;
	private int anio;
	private double precio;

	public Auto(String marca, String modelo, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + "]";
	}

}
