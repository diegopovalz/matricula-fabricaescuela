package com.example.demo.repositories;

import com.example.demo.models.GrupoMatriculaKey;
import com.example.demo.models.GrupoMatriculaModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoMatriculaRepository extends CrudRepository<GrupoMatriculaModel, GrupoMatriculaKey> {
    @Query("select gmm from GrupoMatriculaModel gmm where gmm.grupoMatriculaKey.matriculasId = :matriculasId")
    List<GrupoMatriculaModel> findByMatriculasId(Integer matriculasId);
}
