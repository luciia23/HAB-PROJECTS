package ejercicio1;

public class Main {
	public static void main(String[] args) {
		Vuelo vuelo = new Vuelo("New York", "2024-03-15", 100);

		try {
			// Intentar reservar 3 asientos
			vuelo.reservarAsientos(3);
			System.out.println("Reserva exitosa.");
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}

		try {
			// Intentar reservar 150 asientos (más de los disponibles)
			vuelo.reservarAsientos(150);
			System.out.println("Reserva exitosa.");
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}

		try {
			// Intentar reservar 0 asientos
			vuelo.reservarAsientos(0);
			System.out.println("Reserva exitosa.");
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}
	}
}
