package com.aplicacionbusqueda.repositories;

import com.aplicacionbusqueda.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository  extends JpaRepository<Cancion,Long> {
}
