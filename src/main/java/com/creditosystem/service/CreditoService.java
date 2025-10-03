package com.creditosystem.service;

import com.creditosystem.model.Credito;

import java.util.List;
import java.util.Optional;

public interface CreditoService {
    List<Credito> findAll();
    Optional<Credito> findById(Long id);
    Credito save(Credito credito);
    void deleteById(Long id);
}