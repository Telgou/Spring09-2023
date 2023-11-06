package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Foyer;
import com.example.spring092023.repositories.FoyerRespository;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService implements iFoyerService{

    private final FoyerRespository foyerRespository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRespository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRespository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRespository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRespository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRespository.deleteById(idFoyer);
    }
    public void archiverFoyer (long idFoyer){
        Foyer foyer = foyerRespository.findById(idFoyer).get();
        foyer.setArchived(true);
        foyerRespository.save(foyer);
    };
}
