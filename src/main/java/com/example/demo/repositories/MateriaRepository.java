package com.example.demo.repositories;


import com.example.demo.models.MateriaModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends CrudRepository<MateriaModel, Integer> {
    @Query("select m  from OfertaModel o \n" +
            "inner join MateriaOfertaModel mo on mo.ofertasId = o.id \n" +
            "inner join MateriaModel m on m.id = mo.materiasId \n" +
            "where o.id = :ofertaId")
    List<MateriaModel> findByOfertaId(Integer ofertaId);

}