package control;

import java.util.ArrayList;

import model.Estudiante;
import model.dao.EstudianteDAO;
import model.dao.ImplEstudianteDAO;

public class Main {
	public static void main(String[] args) {
		Estudiante e = new Estudiante(1, "Lucia", 20, 8.8);
		EstudianteDAO eDao = new ImplEstudianteDAO();

		eDao.insertarEstudiante(e);
		ArrayList<Estudiante> lista = eDao.seleccionEstudiantes();
		for (Estudiante estudiante : lista)
			System.out.println(estudiante.toString());
	}
}
