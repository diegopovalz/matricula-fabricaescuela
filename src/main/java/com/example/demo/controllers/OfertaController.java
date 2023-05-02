package com.example.demo.controllers;

import com.example.demo.dto.OfertaDto;
import com.example.demo.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oferta")
public class OfertaController {

    @Autowired
    OfertaService ofertaService;

    @GetMapping()
    public OfertaDto obtenerOfertaPorId(@RequestParam("id") Integer id) {
        return ofertaService.obtenerPorId(id);
    }
}
