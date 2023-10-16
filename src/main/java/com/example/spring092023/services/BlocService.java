package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Bloc;
import com.example.spring092023.repositories.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements iBlocService{
    //    EtudiantRespository etudiantRespository;

    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public Bloc updateBloc(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}
