package ejercicio1;

public class Camioneta extends Vehiculo implements Combustion {

	private double capacidadTanque;
	private double consumoCombustible;

	public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadTanque,
			double consumoCombustible) {
		super(id, placa, marca, modelo, anio, costo);
		this.capacidadTanque = capacidadTanque;
		this.consumoCombustible = consumoCombustible;
	}

	@Override
	public void recargarCombustible() {
		System.out.println("Recarga de combustible de la camioneta con placa: " + placa);
	}

	@Override
	public int calcularAntiguedad() {
		return 2024 - anio;
	}

	@Override
	public String toString() {
		return "Camioneta [capacidadTanque=" + capacidadTanque + ", consumoCombustible=" + consumoCombustible + ", id="
				+ id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", costo="
				+ costo + ", antiguedad=" + calcularAntiguedad() + "]";
	}

}