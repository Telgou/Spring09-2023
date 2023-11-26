package com.example.spring092023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring092023.entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface FoyerRespository extends JpaRepository<Foyer,Long> {

    //@Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.nomFoyer = :nomfoyer AND c.typeC = :typec AND c NOT IN (SELECT r.chambre FROM Reservation r WHERE year(r.anneeUniversitaire) = :date)")
    //List<Chambre> findChambresNONReserveByFoyerNameAndChambresTypeC(@Param("nomfoyer") String nomfoyer,@Param("typec") TypeChambre typec, @Param("date") int date);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.nomFoyer = :nomfoyer AND c.typeC = :typec AND NOT EXISTS (SELECT r FROM Reservation r WHERE r.chambre.idChambre = c.idChambre AND year(r.anneeUniversitaire) = :date)")
    List<Chambre> findChambresNONReserveByFoyerNameAndChambresTypeC(@Param("nomfoyer") String nomfoyer,@Param("typec") TypeChambre typec, @Param("date") int date);

}
