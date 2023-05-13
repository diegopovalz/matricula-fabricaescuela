package com.example.demo.repositories;

import com.example.demo.models.HorarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends CrudRepository<HorarioModel, Integer> {

    public List<HorarioModel> findByGrupoId(Integer grupoId);
}
