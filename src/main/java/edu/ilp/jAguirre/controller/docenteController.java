package edu.ilp.jAguirre.controller;

import edu.ilp.jAguirre.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cursos")
public class docenteController {
    @Autowired
    private IEstudianteService estudidanteService;
}
