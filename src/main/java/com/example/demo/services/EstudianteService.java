package com.example.demo.services;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.models.EstudianteModel;
import com.example.demo.models.ProgramaModel;
import com.example.demo.models.TandaModel;
import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo.utils.Factories.programaToDtoFactory;
import static com.example.demo.utils.Factories.tandaToDtoFactory;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ProgramaRepository programaRepository;

    @Autowired
    TandaRepository tandaRepository;

    @Autowired
    OfertaRepository ofertaRepository;

    @Autowired
    MateriaOfertaRepository materiaOfertaRepository;

    @Autowired
    MateriaRepository materiaRepository;

    public EstudianteDto obtenerPorIdentificacion(Integer identificacionEstudiante) {
        EstudianteModel estudiante = estudianteRepository.findById(identificacionEstudiante).get();
        UsuarioModel usuario = usuarioRepository.findById(identificacionEstudiante).get();
        ProgramaModel programa = programaRepository.findById(estudiante.getProgramaId()).get();
        TandaModel tanda = tandaRepository.findById(estudiante.getTandaId()).get();

        return new EstudianteDto(estudiante.getId(), usuario.getNombres(), usuario.getApellidos(),
                estudiante.getNroPensum(), estudiante.getNroSemestre(), estudiante.getOfertaId(),
                programaToDtoFactory(programa), tandaToDtoFactory(tanda));
    }

}