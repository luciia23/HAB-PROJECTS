package ejercicio2;

public class Trabajador implements Runnable{
	private String nombre;
	private String estacionTrabajo;
	
	public Trabajador(String nombre, String estacionTrabajo) {
		this.nombre = nombre;
		this.estacionTrabajo = estacionTrabajo;
	}
	
	@Override
	public void run() {
		//Simular la tarea de trabajo
		try {
			System.out.println(nombre + " está trabajando en " + estacionTrabajo);
			Thread.sleep((long)(Math.random() * 5000));
			System.out.println(nombre + " ha terminado su tarea en  " + estacionTrabajo);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
