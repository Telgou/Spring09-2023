package com.example.spring092023.services;
import com.example.spring092023.entities.*;
import java.util.*;


public interface iEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);

    void addEtudiants(List<Etudiant> etudiants);
}
