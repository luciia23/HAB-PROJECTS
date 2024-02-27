package ejercicio1;

public class Auto extends Vehiculo implements Electrico {

	private int capacidadBateria;
	private double autonomia;

	public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, double autonomia) {
		super(id, placa, marca, modelo, anio, costo);
		this.capacidadBateria = capacidadBateria;
		this.autonomia = autonomia;
	}

	@Override
	public void cargarEnergia() {
		System.out.println("Carga de energía del auto con placa: " + placa);
	}

	@Override
	public int calcularAntiguedad() {
		return (2024 - anio);
	}

	@Override
	public String toString() {
		return "Auto [capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia + ", id=" + id + ", placa="
				+ placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", costo=" + costo
				+ ", antiguedad=" + calcularAntiguedad() + "]";
	}
	
	

}