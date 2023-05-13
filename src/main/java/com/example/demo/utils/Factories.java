package com.example.demo.utils;

import com.example.demo.dto.*;
import com.example.demo.models.*;

import java.util.List;
import java.util.stream.Collectors;

public class Factories {

    public static ProgramaDto programaFactory(ProgramaModel programaModel){
        return new ProgramaDto(programaModel.getId(), programaModel.getNombre(), programaModel.getDescripcion(), programaModel.getDuracionSemestres());
    }

    public static TandaDto tandaFactory(TandaModel tandaModel){
        return new TandaDto(tandaModel.getId(), tandaModel.getNumero(), tandaModel.getHorario());
    }

    public static MateriaDto materiaFactory(MateriaModel materiaModel){
        return new MateriaDto(materiaModel.getId(), materiaModel.getNombre(), materiaModel.getCreditos(), materiaModel.getDescripcion());
    }

    public static OfertaDto ofertaFactory(OfertaModel ofertaModel, List<MateriaDto> materiaDtoList){
        return new OfertaDto(ofertaModel.getId(), ofertaModel.getTopeMaximoCreditos(), materiaDtoList);
    }

    public static List<HorarioDto> horarioFactory(List<HorarioModel> horariosModel){
        return horariosModel.stream()
                .map(horario -> new HorarioDto(horario.getId(), horario.getDiaSemana(), horario.getHoraInicio(), horario.getHoraFin()))
                .collect(Collectors.toList());
    }
}
