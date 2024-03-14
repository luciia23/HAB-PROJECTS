package ejercicio1;

public class ExploradorDirectorios {

	public void explorarDirectorio(Directorio directorio) {
		explorarDirectorioRecursivo(directorio, 0);
	}

	private void explorarDirectorioRecursivo(Directorio directorio, int nivel) {
		// Imprimir el nombre del directorio con la indentación adecuada según el nivel
		for (int i = 0; i < nivel; i++) {
			System.out.print("  "); // Dos espacios por nivel
		}
		System.out.println(directorio.getNombre() + "/");

		// Explorar los archivos en este directorio
		for (String archivo : directorio.getArchivos()) {
			for (int i = 0; i < nivel + 1; i++) {
				System.out.print("  ");
			}
			System.out.println(archivo);
		}

		// Explorar los subdirectorios de manera recursiva
		for (Directorio subdirectorio : directorio.getSubdirectorios()) {
			explorarDirectorioRecursivo(subdirectorio, nivel + 1);
		}
	}
}