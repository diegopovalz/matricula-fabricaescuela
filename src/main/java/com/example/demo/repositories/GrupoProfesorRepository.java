package com.example.demo.repositories;

import com.example.demo.models.GrupoProfesorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoProfesorRepository extends CrudRepository<GrupoProfesorModel, Integer> {
    public GrupoProfesorModel findAllByGruposId(Integer gruposId);
}
