package com.aplicacionbusqueda.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DeezerResponse  {
    @JsonProperty("data")
    private List<DeezerData> datos;

    public List<DeezerData> getDatos() {
        return datos;
    }

    public void setDatos(List<DeezerData> datos) {
        this.datos = datos;
    }
}
