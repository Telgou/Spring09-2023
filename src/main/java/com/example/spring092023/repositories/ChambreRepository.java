package com.example.spring092023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring092023.entities.*;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocAndTypeChambre(Bloc bloc, TypeChambre typeChambre);

    List<Chambre> findByReservationsEstValide(boolean estValide);

    List<Chambre> findByBlocNomAndCapaciteBlocGreaterThan(String nomBloc, int capaciteMinimale);

}
