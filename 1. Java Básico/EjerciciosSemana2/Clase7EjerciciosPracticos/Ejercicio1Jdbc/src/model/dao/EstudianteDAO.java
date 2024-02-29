package model.dao;

import java.util.ArrayList;

import model.Estudiante;

public interface EstudianteDAO {
	public void insertarEstudiante(Estudiante e);
	public ArrayList<Estudiante> seleccionEstudiantes();
}
