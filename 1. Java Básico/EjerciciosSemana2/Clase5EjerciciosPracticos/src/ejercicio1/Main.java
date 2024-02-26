package ejercicio1;

public class Main {
	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Ave ave = new Ave();
		Reptil reptil = new Reptil();

		mamifero.saludar();
		ave.saludar();
		reptil.saludar();
		
		Animal animal = new Animal();
		animal = mamifero;

		/* d)
		 * - Es posible hacerlo gracias al principio de polimorfismo 
		 * - Permite que si creamos un objeto de una clase padre, pueda contener en su estructura
		 * distintos objetos de sus clases hijas por más que sus características sean
		 * diferentes.
		 */

		/* e)
		 * No se puede cambiar los métodos a "private" y llamarlos desde la clase Main.
		 * Ya que, al establecerlo como private, solo se podrá usar en la misma clase
		 * que se haya creado y las demás clases no tendrán acceso a ese método, a no
		 * ser que sea cambiado a "public"
		 */
	}
}