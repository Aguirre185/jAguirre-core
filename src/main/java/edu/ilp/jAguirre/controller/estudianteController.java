package edu.ilp.jAguirre.controller;

import edu.ilp.jAguirre.dao.IEstudianteDao;
import edu.ilp.jAguirre.entity.Estudiante;
import edu.ilp.jAguirre.service.IEstudianteService;
import edu.ilp.jAguirre.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("estudidante")
public class estudianteController {

    @Autowired
    private IEstudianteService estudidanteService;

        //Buscar un estudiante por su código
        @GetMapping( "/buscarEstudianteBycodigo" )
        public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
            return this.estudidanteService.obtenerEstudiantePorCodigo (codigo);
        }

    @GetMapping( "/buscarEstudianteBynombre" )
    public Estudiante buscarEstudianteBynombre(@RequestParam String nombre) {
        return this.estudidanteService.obtenerEstudiantePornombre (nombre);
    }
       /*@GetMapping("/listarByAppnombre/{appnombre}")
        public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
            return this.estudidanteService.listarEstudiantePorApeNombre(appnombre);
        }*/


}
