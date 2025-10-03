package com.creditosystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Bloqueo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaBloqueo;
    private String motivo;
    private Long idUnidadInmobiliaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Date fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Long getIdUnidadInmobiliaria() {
        return idUnidadInmobiliaria;
    }

    public void setIdUnidadInmobiliaria(Long idUnidadInmobiliaria) {
        this.idUnidadInmobiliaria = idUnidadInmobiliaria;
    }
}