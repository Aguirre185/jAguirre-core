package edu.ilp.jAguirre.service.impl;

import edu.ilp.jAguirre.dao.IEstudianteDao;

import edu.ilp.jAguirre.entity.Estudiante;
import edu.ilp.jAguirre.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }

    @Override
    public Estudiante obtenerEstudiantePornombre(String nombre) {
        return this.estudianteDao.obtenerEstudiantePornombre(nombre);
    }
}
