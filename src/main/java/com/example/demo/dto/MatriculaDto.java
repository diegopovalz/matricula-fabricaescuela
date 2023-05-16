package com.example.demo.dto;

import java.util.List;

public class MatriculaDto {
    private Integer estudianteId;
    private String semestre;
    private List<Integer> gruposId;

    public MatriculaDto(Integer estudianteId, String semestre, List<Integer> gruposId) {
        this.estudianteId = estudianteId;
        this.semestre = semestre;
        this.gruposId = gruposId;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<Integer> getGruposId() {
        return gruposId;
    }

    public void setGruposId(List<Integer> gruposId) {
        this.gruposId = gruposId;
    }
}
