package com.personas.repository;

import com.personas.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository; //Importo el repositorio JPA

public interface EstadoRepository extends JpaRepository<Estado, Long>{

    Estado getReferenceById(Long aLong);
}
