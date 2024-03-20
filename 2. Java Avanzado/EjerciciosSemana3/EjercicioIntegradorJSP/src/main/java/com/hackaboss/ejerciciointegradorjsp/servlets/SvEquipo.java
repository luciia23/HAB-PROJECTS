package com.hackaboss.ejerciciointegradorjsp.servlets;

import com.hackaboss.ejerciciointegradorjsp.logic.Controladora;
import com.hackaboss.ejerciciointegradorjsp.logic.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Equipo> listaEquipos = control.traerEquipos();

        request.setAttribute("resultadosEquipos", listaEquipos);

        // Utiliza forward en lugar de sendRedirect
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre_equipo");
        String ciudad = request.getParameter("ciudad");

        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);

        control.crearEquipo(equipo);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
