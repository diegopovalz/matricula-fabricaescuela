package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {

    @Id
    @Column(name = "Id")
    private Integer id;
    @Column(name = "TandaId")
    private Integer tandaId;
    @Column(name = "ProgramaId")
    private Integer programaId;
    @Column(name = "OfertaId")
    private Integer ofertaId;
    @Column(name = "NroPensum")
    private Integer nroPensum;
    @Column(name = "NroSemestre")
    private Integer nroSemestre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTandaId() {
        return tandaId;
    }

    public void setTandaId(Integer tandaId) {
        this.tandaId = tandaId;
    }

    public Integer getProgramaId() {
        return programaId;
    }

    public void setProgramaId(Integer programaId) {
        this.programaId = programaId;
    }

    public Integer getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Integer ofertaId) {
        this.ofertaId = ofertaId;
    }

    public Integer getNroPensum() {
        return nroPensum;
    }

    public void setNroPensum(Integer nroPensum) {
        this.nroPensum = nroPensum;
    }

    public Integer getNroSemestre() {
        return nroSemestre;
    }

    public void setNroSemestre(Integer nroSemestre) {
        this.nroSemestre = nroSemestre;
    }
}
