package com.creditosystem.service;

import com.creditosystem.model.Credito;
import com.creditosystem.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditoServiceImpl implements CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public List<Credito> findAll() {
        return creditoRepository.findAll();
    }

    @Override
    public Optional<Credito> findById(Long id) {
        return creditoRepository.findById(id);
    }

    @Override
    public Credito save(Credito credito) {
        return creditoRepository.save(credito);
    }

    @Override
    public void deleteById(Long id) {
        creditoRepository.deleteById(id);
    }
}