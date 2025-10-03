package com.creditosystem.controller;

import com.creditosystem.model.UnidadInmobiliaria;
import com.creditosystem.service.UnidadInmobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unidadesinmobiliarias")
public class UnidadInmobiliariaController {

    @Autowired
    private UnidadInmobiliariaService unidadInmobiliariaService;

    @GetMapping
    public List<UnidadInmobiliaria> findAll() {
        return unidadInmobiliariaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UnidadInmobiliaria> findById(@PathVariable Long id) {
        return unidadInmobiliariaService.findById(id);
    }

    @PostMapping
    public UnidadInmobiliaria save(@RequestBody UnidadInmobiliaria unidadInmobiliaria) {
        return unidadInmobiliariaService.save(unidadInmobiliaria);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        unidadInmobiliariaService.deleteById(id);
    }
}