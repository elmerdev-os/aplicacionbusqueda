package com.aplicacionbusqueda.service;

import com.aplicacionbusqueda.model.Cancion;
import com.aplicacionbusqueda.model.DeezerData;
import com.aplicacionbusqueda.model.DeezerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeezerService {
    private static final String DEEZER_API_URL = "https://api.deezer.com/search?q=%s";

    private final RestTemplate restTemplate;

    public DeezerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DeezerResponse buscarCanciones(String query) {
        String url = String.format(DEEZER_API_URL, query);
        ResponseEntity<DeezerResponse> responseEntity = restTemplate.getForEntity(url, DeezerResponse.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            throw new RuntimeException("Error al buscar canciones en Deezer");
        }
    }
}
