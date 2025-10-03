package com.creditosystem.repository;

import com.creditosystem.model.Bloqueo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloqueoRepository extends JpaRepository<Bloqueo, Long> {
}