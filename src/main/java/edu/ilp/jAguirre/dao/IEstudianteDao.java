package edu.ilp.jAguirre.dao;

import edu.ilp.jAguirre.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {


        @Query("SELECT e FROM Estudiante e WHERE e.codigo = :codigo")
        Estudiante obtenerEstudiantePorCodigo(@Param("codigo") String codigo);

        @Query("SELECT e FROM Estudiante e WHERE e.nombre = :nombre")
        Estudiante obtenerEstudiantePornombre(@Param("nombre") String nombre);





















}
