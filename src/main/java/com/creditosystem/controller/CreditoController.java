package com.creditosystem.controller;

import com.creditosystem.model.Credito;
import com.creditosystem.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/creditos")
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @GetMapping
    public List<Credito> findAll() {
        return creditoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Credito> findById(@PathVariable Long id) {
        return creditoService.findById(id);
    }

    @PostMapping
    public Credito save(@RequestBody Credito credito) {
        return creditoService.save(credito);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        creditoService.deleteById(id);
    }
}