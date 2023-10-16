package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Etudiant;
import com.example.spring092023.repositories.EtudiantRespository;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantService implements iEtudiantService{

    EtudiantRespository etudiantRespository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRespository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRespository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRespository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRespository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRespository.deleteById(idEtudiant);

    }
}
