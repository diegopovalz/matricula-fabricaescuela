package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.GrupoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends CrudRepository<GrupoModel, Integer>{
    public abstract ArrayList<GrupoModel> findByMateriaId(Integer materiaId);
}
