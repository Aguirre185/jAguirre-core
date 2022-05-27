package edu.ilp.jAguirre.dao;

import edu.ilp.jAguirre.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {
}
