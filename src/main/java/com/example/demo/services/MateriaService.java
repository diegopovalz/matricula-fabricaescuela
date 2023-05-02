package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.dto.MateriaGrupoDto;
import com.example.demo.models.GrupoModel;
import com.example.demo.models.MateriaModel;
import com.example.demo.repositories.GrupoRepository;
import com.example.demo.repositories.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    @Autowired
    GrupoRepository grupoRepository;


    //Obtiene todas las materias, esto es consultar oferta
    public ArrayList<MateriaModel> obtenerMaterias(){
        return (ArrayList<MateriaModel>) materiaRepository.findAll();
    }

    //Guarda una materia que se pasa
    public MateriaModel guardarMateria(MateriaModel materia){
        return materiaRepository.save(materia);
    }

    //Obtiene una materia por el id, que sería la clave primaria entonces es único
    public Optional<MateriaModel> obtenerPorId(Integer id){
        return materiaRepository.findById(id);
    }

    //Obtiene las materias con un mismo código, este es el que me tocó a mi, obtener todos los horarios de una materia en especifico, durante la oferta
    public List<MateriaGrupoDto>  obtenerPorCodigo(Integer codigo) {
        MateriaModel materia = materiaRepository.findById(codigo).get();
        ArrayList <GrupoModel> grupos = grupoRepository.findByMateriaId(codigo);
        List <MateriaGrupoDto> listaGrupos = grupos.stream().map(grupo ->new MateriaGrupoDto(grupo.getId(), materia.getId(), grupo.getModalidad(), grupo.getNumeroGrupo(), 
        grupo.getAula(), grupo.getHorario(), materia.getNombre(), materia.getCreditos(), materia.getDescripcion())).collect(Collectors.toList());

        return listaGrupos;
    }

    //Elimina materia con grupo
    public boolean eliminarMateria(Integer id) {
        try{
            materiaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    //Obtener todas las materias por codigo, guardar una materia en horarioEstudiante


    
}