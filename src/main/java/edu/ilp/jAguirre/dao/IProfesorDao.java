package edu.ilp.jAguirre.dao;

import edu.ilp.jAguirre.entity.Asignatura;
import edu.ilp.jAguirre.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
    @Query("SELECT p.asignaturas FROM Profesor p WHERE p.idProfesor = :idProfesor")
    List<Asignatura> obtenerCursoPorProfesor(@Param("idProfesor") Long idProfesor);
}
