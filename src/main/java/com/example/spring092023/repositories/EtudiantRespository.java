package com.example.spring092023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring092023.entities.*;

import java.util.List;


public interface EtudiantRespository extends JpaRepository<Etudiant,Long> {
    //List<Etudiant> addEtudiants (List<Etudiant> etudiants);


}
