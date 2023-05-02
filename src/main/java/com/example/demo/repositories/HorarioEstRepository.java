package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.HorarioEstModel;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioEstRepository extends CrudRepository<HorarioEstModel, Integer>{
    
}
