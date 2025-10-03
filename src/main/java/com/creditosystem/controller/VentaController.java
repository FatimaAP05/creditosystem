package com.creditosystem.controller;

import com.creditosystem.model.Venta;
import com.creditosystem.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> findAll() {
        return ventaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Long id) {
        return ventaService.findById(id);
    }

    @PostMapping
    public Venta save(@RequestBody Venta venta) {
        return ventaService.save(venta);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        ventaService.deleteById(id);
    }
}