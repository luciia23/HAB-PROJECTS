package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.Conexion;
import model.Estudiante;

public class ImplEstudianteDAO implements EstudianteDAO {

	private Connection con;

	public boolean insert(Estudiante e) {
		boolean mod = false;
		PreparedStatement pStatement = null;
		String sql = "INSERT INTO ESTUDIANTE (nombre, edad, calificacion) VALUES (?, ?, ?)";
		con = Conexion.connect();
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1, e.getNombre());
			pStatement.setInt(2, e.getEdad());
			pStatement.setDouble(3, e.getCalificacion());
			mod = pStatement.executeUpdate() > 0;
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			Conexion.disconnect();
		}
		return mod;
	}
	
	public ResultSet seleccionar(String sql) {
		Statement statement = null;
		ResultSet rs = null;
		con = Conexion.connect();
		try {
			statement = con.createStatement();
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public void insertarEstudiante(Estudiante e) {
		if (insert(e))
			System.out.println("La inserción de " + e.getNombre() + " se ha realizado.");
	}

	@Override
	public ArrayList<Estudiante> seleccionEstudiantes() {
		ArrayList<Estudiante> estudiantesList = new ArrayList<>();
		ResultSet rs = null;
		rs = seleccionar("SELECT * FROM ESTUDIANTE");
		try {
			while (rs.next())
				estudiantesList.add(new Estudiante(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return estudiantesList;
	}

}
