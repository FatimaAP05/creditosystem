package com.creditosystem.controller;

import com.creditosystem.model.Tasa;
import com.creditosystem.service.TasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasas")
public class TasaController {

    @Autowired
    private TasaService tasaService;

    @GetMapping
    public List<Tasa> findAll() {
        return tasaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tasa> findById(@PathVariable Long id) {
        return tasaService.findById(id);
    }

    @PostMapping
    public Tasa save(@RequestBody Tasa tasa) {
        return tasaService.save(tasa);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tasaService.deleteById(id);
    }
}