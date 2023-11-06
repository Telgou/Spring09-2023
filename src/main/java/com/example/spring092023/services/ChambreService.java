package com.example.spring092023.services;

import com.example.spring092023.entities.Bloc;
import com.example.spring092023.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Chambre;
import com.example.spring092023.repositories.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements iChambreService{

    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAllChambers() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepository.findBlocByNomBloc(nomBloc);
        List<Chambre> chambres = chambreRepository.findAllById(numChambre);

        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);
        }
        chambreRepository.saveAll(chambres);
        return blocRepository.save(bloc);
    }

    @Override
    public List<Chambre> getChambresParNomBloc ( String nomBloc ){
        List<Chambre> chambres = chambreRepository.findChambreByBlocNomBloc(nomBloc);
        return chambres;
    }





}
