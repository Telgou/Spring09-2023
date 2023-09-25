package com.example.spring092023.entities;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}