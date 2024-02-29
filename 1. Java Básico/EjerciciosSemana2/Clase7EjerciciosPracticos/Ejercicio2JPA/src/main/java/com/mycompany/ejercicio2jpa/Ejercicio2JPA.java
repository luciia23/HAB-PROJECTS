package com.mycompany.ejercicio2jpa;

import com.mycompany.ejercicio2jpa.logica.Platillo;
import com.mycompany.ejercicio2jpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class Ejercicio2JPA {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //CREACIÓN PLATILLOS
        
        controlPersis.crearPlatillo(new Platillo(1, "Cachopo", "receta", 16.2));
        controlPersis.crearPlatillo(new Platillo(2, "Lentejas", "receta", 13.1));
        controlPersis.crearPlatillo(new Platillo(3, "Pizza", "receta", 10.5));
        
        //ELIMINAR PLATILLOS
        
        controlPersis.borrarPlatillo(1);
        
        //EDITAR PLATILLOS
        
        Platillo platillo = controlPersis.seleccionarPlatillos().get(0);
        platillo.setPrecio(9.99);
        controlPersis.modificarPlatillo(platillo);
        
        System.out.println("LISTA PLATILLOS");
        List<Platillo> lista = controlPersis.seleccionarPlatillos();
        
        for (Platillo p : lista)
            System.out.println(p.toString());


    }
}
