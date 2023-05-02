package com.example.demo.controllers;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/{id}")
    public EstudianteDto obtenerEstudiantePorIdentificacion(@PathVariable("id") Integer id) {
        return estudianteService.obtenerPorIdentificacion(id);
    }
}
