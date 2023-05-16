package com.example.demo.services;

import com.example.demo.dto.MatriculaDto;
import com.example.demo.models.GrupoMatriculaKey;
import com.example.demo.models.GrupoMatriculaModel;
import com.example.demo.models.MatriculaModel;
import com.example.demo.repositories.GrupoMatriculaRepository;
import com.example.demo.repositories.MatriculaRepository;
import com.example.demo.utils.Factories;
import com.example.demo.utils.FormatDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    GrupoMatriculaRepository grupoMatriculaRepository;


    public MatriculaDto guardarMatricula(MatriculaDto matriculaDto) {
        MatriculaModel matriculaModel = new MatriculaModel();
        matriculaModel.setEstudianteId(matriculaDto.getEstudianteId());
        matriculaModel.setSemestre(matriculaDto.getSemestre());
        matriculaModel.setFechaActualizacion(FormatDate.generateDate());
        matriculaModel.setFechaCreacion(FormatDate.generateDate());

        MatriculaModel matriculaSave = matriculaRepository.save(matriculaModel);

        List<GrupoMatriculaModel> list = new ArrayList<>();
        for (int grupoId : matriculaDto.getGruposId()) {
            GrupoMatriculaModel gmm = new GrupoMatriculaModel(new GrupoMatriculaKey(grupoId, matriculaSave.getMatriculaId()));
            list.add(gmm);
        }
        grupoMatriculaRepository.saveAll(list);
        return matriculaDto;
    }

    public MatriculaDto obtenerMatricula(Integer id) {
        MatriculaModel matriculaModel = matriculaRepository.findById(id).get();
        List<GrupoMatriculaModel> grupoMatriculaModelList = grupoMatriculaRepository.findByMatriculasId(matriculaModel.getMatriculaId());
        return Factories.matriculaToDtoFatory(matriculaModel, grupoMatriculaModelList);
    }
}
