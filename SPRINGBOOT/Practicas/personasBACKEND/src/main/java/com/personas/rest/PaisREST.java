package com.personas.rest;

import com.personas.model.Pais;
import com.personas.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Declara la clase como un controlador REST
@RequestMapping("/pais/") //Declara la url que el Front va a utilizar para comunicarse
public class PaisREST {
    @Autowired
    private PaisService paisService;

    @GetMapping //Declara que esto se ejecuta mediante peticiones GET
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }
}