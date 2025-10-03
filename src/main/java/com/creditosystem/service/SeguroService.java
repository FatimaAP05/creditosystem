package com.creditosystem.service;

import com.creditosystem.model.Seguro;

import java.util.List;
import java.util.Optional;

public interface SeguroService {
    List<Seguro> findAll();
    Optional<Seguro> findById(Long id);
    Seguro save(Seguro seguro);
    void deleteById(Long id);
}