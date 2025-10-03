package com.creditosystem.repository;

import com.creditosystem.model.Tasa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasaRepository extends JpaRepository<Tasa, Long> {
}