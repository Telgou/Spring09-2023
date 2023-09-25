package com.example.spring092023.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.reflect.Type;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeC;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}