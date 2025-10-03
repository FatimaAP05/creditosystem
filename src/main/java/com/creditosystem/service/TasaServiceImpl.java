package com.creditosystem.service;

import com.creditosystem.model.Tasa;
import com.creditosystem.repository.TasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasaServiceImpl implements TasaService {

    @Autowired
    private TasaRepository tasaRepository;

    @Override
    public List<Tasa> findAll() {
        return tasaRepository.findAll();
    }

    @Override
    public Optional<Tasa> findById(Long id) {
        return tasaRepository.findById(id);
    }

    @Override
    public Tasa save(Tasa tasa) {
        return tasaRepository.save(tasa);
    }

    @Override
    public void deleteById(Long id) {
        tasaRepository.deleteById(id);
    }
}