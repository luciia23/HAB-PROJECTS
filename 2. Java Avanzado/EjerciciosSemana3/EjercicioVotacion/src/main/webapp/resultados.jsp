
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1><b>Resultados de la Votación</b></h1>
        <table border="1">
            <tr>
                <th>Nombre Partido</th>
                <th>Votos</th>
            </tr>
            <%
                Map<String, Integer> resultados = (Map<String, Integer>) request.getSession().getAttribute("resultados");
                for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
            %>
            <tr>
                <td><%= entry.getKey()%></td>
                <td><%= entry.getValue()%></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>

