package com.example.demo.utils;

import com.example.demo.dto.MateriaDto;
import com.example.demo.dto.OfertaDto;
import com.example.demo.dto.ProgramaDto;
import com.example.demo.dto.TandaDto;
import com.example.demo.models.MateriaModel;
import com.example.demo.models.OfertaModel;
import com.example.demo.models.ProgramaModel;
import com.example.demo.models.TandaModel;

import java.util.List;

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
}
