package com.creditosystem.controller;

import com.creditosystem.model.Bloqueo;
import com.creditosystem.service.BloqueoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bloqueos")
public class BloqueoController {

    @Autowired
    private BloqueoService bloqueoService;

    @GetMapping
    public List<Bloqueo> findAll() {
        return bloqueoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Bloqueo> findById(@PathVariable Long id) {
        return bloqueoService.findById(id);
    }

    @PostMapping
    public Bloqueo save(@RequestBody Bloqueo bloqueo) {
        return bloqueoService.save(bloqueo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        bloqueoService.deleteById(id);
    }
}