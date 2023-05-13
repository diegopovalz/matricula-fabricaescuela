package com.example.demo.controllers;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/{id}")
    public EstudianteDto obtenerEstudiantePorIdentificacion(@PathVariable("id") Integer id) {
        return estudianteService.obtenerPorIdentificacion(id);
    }
}
