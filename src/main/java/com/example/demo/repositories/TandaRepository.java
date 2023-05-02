package com.example.demo.repositories;

import com.example.demo.models.TandaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TandaRepository extends CrudRepository<TandaModel, Integer> {
}
