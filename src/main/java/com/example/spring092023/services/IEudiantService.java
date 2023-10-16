package com.example.spring092023.services;

import com.example.spring092023.entities.Etudiant;

import java.util.List;

public interface IEudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}
