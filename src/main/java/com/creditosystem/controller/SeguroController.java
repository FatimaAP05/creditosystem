package com.creditosystem.controller;

import com.creditosystem.model.Seguro;
import com.creditosystem.service.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seguros")
public class SeguroController {

    @Autowired
    private SeguroService seguroService;

    @GetMapping
    public List<Seguro> findAll() {
        return seguroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Seguro> findById(@PathVariable Long id) {
        return seguroService.findById(id);
    }

    @PostMapping
    public Seguro save(@RequestBody Seguro seguro) {
        return seguroService.save(seguro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        seguroService.deleteById(id);
    }
}