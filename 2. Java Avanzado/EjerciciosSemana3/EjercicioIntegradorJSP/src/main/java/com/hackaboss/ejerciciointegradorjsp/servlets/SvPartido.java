package com.hackaboss.ejerciciointegradorjsp.servlets;

import com.hackaboss.ejerciciointegradorjsp.logic.Controladora;
import com.hackaboss.ejerciciointegradorjsp.logic.Partido;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Partido> listaPartidos = control.traerPartidos();
        request.setAttribute("resultadosPartidos", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fechaIngresada = request.getParameter("fecha_partido");
        Long equipoLocalId = Long.valueOf(request.getParameter("equipoLocal"));
        Long equipoisitantelId = Long.valueOf(request.getParameter("equipoVisitante"));
        int golesLocales = Integer.parseInt(request.getParameter("golesLocales"));
        int golesVisitantes = Integer.parseInt(request.getParameter("golesVisitantes"));
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date fecha = sdf.parse(fechaIngresada);

            Partido p = new Partido();
            p.setFecha(fecha);
            p.setResultadoLocal(golesLocales);
            p.setResultadoVisitante(golesVisitantes);

            control.crearPartido(p, equipoLocalId, equipoisitantelId);

            response.sendRedirect("index.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(SvPartido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
