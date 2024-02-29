package com.mycompany.ejercicio2jpa.persistencia;

import com.mycompany.ejercicio2jpa.logica.Platillo;
import com.mycompany.ejercicio2jpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJPA = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJPA.create(platillo);
    }

    public void borrarPlatillo(int id) {
        try {
            platilloJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> seleccionarPlatillos() {
        return platilloJPA.findPlatilloEntities();
    }

    public void modificarPlatillo(Platillo platillo) {
        try {
            platilloJPA.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
