public class Verdura {
	private int id;
	private String nombre;
	private String color;
	private double calorias;
	private boolean debeCocinarse;

	public Verdura(int id, String nombre, String color, double calorias, boolean debeCocinarse) {
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.calorias = calorias;
		this.debeCocinarse = debeCocinarse;
	}

	public Verdura() {

	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDebeCocinarse() {
		return debeCocinarse;
	}

	public void setDebeCocinarse(boolean debeCocinarse) {
		this.debeCocinarse = debeCocinarse;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getCalorias() {
		return calorias;
	}

	@Override
	public String toString() {
		return "Verdura [id=" + id + ", nombre=" + nombre + ", color=" + color + ", calorias=" + calorias
				+ ", debeCocinarse=" + debeCocinarse + "]";
	}

}