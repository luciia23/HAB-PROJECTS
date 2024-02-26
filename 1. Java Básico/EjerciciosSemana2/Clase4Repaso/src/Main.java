public class Main {
	
	
	public static void mostrarVerduras(Verdura[] verduras, boolean flag) {
		if (flag) {
			System.out.println("VERDURAS VERDES");
			for (Verdura v : verduras)
				if (v.getColor().equalsIgnoreCase("verde"))
					System.out.println("Nombre: " + v.getNombre() + " - Calorías: " + v.getCalorias());	
		}
		else {
			System.out.println("VERDURAS");
			for (Verdura v : verduras)
				System.out.println("Nombre: " + v.getNombre() + " - Calorías: " + v.getCalorias());		
		}

		System.out.println();
	}
	
	public static void main(String[] args) {
		Verdura[] verduras = new Verdura[5];

		verduras[0] = new Verdura(0, "Pimiento", "Verde", 12.5, false);
		verduras[1] = new Verdura(1, "Zanahoria", "Naranja", 25.6, false);
		verduras[2] = new Verdura(2, "Patata", "Amarilla", 40.2, true);
		verduras[3] = new Verdura(3, "Cebolla", "Blanca", 23.2, true);
		verduras[4] = new Verdura(4, "Brocoli", "Verde", 34.1, true);
		
		mostrarVerduras(verduras, false);

		verduras[1].setId(5);
		verduras[1].setNombre("Coliflor");
		verduras[1].setColor("Blanca");
		verduras[1].setCalorias(30.4);
		verduras[1].setDebeCocinarse(true);
		
		verduras[2].setId(6);
		verduras[2].setNombre("Lechuga");
		verduras[2].setColor("Verde");
		verduras[2].setCalorias(5.9);
		verduras[2].setDebeCocinarse(false);
		
		mostrarVerduras(verduras, false);
		mostrarVerduras(verduras, true);
		
	}
}