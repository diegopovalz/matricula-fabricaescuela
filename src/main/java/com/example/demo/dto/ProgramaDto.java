package com.example.demo.dto;

public class ProgramaDto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer duracionSemestres;

    public ProgramaDto(Integer id, String nombre, String descripcion, Integer duracionSemestres) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionSemestres = duracionSemestres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDuracionSemestres() {
        return duracionSemestres;
    }

    public void setDuracionSemestres(Integer duracionSemestres) {
        this.duracionSemestres = duracionSemestres;
    }
}
