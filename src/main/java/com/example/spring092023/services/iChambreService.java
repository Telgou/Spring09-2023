package com.example.spring092023.services;

import com.example.spring092023.entities.Bloc;
import com.example.spring092023.entities.Chambre;
import com.example.spring092023.entities.TypeChambre;

import java.util.List;

public interface iChambreService {
    List<Chambre> retrieveAllChambers();

    Chambre addChambre(Chambre e);

    Chambre updateChambre(Chambre e);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);

    Bloc affecterChambresABloc (List<Long> numChambre, String nomBloc) ;

    List<Chambre> getChambresParNomBloc ( String nomBloc );

    long nbChambreParTypeEtBloc(TypeChambre type, long idBloc );

}
