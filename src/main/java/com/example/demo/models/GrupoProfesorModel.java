package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupoprofesor")
public class GrupoProfesorModel {

    @Id
    @Column(name = "GruposId")
    private Integer gruposId;
    @Column(name = "ProfesoresId")
    private Integer profesoresId;

    public Integer getGruposId() {
        return gruposId;
    }

    public void setGruposId(Integer gruposId) {
        this.gruposId = gruposId;
    }

    public Integer getProfesoresId() {
        return profesoresId;
    }

    public void setProfesoresId(Integer profesoresId) {
        this.profesoresId = profesoresId;
    }
}
