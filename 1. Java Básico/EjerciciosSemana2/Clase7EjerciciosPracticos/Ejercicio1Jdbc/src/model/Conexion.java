package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conn = null;
	private static String url = "jdbc:mysql://localhost:3306/universidad";
	private static String user = "root";
	
	public static Connection connect() {
		try {
			conn = DriverManager.getConnection(url, user, "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void disconnect() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
