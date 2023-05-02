package com.example.demo.dto;

public class MateriaGrupoDto {

    private Integer grupoId;
    private Integer materiaId;
    private String modalidad;
    private Integer numeroGrupo;
    private String aula;
    private String horario;
    private String nombre;
    private Integer creditos;
    private String descripcion;

    
    public MateriaGrupoDto(Integer grupoId, Integer materiaId, String modalidad, Integer numeroGrupo, String aula,
            String horario, String nombre, Integer creditos, String descripcion) {
        this.grupoId = grupoId;
        this.materiaId = materiaId;
        this.modalidad = modalidad;
        this.numeroGrupo = numeroGrupo;
        this.aula = aula;
        this.horario = horario;
        this.nombre = nombre;
        this.creditos = creditos;
        this.descripcion = descripcion;
    }

    public Integer getGrupoId() {
        return grupoId;
    }
    public void setGrupoId(Integer grupoId) {
        this.grupoId = grupoId;
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
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCreditos() {
        return creditos;
    }
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
