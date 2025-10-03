package com.creditosystem.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaVenta;
    private Double monto;

    @ManyToOne
    private UnidadInmobiliaria unidadInmobiliaria;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public UnidadInmobiliaria getUnidadInmobiliaria() {
        return unidadInmobiliaria;
    }

    public void setUnidadInmobiliaria(UnidadInmobiliaria unidadInmobiliaria) {
        this.unidadInmobiliaria = unidadInmobiliaria;
    }
}
