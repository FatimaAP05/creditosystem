package com.creditosystem.service;

import com.creditosystem.model.Bloqueo;
import com.creditosystem.repository.BloqueoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BloqueoServiceImpl implements BloqueoService {

    @Autowired
    private BloqueoRepository bloqueoRepository;

    @Override
    public List<Bloqueo> findAll() {
        return bloqueoRepository.findAll();
    }

    @Override
    public Optional<Bloqueo> findById(Long id) {
        return bloqueoRepository.findById(id);
    }

    @Override
    public Bloqueo save(Bloqueo bloqueo) {
        return bloqueoRepository.save(bloqueo);
    }

    @Override
    public void deleteById(Long id) {
        bloqueoRepository.deleteById(id);
    }
}