package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.MateriaModel;
import com.example.demo.services.MateriaService;
import com.example.demo.services.MatriculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    MateriaService materiaService;

    @Autowired
    MatriculaService matriculaService;

    //Cambiar para que solo muestre las que tienen cupos
    //@GetMapping("/materia")
    //public ArrayList<MateriaModel> obtenerMateriaPorCodigo(@RequestParam("codigo") Integer codigo){
      //  return this.materiaService.obtenerPorCodigo(codigo);
    //}

    //Al agregar se debe guardar con un cupo menos
    //@PostMapping()
    //public void transformarMateria(MateriaModel materia){
        //this.matriculaService.transformarMateria(materia);
    //}
    
}
