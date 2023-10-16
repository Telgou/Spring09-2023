package com.example.spring092023.services;

import com.example.spring092023.entities.Etudiant;
import com.example.spring092023.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantServices implements IEudiantService{

    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
    return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
    return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
     return etudiantRepository.findById(idEtudiant).get();

    }

    @Override
    public void removeEtudiant(Long idEtudiant) {

    }
}
