package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Voto;

@WebServlet(name = "SvVotacion", urlPatterns = {"/SvVotacion"})
public class SvVotacion extends HttpServlet {

    private List<Voto> listaVotos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Integer> resultados = new HashMap<>();
        for (Voto voto : listaVotos) {
            String partido = voto.getPartido();
            resultados.put(partido, resultados.getOrDefault(partido, 0) + 1);
        }
        HttpSession misesion = request.getSession();
        misesion.setAttribute("resultados", resultados);
        response.sendRedirect("resultados.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String partidoSeleccionado = request.getParameter("partido");
        listaVotos.add(new Voto(partidoSeleccionado));
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
