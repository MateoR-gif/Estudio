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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "estado_id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
}
