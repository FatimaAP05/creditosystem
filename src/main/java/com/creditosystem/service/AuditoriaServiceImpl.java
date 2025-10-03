package com.creditosystem.service;

import com.creditosystem.model.Auditoria;
import com.creditosystem.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditoriaServiceImpl implements AuditoriaService {

    @Autowired
    private AuditoriaRepository auditoriaRepository;

    @Override
    public List<Auditoria> findAll() {
        return auditoriaRepository.findAll();
    }

    @Override
    public Optional<Auditoria> findById(Long id) {
        return auditoriaRepository.findById(id);
    }

    @Override
    public Auditoria save(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }

    @Override
    public void deleteById(Long id) {
        auditoriaRepository.deleteById(id);
    }
}