package ejercicio1;

public class Agente implements Runnable {
	private Cliente cliente;

	public Agente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		// Simular la llamada
		try {
			System.out.println("Atendiendo llamada de " + cliente.getNombre());
			Thread.sleep((long) (Math.random() * 5000));
			System.out.println(
					"Llamada de " + cliente.getNombre() + " finalizada por " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
