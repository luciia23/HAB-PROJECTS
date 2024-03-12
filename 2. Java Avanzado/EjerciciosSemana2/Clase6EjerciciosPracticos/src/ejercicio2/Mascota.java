package ejercicio2;

public class Mascota<T> {
	private static int contadorId = 0;
	private Integer id;
	private String nombre;
	private Integer edad;
	private T especie;

	public Mascota() {

	}

	public Mascota(String nombre, Integer edad, T especie) {
		this.id = ++contadorId;
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public T getEspecie() {
		return especie;
	}

	public void setEspecie(T especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + "]";
	}

}
