package com.example.demo.dto;

public class EstudianteDto {

    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer nroPensum;
    private Integer nroSemestre;
    private Integer ofertaId;
    private ProgramaDto programa;
    private TandaDto tanda;

    public EstudianteDto(Integer id, String nombres, String apellidos, Integer nroPensum, Integer nroSemestre, Integer ofertaId, ProgramaDto programa, TandaDto tanda) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroPensum = nroPensum;
        this.nroSemestre = nroSemestre;
        this.ofertaId = ofertaId;
        this.programa = programa;
        this.tanda = tanda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Integer ofertaId) {
        this.ofertaId = ofertaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public ProgramaDto getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaDto programa) {
        this.programa = programa;
    }

    public TandaDto getTanda() {
        return tanda;
    }

    public void setTanda(TandaDto tanda) {
        this.tanda = tanda;
    }
}
