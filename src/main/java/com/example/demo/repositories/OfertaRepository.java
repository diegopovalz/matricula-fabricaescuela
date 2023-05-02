package com.example.demo.repositories;

import com.example.demo.models.OfertaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepository extends CrudRepository<OfertaModel, Integer> {
}
