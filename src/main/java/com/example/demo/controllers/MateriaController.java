package com.example.demo.controllers;

import com.example.demo.dto.MateriaGrupoDto;
import com.example.demo.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public List<MateriaGrupoDto> obtenerMateriaPorCodigo(@RequestParam("codigo") Integer codigo) {
        return this.materiaService.obtenerPorCodigo(codigo);
    }

}