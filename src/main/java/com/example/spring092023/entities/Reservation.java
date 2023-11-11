package com.example.spring092023.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private Boolean estValide;


    @ManyToMany()
    private List<Etudiant> etudiants;
    @ManyToOne()
    Chambre chambre;


}