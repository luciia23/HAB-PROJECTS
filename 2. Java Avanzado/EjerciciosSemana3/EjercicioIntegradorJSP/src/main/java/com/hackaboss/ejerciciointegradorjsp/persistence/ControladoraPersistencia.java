package com.hackaboss.ejerciciointegradorjsp.persistence;

import com.hackaboss.ejerciciointegradorjsp.logic.Equipo;
import com.hackaboss.ejerciciointegradorjsp.logic.Partido;
import java.util.List;

public class ControladoraPersistencia {

    EquipoJpaController equJPA = new EquipoJpaController();
    PartidoJpaController parJPA = new PartidoJpaController();
    
    public void crearEquipo(Equipo equipo) {
      equJPA.create(equipo);
    }

    public List<Equipo> traerEquipos() {
       return equJPA.findEquipoEntities();
    }

    public Equipo traerEquipo(Long equipoLocalId) {
        return equJPA.findEquipo(equipoLocalId);
    }

    public void crearPartido(Partido p) {
        parJPA.create(p);
    }

    public List<Partido> traerPartidos() {
       return parJPA.findPartidoEntities();
    }

}
