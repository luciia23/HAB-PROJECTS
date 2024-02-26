package ejercicio2;

public class Main {
	public static void main(String[] args) {
		Vestimenta[] vestimentas = new Vestimenta[9];
		
		vestimentas[0] = new Zapato();
		vestimentas[1] = new Zapato();
		vestimentas[2] = new Zapato(1, "Zapato deportivo", 59.99, "Nike", "42", "Negro", "Cuero", "Cordones");
		vestimentas[3] = new Pantalon();
		vestimentas[4] = new Pantalon();
		vestimentas[5] = new Pantalon(2, "Pantalón cargo", 34.3, "Zara", "M", "Azul", "Clásico", "Algodón");
		vestimentas[6] = new Camiseta();
		vestimentas[7] = new Camiseta(3, "Camiseta manga corta", 14.99, "Puma", "M", "Blanco", "Corta", "Redondo");
		vestimentas[8] = new Sombrero(4, "Sombrero grande", 24.99, "Brixton", "Única", "Beige", "Panamá", "Grande");
		
		for (Vestimenta v : vestimentas)
			v.mostrarMarca();
	}
}