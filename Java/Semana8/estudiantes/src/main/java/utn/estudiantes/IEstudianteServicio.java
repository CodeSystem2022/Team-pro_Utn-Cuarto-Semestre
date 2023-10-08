package utn.etudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

public interface IEstudianteServicio implements IEstudianteServicio {
    public List<Estudiantes2022> listarEstudiantes();
    public Estudiante buscarEstudiantePorId(Integer idEstudiantes2022);
    public void guardarEstudiante(Estudiantes2022 estudiante);
    public void eliminarEstudiante(Estudiantes2022 estudiante);
}