package com.example.demo.repositories;

import com.example.demo.models.MatriculaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends CrudRepository<MatriculaModel, Integer> {
}
