package ejercicio1;

public class Moto extends Vehiculo implements Combustion {

	private int cilindra;
	private String tipoMotor;

	public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindra,
			String tipoMotor) {
		super(id, placa, marca, modelo, anio, costo);
		this.cilindra = cilindra;
		this.tipoMotor = tipoMotor;
	}

	@Override
	public void recargarCombustible() {
		System.out.println("Recarga de combustible de la moto con placa: " + placa);
	}

	@Override
	public int calcularAntiguedad() {
		return 2024 - anio;
	}

	@Override
	public String toString() {
		return "Moto [cilindra=" + cilindra + ", tipoMotor=" + tipoMotor + ", id=" + id + ", placa=" + placa
				+ ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", costo=" + costo
				+ ", antiguedad=" + calcularAntiguedad() + "]";
	}

}