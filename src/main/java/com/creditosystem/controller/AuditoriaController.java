package com.creditosystem.controller;

import com.creditosystem.model.Auditoria;
import com.creditosystem.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auditorias")
public class AuditoriaController {

    @Autowired
    private AuditoriaService auditoriaService;

    @GetMapping
    public List<Auditoria> findAll() {
        return auditoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Auditoria> findById(@PathVariable Long id) {
        return auditoriaService.findById(id);
    }

    @PostMapping
    public Auditoria save(@RequestBody Auditoria auditoria) {
        return auditoriaService.save(auditoria);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        auditoriaService.deleteById(id);
    }
}