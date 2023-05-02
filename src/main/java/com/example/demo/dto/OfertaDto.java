package com.example.demo.dto;

import java.util.List;

public class OfertaDto {

    private Integer id;
    private Integer topeMaximoCreditos;
    private List<MateriaDto> materiasList;

    public OfertaDto(Integer id, Integer topeMaximoCreditos, List<MateriaDto> materiasList) {
        this.id = id;
        this.topeMaximoCreditos = topeMaximoCreditos;
        this.materiasList = materiasList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopeMaximoCreditos() {
        return topeMaximoCreditos;
    }

    public void setTopeMaximoCreditos(Integer topeMaximoCreditos) {
        this.topeMaximoCreditos = topeMaximoCreditos;
    }

    public List<MateriaDto> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<MateriaDto> materiasList) {
        this.materiasList = materiasList;
    }
}
