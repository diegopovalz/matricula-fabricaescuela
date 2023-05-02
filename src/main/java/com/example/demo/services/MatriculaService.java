package com.example.demo.services;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositories.HorarioEstRepository;
import com.example.demo.repositories.MateriaRepository;
//import com.example.demo.models.HorarioEstModel;
//import com.example.demo.models.MateriaModel;

@Service
public class MatriculaService {

    @Autowired
    HorarioEstRepository horarioEstRepository;

    @Autowired
    MateriaRepository materiaRepository;

    //public void transformarMateria(MateriaModel materia){

       // HorarioEstModel materiaEnHorario = new HorarioEstModel(materia.getid(), materia.getGrupo(), materia.getNombre(), materia.getCreditos(), materia.getCodigo(), materia.getHorario(), materia.getAula(), materia.getProfesor());
    
        //horarioEstRepository.save(materiaEnHorario);

        
    //}
}
