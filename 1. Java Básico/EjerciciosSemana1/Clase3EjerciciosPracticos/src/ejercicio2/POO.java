package ejercicio2;

public class POO {

	/*
	 * Crear una clase Persona, que tenga los siguientes atributos: id, nombre,
	 * edad, dirección y número de teléfono (tener en cuenta todos sus atributos,
	 * constructores y métodos getters y setters).
	 */
	public static void main(String[] args) {

		/*
		 * a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y
		 * guardarlas en él.
		 */
		Persona[] personas = new Persona[5];

		personas[0] = new Persona(1, "Jose", 60, null, 0);
		personas[1] = new Persona(2, "Laura", 23, null, 0);
		personas[2] = new Persona(3, "Marcos", 27, null, 0);
		personas[3] = new Persona(4, "Ana", 59, null, 0);
		personas[4] = new Persona(5, "Lucia", 20, null, 0);

		/*
		 * b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada
		 * persona almacenada.
		 */
		for (int i = 0; i < personas.length; i++)
			System.out.println("Nombre: " + personas[i].getNombre() + " y Edad: " + personas[i].getEdad());

		/*
		 * c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar
		 * el cambio y luego mostrar el después de los datos de las dos personas cuyosf
		 * nombres fueron cambiados.
		 */
		
		System.out.println("\nAntes del cambio");
		System.out.println("Persona 1: " + personas[1].getNombre());
		System.out.println("Persona 2: " + personas[2].getNombre());
		
		personas[1].setNombre("Juan");
		personas[2].setNombre("Alberto");
		
		System.out.println("\nDespués del cambio");
		System.out.println("Persona 1: " + personas[1].getNombre());
		System.out.println("Persona 2: " + personas[2].getNombre() + "\n");

		/*
		 * d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya
		 * edad sea mayor de 30 años.
		 */
		
		for(int j = 0; j < personas.length; j++)
			if (personas[j].getEdad() > 30)
				System.out.println("Nombre: " + personas[j].getNombre() + " y Edad: " + personas[j].getEdad());

	}
}
