package com.creditosystem.service;

import com.creditosystem.model.Tasa;

import java.util.List;
import java.util.Optional;

public interface TasaService {
    List<Tasa> findAll();
    Optional<Tasa> findById(Long id);
    Tasa save(Tasa tasa);
    void deleteById(Long id);
}