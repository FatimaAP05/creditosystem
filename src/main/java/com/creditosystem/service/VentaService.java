package com.creditosystem.service;

import com.creditosystem.model.Venta;
import java.util.List;
import java.util.Optional;

public interface VentaService {
    List<Venta> findAll();
    Optional<Venta> findById(Long id);
    Venta save(Venta venta);
    void deleteById(Long id);
}