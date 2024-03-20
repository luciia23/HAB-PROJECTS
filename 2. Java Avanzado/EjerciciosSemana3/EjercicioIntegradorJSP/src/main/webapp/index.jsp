<%@page import="com.hackaboss.ejerciciointegradorjsp.logic.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.hackaboss.ejerciciointegradorjsp.logic.Equipo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Torneo Baloncesto</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <% List<Equipo> listaEquipos = (List<Equipo>) request.getAttribute("resultadosEquipos"); %>
        <div class="container mt-4">
            <h2>Formulario Equipo</h2>
            <form action="SvEquipo" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre_equipo" name="nombre_equipo">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad:</label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>
                <button type="submit" class="btn btn-primary">Crear Equipo</button>
            </form>

            <br>
            <br>

            <form action="SvEquipo" method="GET" accept-charset="UTF-8">
                <button type="submit" class="btn btn-primary">Obtener Listado de Equipos</button>
            </form>

            <br>
            <br>

            <div class="results-table">
                <% if (listaEquipos != null) { %>
                <h3>Equipos Registrados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : listaEquipos) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>

            <h2>Registrar Partido</h2>
            <form action="SvPartido" method="POST">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" id="fecha_partido" name="fecha_partido">
                </div>  

                <div class="form-group">
                    Equipo Local: 
                    <select name="equipoLocal">
                        <% if (listaEquipos != null) { %>
                        <% for (Equipo equipo : listaEquipos) {%>
                        <option value="<%= equipo.getId()%>"><%= equipo.getNombre()%></option>
                        <% } %>
                        <% } %>
                    </select>
                </div>
                <br>
                <div class="form-group">
                    Equipo Visitante:
                    <select name="equipoVisitante">
                        <% if (listaEquipos != null) { %>
                        <% for (Equipo equipo : listaEquipos) {%>
                        <option value="<%= equipo.getId()%>"><%= equipo.getNombre()%></option>
                        <% } %>
                        <% } %>
                    </select>
                </div>
                <br>
                <div class="form-group">
                    <label for="golesLocales">Goles Locales:</label>
                    <input type="text" class="form-control" id="golesLocales" name="golesLocales">
                </div>
                <div class="form-group">
                    <label for="golesVisitantes">Goles Visitantes:</label>
                    <input type="text" class="form-control" id="golesVisitantes" name="golesVisitantes">
                </div>
                <button type="submit" class="btn btn-primary">Registrar Partido</button>
            </form>

            <hr>

            <form action="SvPartido" method="GET" accept-charset="UTF-8">
                <button type="submit" class="btn btn-primary">Obtener Listado de Partidos</button>
            </form>


            <!-- Resultados en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("resultadosPartidos") != null) { %>
                <h3>Partidos:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo Visitante</th>
                            <th>Resultado Local</th>
                            <th>Resultado Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultadosPartidos")) {%>
                        <tr>
                            <td><%= partido.getFechaFormateada() %></td>
                            <td><%= partido.getEquipoLocal().getNombre()%></td>
                            <td><%= partido.getEquipoVisitante().getNombre()%></td>
                            <td><%= partido.getResultadoLocal()%></td>
                            <td><%= partido.getResultadoVisitante()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
