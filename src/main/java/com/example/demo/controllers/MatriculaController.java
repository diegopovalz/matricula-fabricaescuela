package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.dto.MatriculaDto;
import com.example.demo.models.MateriaModel;
import com.example.demo.models.MatriculaModel;
import com.example.demo.services.MateriaService;
import com.example.demo.services.MatriculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    MateriaService materiaService;

    @Autowired
    MatriculaService matriculaService;

    @PostMapping()
    public MatriculaDto matricularMateria(@RequestBody MatriculaDto matriculaDto) {
        return this.matriculaService.guardarMatricula(matriculaDto);
    }

    @GetMapping()
    public MatriculaDto obtenerMatricula(@RequestParam("id") Integer id) {
        return this.matriculaService.obtenerMatricula(id);
    }

}
