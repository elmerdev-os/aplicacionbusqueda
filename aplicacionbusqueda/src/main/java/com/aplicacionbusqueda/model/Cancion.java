package com.aplicacionbusqueda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String artista;
    private String enlaceAdelanto;

    public Cancion() {
    }

    public Cancion(Long id, String titulo, String artista, String enlaceAdelanto) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.enlaceAdelanto = enlaceAdelanto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEnlaceAdelanto() {
        return enlaceAdelanto;
    }

    public void setEnlaceAdelanto(String enlaceAdelanto) {
        this.enlaceAdelanto = enlaceAdelanto;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", enlaceAdelanto='" + enlaceAdelanto + '\'' +
                '}';
    }
}