
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Votaciones</title>
        <style>
            .button {
                border: none;
                color: white;
                padding: 10px 20px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                border-radius: 8px;
            }
            .votar {
                background-color: #007bff; /* Azul */
            }
            .mostrar {
                background-color: #28a745; /* Verde */
            }
        </style>
    </head>
    <body>
        <h1><b>Votación</b></h1>
        <p>Elija su voto:</p>
        <form action="SvVotacion" method="POST">
            <input type="radio" name="partido" value="Partido A"> Partido A<br>
            <input type="radio" name="partido" value="Partido B"> Partido B<br>
            <input type="radio" name="partido" value="Partido C"> Partido C<br>
            <input type="submit" class="button votar" value="Votar">
        </form>
        <div style="margin-top: 20px;">
            <form action="SvVotacion" method="GET">
                <input type="submit" class="button mostrar" value="Mostrar resultados">
            </form>
        </div>
    </body>
</html>


