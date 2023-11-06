package com.example.spring092023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring092023.entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :bid AND c.typeC = 'DOUBLE'")
    List<Chambre> findDoubleChambresInBloc(@Param("bid") Long blocId);
    @Query("SELECT c FROM Chambre c JOIN c.Reservations r WHERE r.estValide = :estvalide")
    List<Chambre> findChambresByValidation(@Param("estvalide") boolean estValide);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.nomBloc = :nombloc ")
    List<Chambre> findChambreByBlocNomBloc(@Param("nombloc") String nombloc);


}
