package com.aplicacionbusqueda.controllers;

import com.aplicacionbusqueda.model.DeezerResponse;
import com.aplicacionbusqueda.service.DeezerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeezerController {

    private final DeezerService deezerService;

    @Autowired
    public DeezerController(DeezerService deezerService) {
        this.deezerService = deezerService;
    }

    @GetMapping("/buscar")
    public DeezerResponse buscarCanciones(@RequestParam String query) {
        return (DeezerResponse) deezerService.buscarCanciones(query);
    }
}
