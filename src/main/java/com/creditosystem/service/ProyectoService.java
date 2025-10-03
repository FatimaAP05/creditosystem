package com.creditosystem.service;

import com.creditosystem.model.Proyecto;
import java.util.List;
import java.util.Optional;

public interface ProyectoService {
    List<Proyecto> findAll();
    Optional<Proyecto> findById(Long id);
    Proyecto save(Proyecto proyecto);
    void deleteById(Long id);
}