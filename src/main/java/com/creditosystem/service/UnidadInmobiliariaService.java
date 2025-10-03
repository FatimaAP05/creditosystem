package com.creditosystem.service;

import com.creditosystem.model.UnidadInmobiliaria;

import java.util.List;
import java.util.Optional;

public interface UnidadInmobiliariaService {
    List<UnidadInmobiliaria> findAll();
    Optional<UnidadInmobiliaria> findById(Long id);
    UnidadInmobiliaria save(UnidadInmobiliaria unidadInmobiliaria);
    void deleteById(Long id);
}