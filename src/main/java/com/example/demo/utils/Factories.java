package com.example.demo.utils;

import com.example.demo.dto.*;
import com.example.demo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Factories {

    public static ProgramaDto programaToDtoFactory(ProgramaModel programaModel) {
        return new ProgramaDto(programaModel.getId(), programaModel.getNombre(), programaModel.getDescripcion(), programaModel.getDuracionSemestres());
    }

    public static TandaDto tandaToDtoFactory(TandaModel tandaModel) {
        return new TandaDto(tandaModel.getId(), tandaModel.getNumero(), tandaModel.getHorario());
    }

    public static MateriaDto materiaToDtoFactory(MateriaModel materiaModel) {
        return new MateriaDto(materiaModel.getId(), materiaModel.getNombre(), materiaModel.getCreditos(), materiaModel.getDescripcion());
    }

    public static OfertaDto ofertaToDtoFactory(OfertaModel ofertaModel, List<MateriaDto> materiaDtoList) {
        return new OfertaDto(ofertaModel.getId(), ofertaModel.getTopeMaximoCreditos(), materiaDtoList);
    }

    public static List<HorarioDto> horarioToDtoFactory(List<HorarioModel> horariosModel) {
        return horariosModel.stream()
                .map(horario -> new HorarioDto(horario.getId(), horario.getDiaSemana(), horario.getHoraInicio(), horario.getHoraFin()))
                .collect(Collectors.toList());
    }

    public static MatriculaDto matriculaToDtoFatory(MatriculaModel matriculaModel, List<GrupoMatriculaModel> grupoMatriculaModelList) {
        List<Integer> gruposId = new ArrayList<>();
        grupoMatriculaModelList.forEach(grupoMatriculaModel -> gruposId.add(grupoMatriculaModel.getGrupoMatriculaKey().getGruposId()));
        return new MatriculaDto(matriculaModel.getEstudianteId(), matriculaModel.getSemestre(), gruposId);
    }

    /*public static MatriculaModel matriculaToModel(MatriculaDto matriculaDto){

        List<GrupoModel> grupoModelList = new ArrayList<>();
        matriculaDto.getGruposId().stream()
                .map(grupoId -> new GrupoModel().setId(grupoId))


        MatriculaModel matriculaModel = new MatriculaModel();
        matriculaModel.setEstudianteId(matriculaDto.getEstudianteId());
        matriculaModel.setSemestre(matriculaDto.getSemestre());
        matriculaModel.setGruposId();
        return matriculaModel;
    }*/
}
