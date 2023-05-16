package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GrupoMatriculaKey implements Serializable {

    @Column(name = "GruposId")
    private Integer gruposId;
    @Column(name = "MatriculasId")
    private Integer matriculasId;

    public GrupoMatriculaKey(Integer gruposId, Integer matriculasId) {
        this.gruposId = gruposId;
        this.matriculasId = matriculasId;
    }

    public GrupoMatriculaKey() {
    }

    public Integer getGruposId() {
        return gruposId;
    }

    public void setGruposId(Integer gruposId) {
        this.gruposId = gruposId;
    }

    public Integer getMatriculasId() {
        return matriculasId;
    }

    public void setMatriculasId(Integer matriculasId) {
        this.matriculasId = matriculasId;
    }
}

