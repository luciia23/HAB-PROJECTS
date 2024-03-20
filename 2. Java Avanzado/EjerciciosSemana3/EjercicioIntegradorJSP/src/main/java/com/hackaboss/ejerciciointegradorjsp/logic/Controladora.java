package com.hackaboss.ejerciciointegradorjsp.logic;

import com.hackaboss.ejerciciointegradorjsp.persistence.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }

    public void crearPartido(Partido p, Long equipoLocalId, Long equipoisitantelId) {
        Equipo eLocal = controlPersis.traerEquipo(equipoLocalId);
        Equipo eVisitante = controlPersis.traerEquipo(equipoisitantelId);
        
        p.setEquipoLocal(eLocal);
        p.setEquipoVisitante(eVisitante);

        controlPersis.crearPartido(p);
    }

    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }

}
