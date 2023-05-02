package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.MateriaModel;
import com.example.demo.services.MateriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Ruta rar, y los nombres
@RestController
@RequestMapping("/oferta")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public ArrayList<MateriaModel> obtenerMaterias(){
        return materiaService.obtenerMaterias();
    }

    @PostMapping()
    public MateriaModel guardarMateria(@RequestBody MateriaModel materia){
        return this.materiaService.guardarMateria(materia);
    }

    @GetMapping( path = "/{id}")
    public Optional<MateriaModel> obtenerMateriaPorId(@PathVariable("id") Integer id) {
        return this.materiaService.obtenerPorId(id);
    }

    @GetMapping("/materia")
    public ArrayList<MateriaModel> obtenerMateriaPorCodigo(@RequestParam("codigo") Integer codigo){
        return this.materiaService.obtenerPorCodigo(codigo);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("grupo") Integer id){
        boolean ok = this.materiaService.eliminarMateria(id);
        if (ok){
            return "Se eliminó la materia con id " + id;
        }else{
            return "No pudo eliminar la materia con grupo" + id;
        }
    }

}