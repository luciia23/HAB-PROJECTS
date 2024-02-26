package ejercicio1;

public class Ave extends Animal {
	private String envAlas;
	private String tipoVuelo;
	private String colorPlumaje;
	private String tipoPico;

	public Ave() {

	}

	public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, String envAlas,
			String tipoVuelo, String colorPlumaje, String tipoPico) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.envAlas = envAlas;
		this.tipoVuelo = tipoVuelo;
		this.colorPlumaje = colorPlumaje;
		this.tipoPico = tipoPico;
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, soy un ave");
	}

}