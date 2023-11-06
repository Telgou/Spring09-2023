package com.example.spring092023.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    private boolean archived = false;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "foyer")
    private List<Bloc> bloc;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;



}