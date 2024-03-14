package ejercicio1;

public class Main {
	/*
	 * Crea un programa que simule la exploración recursiva de directorios en el
	 * sistema de archivos de un sistema operativo utilizando una estructura de
	 * datos propia.
	 * 
	 * Emplea una estructura donde cada nodo representa un directorio y contiene
	 * referencias a sus subdirectorios.
	 * 
	 * El programa debe realizar una exploración simulada para mostrar la jerarquía
	 * de directorios y archivos.
	 */
	public static void main(String[] args) {
		// Crear la estructura de directorios
		Directorio raiz = new Directorio(1, "Raiz");
		Directorio directorio1 = new Directorio(2, "Directorio1");
		Directorio directorio2 = new Directorio(3, "Directorio2");
		Directorio subdirectorio1 = new Directorio(4, "Subdirectorio1");

		raiz.agregarDirectorios(directorio1);
		raiz.agregarDirectorios(directorio2);
		directorio1.agregarDirectorios(subdirectorio1);

		raiz.agregarArchivos("archivo1.txt");
		directorio1.agregarArchivos("archivo2.txt");
		subdirectorio1.agregarArchivos("archivo3.txt");

		// Explorar el directorio raíz
		ExploradorDirectorios explorador = new ExploradorDirectorios();
		explorador.explorarDirectorio(raiz);
	}
}
