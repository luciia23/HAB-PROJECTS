package com.mycompany.ejercicio2jpa;

import com.mycompany.ejercicio2jpa.logica.Platillo;
import com.mycompany.ejercicio2jpa.logica.Controladora;
import java.util.List;

public class Ejercicio2JPA {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        //CREACIÓN PLATILLOS
        
        control.crearPlatillo(new Platillo(1, "Cachopo", "receta", 16.2));
        control.crearPlatillo(new Platillo(2, "Lentejas", "receta", 13.1));
        control.crearPlatillo(new Platillo(3, "Pizza", "receta", 10.5));
        
        //ELIMINAR PLATILLOS
        
        control.borrarPlatillo(1);
        
        //EDITAR PLATILLOS
        
        Platillo platillo = control.seleccionarPlatillos().get(0);
        platillo.setPrecio(9.99);
        control.modificarPlatillo(platillo);
        
        System.out.println("LISTA PLATILLOS");
        List<Platillo> lista = control.seleccionarPlatillos();
        
        for (Platillo p : lista)
            System.out.println(p.toString());


    }
}
