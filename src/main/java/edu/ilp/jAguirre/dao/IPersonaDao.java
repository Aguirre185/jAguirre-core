package edu.ilp.jAguirre.dao;

import edu.ilp.jAguirre.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPersonaDao extends JpaRepository<Persona,Long> {


}
