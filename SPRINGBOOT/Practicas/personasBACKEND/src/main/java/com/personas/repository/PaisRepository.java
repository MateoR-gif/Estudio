package com.personas.repository;

import com.personas.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long>{
    Pais getReferenceById(Long aLong);
}
