package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Foyer;
import com.example.spring092023.repositories.FoyerRespository;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService implements iFoyerService{

    FoyerRespository foyerRespository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRespository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRespository.save(e);
    }

    @Override
    public Foyer updateFoyer(Foyer e) {
        return foyerRespository.save(e);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRespository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRespository.deleteById(idFoyer);

    }
}
