package com.creditosystem.service;

import com.creditosystem.model.UnidadInmobiliaria;
import com.creditosystem.repository.UnidadInmobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadInmobiliariaServiceImpl implements UnidadInmobiliariaService {

    @Autowired
    private UnidadInmobiliariaRepository unidadInmobiliariaRepository;

    @Override
    public List<UnidadInmobiliaria> findAll() {
        return unidadInmobiliariaRepository.findAll();
    }

    @Override
    public Optional<UnidadInmobiliaria> findById(Long id) {
        return unidadInmobiliariaRepository.findById(id);
    }

    @Override
    public UnidadInmobiliaria save(UnidadInmobiliaria unidadInmobiliaria) {
        return unidadInmobiliariaRepository.save(unidadInmobiliaria);
    }

    @Override
    public void deleteById(Long id) {
        unidadInmobiliariaRepository.deleteById(id);
    }
}