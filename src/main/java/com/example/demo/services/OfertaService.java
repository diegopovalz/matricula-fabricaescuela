package com.example.demo.services;

import com.example.demo.dto.MateriaDto;
import com.example.demo.dto.OfertaDto;
import com.example.demo.models.MateriaOfertaModel;
import com.example.demo.models.OfertaModel;
import com.example.demo.repositories.MateriaOfertaRepository;
import com.example.demo.repositories.MateriaRepository;
import com.example.demo.repositories.OfertaRepository;
import com.example.demo.utils.Factories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfertaService {

    @Autowired
    OfertaRepository ofertaRepository;

    @Autowired
    MateriaOfertaRepository materiaOfertaRepository;

    @Autowired
    MateriaRepository materiaRepository;

    public OfertaDto obtenerPorId(Integer idOferta) {

        OfertaModel oferta = ofertaRepository.findById(idOferta).get();
        List<MateriaOfertaModel> materiasIdList = materiaOfertaRepository.findByOfertasId(oferta.getId());
        List<MateriaDto> materiasList = materiasIdList.stream()
                .map(materiaOferta -> materiaRepository.findById(materiaOferta.getMateriasId()).get())
                .map(Factories::materiaFactory)
                .collect(Collectors.toList());

        return Factories.ofertaFactory(oferta, materiasList);
    }
}
