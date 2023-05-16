package com.example.demo.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "grupomatricula")
public class GrupoMatriculaModel {

    @EmbeddedId
    private GrupoMatriculaKey grupoMatriculaKey;

    public GrupoMatriculaModel(GrupoMatriculaKey grupoMatriculaKey) {
        this.grupoMatriculaKey = grupoMatriculaKey;
    }

    public GrupoMatriculaModel() {
    }

    public GrupoMatriculaKey getGrupoMatriculaKey() {
        return grupoMatriculaKey;
    }

    public void setGrupoMatriculaKey(GrupoMatriculaKey grupoMatriculaKey) {
        this.grupoMatriculaKey = grupoMatriculaKey;
    }
}
