package com.mycompany.ejercicio2jpa.logica;

import com.mycompany.ejercicio2jpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo p) {
        controlPersis.crearPlatillo(p);
    }

    public void borrarPlatillo(int id) {
        controlPersis.borrarPlatillo(id);
    }

    public List<Platillo> seleccionarPlatillos() {
        return controlPersis.seleccionarPlatillos();
    }

    public void modificarPlatillo(Platillo platillo) {
        controlPersis.modificarPlatillo(platillo);
    }

}
