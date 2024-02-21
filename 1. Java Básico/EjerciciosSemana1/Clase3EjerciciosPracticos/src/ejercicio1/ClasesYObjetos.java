package ejercicio1;

public class ClasesYObjetos {
	/*
	 * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres
	 * de clases y variables no llevan tilde) con los siguientes atributos: cod,
	 * marca, modelo, consumo y color.
	 * 
	 */

	public static void main(String[] args) {

		/* a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros. */
		Electrodomestico e1 = new Electrodomestico(1, "Samsung", "1234K", 100.5, "Rojo");
		Electrodomestico e2 = new Electrodomestico(2, "LG", "KJH987", 99.2, "Negro");
		Electrodomestico e3 = new Electrodomestico(3, "Philips", "GHJ345", 76.5, "Gris");

		/* b) Crea 1 objeto de la clase Electrodomestico sin parámetros. */
		Electrodomestico e4 = new Electrodomestico();

		/*
		 * c) Muestra por pantalla la marca, modelo y consumo energético de los 3 /*
		 * electrodomésticos creados con parámetros.
		 */

		System.out.println("Electrodoméstico 1:");
		System.out.println("Marca: " + e1.getMarca());
		System.out.println("Modelo: " + e1.getModelo());
		System.out.println("Consumo: " + e1.getConsumo() + " kWh\n");

		System.out.println("Electrodoméstico 2:");
		System.out.println("Marca: " + e2.getMarca());
		System.out.println("Modelo: " + e2.getModelo());
		System.out.println("Consumo: " + e2.getConsumo() + " kWh\n");

		System.out.println("Electrodoméstico 3:");
		System.out.println("Marca: " + e3.getMarca());
		System.out.println("Modelo: " + e3.getModelo());
		System.out.println("Consumo: " + e3.getConsumo() + " kWh\n");

		/*
		 * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se
		 * /* obtiene algún valor? De ser así… ¿Qué valor se obtiene?
		 */

//        Al haber creado el constructor del electrodoméstico sin parámetros, salen los valores por defecto

		System.out.println("Electrodoméstico 4:");
		System.out.println("Marca: " + e4.getMarca()); //null
		System.out.println("Modelo: " + e4.getModelo()); //null
		System.out.println("Consumo: " + e4.getConsumo() + " kWh"); //0.0

	}

}
