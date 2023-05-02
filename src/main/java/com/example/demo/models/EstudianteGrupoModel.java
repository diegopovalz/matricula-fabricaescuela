package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantegrupo")
public class EstudianteGrupoModel {

    @Id
    @Column(name = "EstudiantesId")
    private Integer estudiantesId;
    @Column(name = "GruposId")
    private Integer gruposId;

    public Integer getEstudiantesId() {
        return estudiantesId;
    }

    public void setEstudiantesId(Integer estudiantesId) {
        this.estudiantesId = estudiantesId;
    }

    public Integer getGruposId() {
        return gruposId;
    }

    public void setGruposId(Integer gruposId) {
        this.gruposId = gruposId;
    }
}
