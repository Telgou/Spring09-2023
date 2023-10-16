package com.example.spring092023.services;

import com.example.spring092023.entities.Reservation;

import java.util.List;

public interface iReservationService {

    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation e);

    Reservation updateReservation(Reservation e);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

}
