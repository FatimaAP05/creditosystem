package com.creditosystem.service;

import com.creditosystem.model.Bloqueo;

import java.util.List;
import java.util.Optional;

public interface BloqueoService {
    List<Bloqueo> findAll();
    Optional<Bloqueo> findById(Long id);
    Bloqueo save(Bloqueo bloqueo);
    void deleteById(Long id);
}