package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.MateriaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<MateriaModel, Integer> {
    public abstract ArrayList<MateriaModel> findByCodigo(Integer codigo);

}