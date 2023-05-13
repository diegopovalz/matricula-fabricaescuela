package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "grupo")
public class GrupoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "MateriaId")
    private Integer materiaId;
    @Column(name = "Modalidad")
    private String modalidad;
    @Column(name = "CreatedOn")
    private String fechaCreacion;
    @Column(name = "UpdatedOn")
    private String fechaActualizacion;
    @Column(name = "NumeroGrupo")
    private Integer numeroGrupo;
    @Column(name = "Aula")
    private String aula;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMateriaId() {
        return materiaId;
    }
    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }
    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }
    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }
    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
}