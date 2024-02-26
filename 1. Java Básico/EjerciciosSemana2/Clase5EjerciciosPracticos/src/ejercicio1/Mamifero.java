package ejercicio1;

public class Mamifero extends Animal {
	private int numPatas;
	private String tipoReproduccion;
	private String colorPelaje;
	private String habitat;

	public Mamifero() {

	}

	public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numPatas,
			String tipoReproduccion, String colorPelaje, String habitat) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.numPatas = numPatas;
		this.tipoReproduccion = tipoReproduccion;
		this.colorPelaje = colorPelaje;
		this.habitat = habitat;
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, soy un mamífero");
	}

}