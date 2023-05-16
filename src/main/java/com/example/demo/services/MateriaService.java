package com.example.demo.services;

import com.example.demo.dto.HorarioDto;
import com.example.demo.dto.MateriaGrupoDto;
import com.example.demo.models.GrupoModel;
import com.example.demo.models.MateriaModel;
import com.example.demo.repositories.GrupoRepository;
import com.example.demo.repositories.HorarioRepository;
import com.example.demo.repositories.MateriaRepository;
import com.example.demo.utils.Factories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    @Autowired
    GrupoRepository grupoRepository;

    @Autowired
    HorarioRepository horarioRepository;

    //Obtiene las materias con un mismo código, este es el que me tocó a mi, obtener todos los horarios de una materia en especifico, durante la oferta
    public List<MateriaGrupoDto> obtenerPorCodigo(Integer codigo) {
        MateriaModel materia = materiaRepository.findById(codigo).get();
        ArrayList<GrupoModel> grupos = grupoRepository.findByMateriaId(codigo);
        return grupos.stream()
                .map(grupo -> new MateriaGrupoDto(grupo.getId(), materia.getId(), grupo.getModalidad(),
                        grupo.getNumeroGrupo(), grupo.getAula(), obtenerHorarioPorGrupoId(grupo.getId()), materia.getNombre(),
                        materia.getCreditos(), materia.getDescripcion())).collect(Collectors.toList());
    }

    private List<HorarioDto> obtenerHorarioPorGrupoId(Integer grupoId) {
        return Factories.horarioToDtoFactory(horarioRepository.findByGrupoId(grupoId));
    }
}