package com.example.spring092023.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Set;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;
    @ManyToOne(cascade = CascadeType.ALL)
    Bloc bloc;





    // Constructeur et accesseurs (getters) et mutateurs (setters)
    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}