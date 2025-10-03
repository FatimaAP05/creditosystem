package com.creditosystem.service;

import com.creditosystem.model.Seguro;
import com.creditosystem.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeguroServiceImpl implements SeguroService {

    @Autowired
    private SeguroRepository seguroRepository;

    @Override
    public List<Seguro> findAll() {
        return seguroRepository.findAll();
    }

    @Override
    public Optional<Seguro> findById(Long id) {
        return seguroRepository.findById(id);
    }

    @Override
    public Seguro save(Seguro seguro) {
        return seguroRepository.save(seguro);
    }

    @Override
    public void deleteById(Long id) {
        seguroRepository.deleteById(id);
    }
}