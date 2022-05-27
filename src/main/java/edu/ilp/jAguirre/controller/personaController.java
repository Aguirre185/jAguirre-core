package edu.ilp.jAguirre.controller;

import edu.ilp.jAguirre.entity.Persona;
import edu.ilp.jAguirre.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class personaController {

    @Autowired
    private IPersonaService personaService;
    @GetMapping("/listarpersona")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    //
    }
}
