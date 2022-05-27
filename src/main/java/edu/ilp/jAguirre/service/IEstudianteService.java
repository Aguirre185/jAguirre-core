package edu.ilp.jAguirre.service;

import edu.ilp.jAguirre.entity.Estudiante;


public interface IEstudianteService {

    //buscar persona por codigo
    Estudiante obtenerEstudiantePorCodigo(String codigo);
    //buscar estudiante por nombre
    Estudiante obtenerEstudiantePornombre(String nombre);
}
