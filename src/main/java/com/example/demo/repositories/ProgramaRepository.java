package com.example.demo.repositories;

import com.example.demo.models.ProgramaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends CrudRepository<ProgramaModel, Integer> {
}
