package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materiaoferta")
public class MateriaOfertaModel {

    @Id
    @Column(name = "MateriasId")
    private Integer materiasId;
    @Column(name = "OfertasId")
    private Integer ofertasId;

    public Integer getMateriasId() {
        return materiasId;
    }

    public void setMateriasId(Integer materiasId) {
        this.materiasId = materiasId;
    }

    public Integer getOfertasId() {
        return ofertasId;
    }

    public void setOfertasId(Integer ofertasId) {
        this.ofertasId = ofertasId;
    }
}
