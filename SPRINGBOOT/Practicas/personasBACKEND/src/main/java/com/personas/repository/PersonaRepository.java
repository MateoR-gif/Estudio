package com.personas.repository;

import com.personas.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Estado, Long>{

    Estado getReferenceById(Long aLong);
}
