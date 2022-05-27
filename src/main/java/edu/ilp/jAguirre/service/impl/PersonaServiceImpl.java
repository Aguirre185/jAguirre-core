package edu.ilp.jAguirre.service.impl;

import edu.ilp.jAguirre.dao.IPersonaDao;
import edu.ilp.jAguirre.entity.Persona;
import edu.ilp.jAguirre.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;
    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }

}
