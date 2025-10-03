package com.creditosystem.repository;

import com.creditosystem.model.UnidadInmobiliaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadInmobiliariaRepository extends JpaRepository<UnidadInmobiliaria, Long> {
}