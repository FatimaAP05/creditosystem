package com.creditosystem.service;

import com.creditosystem.model.Auditoria;

import java.util.List;
import java.util.Optional;

public interface AuditoriaService {
    List<Auditoria> findAll();
    Optional<Auditoria> findById(Long id);
    Auditoria save(Auditoria auditoria);
    void deleteById(Long id);
}