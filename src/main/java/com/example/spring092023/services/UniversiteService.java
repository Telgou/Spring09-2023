package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Universite;
import com.example.spring092023.repositories.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteService implements iUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversites(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite updateUniversites(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversites(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversites(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }
}
