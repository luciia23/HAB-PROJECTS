package ejercicio1;

import java.time.LocalDate;

public class Vuelo {

	public static final int NUM_MAX = 100;

	private String destino;
	private String fechaViaje;
	private int numAsientos;

	public Vuelo(String destino, String fechaViaje, int numAsientos) {
		this.destino = destino;
		this.fechaViaje = fechaViaje;
		this.numAsientos = numAsientos;
	}

	public boolean reservarAsientos(int numAsientos) throws ReservaInvalidaException {
		if (numAsientos <= 0)
			throw new ReservaInvalidaException("El número debe de ser mayor que 0");
		if (numAsientos > this.numAsientos)
			throw new ReservaInvalidaException("No hay suficientes asientos disponibles");
		this.numAsientos -= numAsientos;
		return true;
	}

}
