package com.example.spring092023.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.spring092023.entities.Reservation;
import com.example.spring092023.repositories.ReservationRespository;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements  iReservationService{

    ReservationRespository reservationRespository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRespository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return reservationRespository.save(e);
    }

    @Override
    public Reservation updateReservation(Reservation e) {
        return reservationRespository.save(e);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRespository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRespository.deleteById(idReservation);

    }
    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut , Date dateFin ){
        return (reservationRespository.findReservationByAnneeUniversitaire(dateDebut,dateFin));
    }

}
