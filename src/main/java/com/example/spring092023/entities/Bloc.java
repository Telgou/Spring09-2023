package com.example.spring092023.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;


    @OneToMany(cascade = CascadeType.ALL ,mappedBy="bloc")
    private List<Chambre> chambres;
    @ManyToOne()
    Foyer foyer;




    // Constructeur et accesseurs (getters) et mutateurs (setters)
    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }
    public List<Chambre> getchambreslist() {
        return chambres;
    }
    public void setchambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }


    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
}