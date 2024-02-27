package ejercicio1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	    
	    Auto auto = new Auto(1, "ABC123", "Tesla", "Model S", 2020, 80000, 10000, 10);
	    Camioneta camioneta = new Camioneta(2, "XYZ789", "Toyota", "Hilux", 2019, 60000, 80, 12);
	    Moto moto = new Moto(3, "DEF456", "Honda", "CBR600RR", 2017, 12000, 600, "4 tiempos");
	    
	    vehiculos.add(auto);
	    vehiculos.add(camioneta);
	    vehiculos.add(moto);
	    
	    for (Vehiculo v : vehiculos) {
	    	System.out.println(v.toString());
	    	
	    	if (v instanceof Electrico)
	    		((Electrico)v).cargarEnergia();
	    	else if (v instanceof Combustion)
	    		((Combustion)v).recargarCombustible();
	    	System.out.println();
	    }
	}
}