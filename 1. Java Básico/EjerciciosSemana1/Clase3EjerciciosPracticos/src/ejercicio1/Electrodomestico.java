package ejercicio1;

public class Electrodomestico {

	private int cod;
	private String marca;
	private String modelo;
	private double consumo;
	private String color;

//	Constructor con parámetros
	public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
		this.cod = cod;
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
		this.color = color;
	}

//	Constructor sin parámetros (vacío)
	public Electrodomestico() {
	}

//	Getters
	public int getCod() {
		return cod;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public String getColor() {
		return color;
	}

}
