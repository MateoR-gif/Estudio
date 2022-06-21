/*
    * Autor: Mateo Rendón
    * Versión: 1.0
    * Fecha: 15/06/2022
 */


package com.personas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")

public class Persona {
    // Atributos
    @Id //Declara la variable id como el id de la tabla
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera un valor automático del Id
    @Column(name = "persona_id")
    private int id;
    @Column(name = "edad")
    private int edad;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
}
