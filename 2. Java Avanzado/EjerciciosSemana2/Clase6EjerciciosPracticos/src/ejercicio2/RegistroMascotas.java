package ejercicio2;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas{
	private List<Mascota<?>> registro;

	public RegistroMascotas() {
		this.registro = new ArrayList<>();
	}
	
	public <T> void agregarMascota(Mascota<T> mascota) {
		registro.add(mascota);
	}
	
    public List<Mascota<?>> busqueda(String consulta) {
        List<Mascota<?>> result = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(consulta) || mascota.getEspecie().toString().equalsIgnoreCase(consulta)) {
                result.add(mascota);
            }
        }
        return result;
    }
	
    //Con streams
    public List<Mascota<?>> buscar(String valor, String parametro) {
        return registro.stream()
                .filter(mascota -> switch (parametro) {
                    case "nombre" -> mascota.getNombre().equals(valor);
                    case "especie" -> mascota.getEspecie().equals(valor);
                    default -> false;
                })
                .collect(Collectors.toList());
    }
	
	public int cantidadTotalMascotas() {
		return registro.size();
	}

	public Mascota<?> generarDatosAleatorios() {
		Random random = new Random();
		String[] nombres = { "Luna", "Max", "Bella", "Rocky", "Simba", "Coco" };
		String[] especies = { "Perro", "Gato", "Reptil", "Ave" };

		String nombreAleatorio = nombres[random.nextInt(nombres.length)];
		int edadAleatoria = random.nextInt(15) + 1; // Edad entre 1 y 15 años
		String especieAleatoria = especies[random.nextInt(especies.length)];

		return new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria);
	}

}