package ejercicio1;

public abstract class Vehiculo {
	protected int id;
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected double costo;

	public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.costo = costo;
	}

	public abstract int calcularAntiguedad();

}